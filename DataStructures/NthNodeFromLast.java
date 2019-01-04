/**
 * Cracking the coding interview
 * Input is an unsorted linked list.
 * To output, Nth node from last.
 *
 * @author Arihant Jain
 */

public class NthNodeFromLast {
    static class Node {
        int data;
        Node next = null;

        //        constructor
        Node(int d) {
            data = d;
        }

        //        adding nodes to the linked list
        void addToList(int d) {
            Node last = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = last;
        }

        //        simply print the linked list
        void printList(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    private static void getNthFromLast(Node node, int n) {
        Node head = node;
        int total = 0;
        while (node != null) {
            total++;
            node = node.next;
        }

        node = head;
        for (int i = 0; i < total - n - 1; i++) {
            node = node.next;
        }
        System.out.println(node.data);
    }

    private static Node getNthSinglePass(Node node, int n) {
        if (n < 1)
            return null;
        Node head = node;
        Node answerNode = node;
        int total = 0;
        while (total != n) {
            if (head.next == null)
                return null;
            head = head.next;
            total++;
        }
        while (head.next != null) {
            head = head.next;
            answerNode = answerNode.next;
        }
        System.out.println(answerNode.data);
        return answerNode;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.addToList(11);
        node.addToList(12);
        node.addToList(13);
        node.addToList(14);
        node.addToList(15);
        node.addToList(16);
        node.addToList(17);


//        getNthFromLast(node, 6);
        getNthSinglePass(node, 6);
    }
}
