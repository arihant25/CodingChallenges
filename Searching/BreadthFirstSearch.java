/**
 * CodingChallenge
 * Implementation of Breadth First Traversal in a graph.
 *
 * @author Arihant Jain
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BreadthFirstSearch {
    static class Graph {
        int v;
        LinkedList<Integer> adjacencyList[];
        Graph(int numEdges) {
            v = numEdges;
            adjacencyList = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adjacencyList[i] = new LinkedList<>();
        }

        void addEdge(int source, int destination) {
            adjacencyList[source].add(destination);
        }

        void bfsTraversal(int source) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            boolean visited[] = new boolean[v];
            visited[source] = true;
            linkedList.add(source);
            System.out.println("The bfs traversal for the graph is:");
            while (linkedList.size() != 0) {
                source = linkedList.poll();
                System.out.println(source);
                Iterator<Integer> iterator = adjacencyList[source].listIterator();
                while (iterator.hasNext()) {
                    int n = iterator.next();
                    if (!visited[n]) {
                        linkedList.add(n);
                        visited[n] = true;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type in the number of edges of your directed graph:");
            int numEdges = scanner.nextInt();
            Graph graph = new Graph(numEdges);
            for (int i=0; i<numEdges; i++)
                graph.addEdge(scanner.nextInt(), scanner.nextInt());
            System.out.println("Type in the source of the bfs traversal:");
            graph.bfsTraversal(scanner.nextInt());
        }
    }
}