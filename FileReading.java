// import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

// public class FileReading {
//     public static void main(String[] args) throws IOException{
//         File file = new File("C:\\Users\\nag2m\\coding\\java\\code\\output.txt");
//         Scanner scr = new Scanner(file);
//         // System.out.println(scr);
//         int vowelCount = 0;
//         int ConsonentCount = 0;
//         while (scr.hasNextLine()) {
//             String line = scr.nextLine();
//             String line1 = line.toLowerCase();
//             // System.out.println(line);
//             for(int i = 0; i < line1.length(); i++){
//                 if (line1.charAt(i) == 'a' || line1.charAt(i) == 'e' || line1.charAt(i) == 'i' || line1.charAt(i) == 'o' || line1.charAt(i) == 'u'){
//                     vowelCount++;
//                 }
//                 else{
//                     int asciiValue = (int) line1.charAt(i);
//                     // int asciiValue = Character.getNumericValue(character);

//                     if (97 <= asciiValue && asciiValue <= 122){
//                         ConsonentCount++;
//                     }
//                 }
//             }
//         }
//         System.out.println(vowelCount);
//         System.out.println(ConsonentCount);
//     }
// }





// public class FileReading {
//     public static void main(String[] args) throws IOException{
//         File file = new File("C:\\Users\\nag2m\\coding\\java\\code\\output.txt");
//         Scanner scr = new Scanner(file);
//         // System.out.println(scr.nextLine());


//         while (scr.hasNextLine()) {
//             String original_line = "";
//             String reversed_line = "";
//             String line = scr.nextLine();
//             original_line = original_line + line;
//             String wordArray[] = line.split(" ");
//             for(int i = wordArray.length -1; i>=0; i--){
//                 reversed_line = reversed_line + wordArray[i] + " ";
//             }
//             // System.out.println();
//             System.out.println(reversed_line);
//         }
        
//     }
// }






public class FileReading {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\nag2m\\coding\\java\\code\\output.txt");
        Scanner scr = new Scanner(file);
        HashMap<String ,Integer> hm = new HashMap<String, Integer>();

        while (scr.hasNextLine()) {
            String line = src.nextLine();
            String[] wordArray = line.toLowerCase().split(" ");
            for(String S : wordArray){
                if(ke)
            }
        }
        
    }
}