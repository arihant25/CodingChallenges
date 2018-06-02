import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DepthFirstSearch {
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

        void dfsTraversal(int source) {
            Deque<Integer> deque = new LinkedList<>();
            boolean[] visited = new boolean[v];
            visited[source] = true;
            deque.add(source);
            System.out.println("The dfs traversal for the graph is:");
            System.out.println(source);
            while (deque.size() != 0) {
                source = deque.remove();
                if (!visited[source]) {
                    System.out.println(source);
                    visited[source] = true;
                }
                Iterator<Integer> iterator = adjacencyList[source].listIterator();
                while (iterator.hasNext()) {
                    int v = iterator.next();
                    if (!visited[v])
                        deque.push(v);
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type in the number of edges of your directed graph:");
            int numEdges = scanner.nextInt();
            Graph graph = new Graph(numEdges);
            System.out.println("Type the source and destinations for each edge:");
            for (int i = 0; i < numEdges; i++)
                graph.addEdge(scanner.nextInt(), scanner.nextInt());
            System.out.println("Type in the source of the bfs traversal:");
            graph.dfsTraversal(scanner.nextInt());
        }
    }
}
