import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class DFS {

    static class Edge {
        int src, dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));

        // graph[1].add(new Edge(1, 0));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 2));
        // graph[4].add(new Edge(4, 2));


        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));
    
        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 4));
    
        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));
    
        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 2));
    
        // graph[4].add(new Edge(4, 1));
        // graph[4].add(new Edge(4, 2));


        // graph[0].add(new Edge(0, 1));
        // graph[1].add(new Edge(1, 4));
    
        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 4));
    
        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 2));
    
        // graph[4].add(new Edge(4, 1));
        // graph[4].add(new Edge(4, 2));



        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
    
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
    
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 5));
        graph[2].add(new Edge(2, 6));
    
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 7));
        graph[3].add(new Edge(3, 8));
    
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 9));

        graph[5].add(new Edge(5, 2));
        graph[6].add(new Edge(6, 2));

        graph[7].add(new Edge(7, 3));
        graph[8].add(new Edge(8, 3));

        graph[9].add(new Edge(9, 4));
    }

    public static void dfs(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        // Start DFS from vertex 0
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");
                
                // Push unvisited neighbors onto the stack
                for (Edge e : graph[curr]) {
                    if (!visited[e.dst]) {
                        stack.push(e.dst);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int V = 10;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph, V);
        System.out.println();
    }
}

