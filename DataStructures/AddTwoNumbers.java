/**
 * LeetcodeProblems
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * @author Arihant Jain
 */

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode head1 = l1;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(2);

        ListNode l2 = new ListNode(4);
        ListNode head2 = l2;
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(5);

        ListNode l3 = addTwoNumbers(head1, head2);
        System.out.println(l3.toString());
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultPrev = new ListNode(0);
        ListNode current = resultPrev;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                sum += l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l2 != null) {
                sum += l2.val + carry;
                l2 = l2.next;
            } else {
                sum += l1.val + carry;
                l1 = l1.next;
            }
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return resultPrev.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder ret = new StringBuilder();
            ret.append(val);
            while (next != null) {
                ret.append(next.val);
                next = next.next;
            }
            return ret.reverse().toString();
        }
    }
}


