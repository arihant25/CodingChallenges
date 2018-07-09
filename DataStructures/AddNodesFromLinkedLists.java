/**
 * Cracking the coding interview
 * Input are two linked lists.
 * To output, Nth node from last.
 *
 * @author Arihant Jain
 */

public class AddNodesFromLinkedLists {
    static class Node {
        int data;
        Node next = null;

        Node(int d) {
            data = d;
        }

        void addToList(int d) {
            Node last = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = last;
        }
    }

    private static Node addLinkedLists(Node node1, Node node2) {
        Node answerNode = new Node(0);
        int remainder = 0;

        while (node1 != null || node2 != null) {
            answerNode.data = node1.data + node2.data + remainder;
            if (answerNode.data > 9) {
                remainder = 1;
                answerNode.data = answerNode.data - 10;
            } else {
                remainder = 0;
            }
            System.out.println(answerNode.data);
            node1 = node1.next;
            node2 = node2.next;
            if (node1 != null || node2 != null)
                answerNode.addToList(0);
            answerNode = answerNode.next;
        }
        return answerNode;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        node1.addToList(1);
        node1.addToList(5);

        Node node2 = new Node(5);
        node2.addToList(9);
        node2.addToList(2);

        Node node3 = addLinkedLists(node1, node2);

        while (node3 != null) {
            System.out.println(node3.data);
            node3 = node3.next;
        }
    }
}
