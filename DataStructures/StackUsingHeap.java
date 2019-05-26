import java.util.PriorityQueue;

/**
 * Daily Coding Challenge
 * Implement a stack using only a heap. A stack implements the following methods:
 * - push(item), which adds an element to the stack
 * - pop(), which removes and returns the most recently added element (or throws an error if there is nothing on the stack)
 *
 * @author Arihant Jain
 */

public class StackUsingHeap {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.push(0);
        stack.showStack();
    }

    static class Stack {
        private PriorityQueue<StackElement> maxHeap;
        private int index;

        Stack() {
            maxHeap = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1.key, o2.key));
            index = 1;
        }

        void push(int i) {
            maxHeap.add(new StackElement(index++, i));
        }

        void pop() {
            maxHeap.poll();
        }

        void showStack() {
            for (StackElement stackElement : maxHeap) {
                System.out.print(stackElement.value + " ");
            }
            System.out.println();
        }
    }

    static class StackElement {
        private int key;
        private int value;

        StackElement(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }
}
