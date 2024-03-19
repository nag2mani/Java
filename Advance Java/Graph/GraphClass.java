import java.util.*;

public class GraphClass {

    public static class Edge {
        //if static then we can call it without making obj. in static main method(to save our time).
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }



    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);

        System.out.println(graph[0].get(0).src);
        System.out.println(graph[0].get(0).dest);

        // //here graph 0 has one edge but get(1) asking for 2nd edge.
        // System.out.println(graph[0].get(1).dest);

        System.out.println(graph[1].get(0).src);
        System.out.println(graph[1].get(0).dest);
        System.out.println(graph[1].get(1).src);
        System.out.println(graph[1].get(1).dest);
    }

}
