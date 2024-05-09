import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEample {
    public static void main(String[] args) {
        // PrintWriter pw;
        // try {
        //     pw = new PrintWriter("jtp.txt");
        //     pw.println("saved");
        // }
        // catch (FileNotFoundException e) {
        //     System.out.println(e);
        // }
        // System.out.println("File saved successfully");


        PrintWriter pw = null;
        try {
            // Create a PrintWriter object to write to a file named "output.txt"
            pw = new PrintWriter("output.txt");
            // Write some text data to the file
            pw.println("Hello, PrintWriter!");
            pw.println("This is an example of writing text to a file using PrintWriter.");
            pw.println("It's easy to use PrintWriter for writing formatted text.");
            System.out.println("Text data has been written to the file successfully.");
            
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException if the specified file cannot be created or accessed
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the PrintWriter to release resources
            if (pw != null) {
                pw.close();
            }
        }
    }
}


