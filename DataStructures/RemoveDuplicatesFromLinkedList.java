import java.util.HashSet;

/**
 * Cracking the coding interview
 * Input is an unsorted linked list.
 * To output, linked list with no duplicates.
 *
 * @author Arihant Jain
 */

public class RemoveDuplicatesFromLinkedList {
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

    private static void removeDuplicates(Node node) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node previous = null;
        while (node != null) {
            if (!hashSet.add(node.data)) {
//                System.out.println(node.data);
                previous.next = node.next;
            } else
                previous = node;
            node = node.next;
        }
    }

//    private static void removeDuplicatesNoBuffer(Node node) {
//        Node head = node;
//        Node previous = null;
//        while (node != null) {
//            Node runner = head;
//            while (runner != node) {
//                if (runner.data == node.data) {
//                    previous.next = node.next;
//                }
//                previous = runner;
//                runner = runner.next;
//            }
//        }
//    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.addToList(10);
        node.addToList(12);
        node.addToList(12);
        node.addToList(16);
        node.addToList(15);
        node.addToList(15);
        node.addToList(12);


        removeDuplicates(node);
        node.printList(node);
    }
}