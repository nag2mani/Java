import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


//for writing in the file.
public class FileHandling {
    public static void main(String[] args) throws IOException {
        String str = "Nagmani" + " Kumar";

        // for writing in the desired directory.
        // FileWriter fl = new FileWriter("C:\\Users\\nag2m\\coding\\java\\output.txt");

        // for writing in the current directory.
        FileWriter fl = new FileWriter("output.txt");
        for (int i = 0; i< str.length(); i++){
            fl.write(str.charAt(i));
        }
        System.out.println("Writing Success");
        fl.close();
    }
}



//for reading from the file.
public class FileHandling {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("output.txt");
            int i;
            while ((i = fr.read()) != -1) {
                if (Character.toLowerCase(i) == "a" ||)

                }

            }
            fr.close();
        }

        catch(Exception e){
            // if there is no such file exist then it caught.
            System.out.println(e);
            // e.printStackTrace();
        }
    }
}




