// package ass1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Content_Reading {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Content_Reading <directory_path> <stopword1> <stopword2> ...");
            return;
        }

        String directoryPath = "../data";
        String[] stopwords = new String[args.length - 1];
        System.arraycopy(args, 1, stopwords, 0, stopwords.length);

        iterateFiles(directoryPath, stopwords);
    }

    private static void iterateFiles(String directoryPath, String[] stopwords) {
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
            int totalFiles = 0;

            for (File file : files) {
                if (file.isFile()) {
                    totalFiles++;

                    System.out.println("Full Path: " + file.getAbsolutePath());
                    System.out.println("File Name: " + file.getName());
                    displayFileContent(file);
                    System.out.println("Number of Words: " + countWords(file));
                    displayWordFrequency(file, stopwords);
                    displayFileContentWithoutStopwords(file, stopwords);
                    System.out.println("------------------------");
                }
            }

            System.out.println("Total Number of Files: " + totalFiles);
        } else {
            System.out.println("Error reading directory contents.");
        }
    }

    private static void displayFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            System.out.println("Content of File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
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

    private static void displayWordFrequency(File file, String[] stopwords) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!isStopword(word, stopwords)) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean isStopword(String word, String[] stopwords) {
        for (String stopword : stopwords) {
            if (word.equalsIgnoreCase(stopword)) {
                return true;
            }
        }
        return false;
    }

    private static void displayFileContentWithoutStopwords(File file, String[] stopwords) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            System.out.println("Content without Stopwords:");
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!isStopword(word, stopwords)) {
                        System.out.print(word + " ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }
}
