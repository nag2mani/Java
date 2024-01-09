import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Directory_Reading {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\nag2m\\coding\\java\\code\\Java";
        iterateFiles(directoryPath);
    }

    private static void iterateFiles(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory not found!");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("Provided path is not a directory!");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("Full Path: " + file.getAbsolutePath());
                    System.out.println("File Name: " + file.getName());
                    System.out.println("Number of Words: " + countWords(file));
                    System.out.println("------------------------");
                }
            }
        } else {
            System.out.println("Error reading directory contents.");
        }
    }

    private static int countWords(File file) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }

        return wordCount;
    }
}

