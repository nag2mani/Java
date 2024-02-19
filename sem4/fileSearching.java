import java.io.*;
import java.util.*;

// Interface 1
interface API {
    default void show() {
        System.out.println("Default API: I am just an interface with show method\n");
    }
}


// Interface 2
// Extending the above interface
interface Interface2 extends API {
    // Abstract method
    int countFiles(String s);
}


// Interface 3
// Extending the above interface
interface Interface3 extends API {
    // Abstract method
    void showContents(String s);
}


class fileSearching implements Interface2, Interface3 {
    // Overriding the abstract method from Interface2
    public int countFiles(String fileDir) {
        int count = 0;
        File folder = new File(fileDir);
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                showContents(file.getAbsolutePath());
                count++;
            }
        }
        return count;
    }
}
// Overriding the abstract method from Interface3
public void showContents(String fileWithPath){
File file = new File(fileWithPath);
String content="";

    try{
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()){
    String s = sc.nextLine();
    content=content+s+" ";
    }

    System.out.println("File: " +fileWithPath+"\nContent :"+content.trim()+"\n");
    sc.close();
    }

    catch(Exception e){
    System.out.println(e.getMessage());
}

public static void main(String args[]){
    fileSearching d = new fileSearching();
    String myDir = "/home/vboxuser/AJP/data";
    d.show(); // Default method from API
    int count = d.countFiles(myDir); // Overridden method from Interface2
    System.out.println("\nTotal number of files in this directory: " + count);
}
}
