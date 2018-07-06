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

        //        delete a node from the linked list
        Node deleteNode(Node head, int d) {
            Node n = head;
            if (n.data == d) {
                return n.next;
            }

            while (n.next != null) {
                if (n.next.data == d) {
//                    ignored pointer to node that needs to be deleted from the list
                    n.next = n.next.next;
                    return head;
                }
                n = n.next;
            }
            System.out.println("Node not present in the list");
            return head;
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

    public static void main(String[] args) {
        Node node = new Node(10);
        node.addToList(11);
        node.addToList(12);
        node.addToList(13);
        node.addToList(14);

        node.printList(node);
        node.printList(node.deleteNode(node, 13));
        node.printList(node.deleteNode(node, 15));
    }
}