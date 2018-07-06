/**
 * Cracking the coding interview
 * Simple linked list implementation.
 *
 * @author Arihant Jain
 */

public class LinkedList {

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
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.addToList(11);
        node.addToList(12);
        node.addToList(13);
        node.addToList(14);

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}