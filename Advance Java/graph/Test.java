public class Test {
    public static void main(String[] args) {
        boolean visited[] = new boolean[5]; // Create a boolean array of size 5 and initialise with false.
        
        // Assume some elements have been visited
        visited[0] = true;
        visited[2] = true;
        visited[4] = true;
        
        // Print the status of each element
        for (int i = 0; i < visited.length; i++) {
            System.out.println("Index " + i + ": Visited? " + visited[i]);
        }
    }
}