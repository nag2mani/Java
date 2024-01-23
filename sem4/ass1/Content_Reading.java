package ass1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class Content_Reading {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("");
            System.exit(1);
        }

        String directoryPath = args[0];
        String[] stopwords = new String[args.length - 1];
        System.arraycopy(args, 1, stopwords, 0, args.length - 1);

        // Call methods and  analyze files
        analyzeFiles(directoryPath, stopwords);
    }

    private static void analyzeFiles(String directoryPath, String[] stopwords) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("Invalid directory path.");
            System.exit(1);
        }

        int totalFiles = files.length;
        System.out.println("1) Total number of files: " + totalFiles);

        for (File file : files) {
            if (file.isFile()) {
                analyzeFile(file, stopwords);
            }
        }
    }

    private static void analyzeFile(File file, String[] stopwords) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder content = new StringBuilder();
            int wordCount = 0;
            HashMap<String, Integer> wordFrequency = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");

                // Count words and word frequency
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty() && !isStopword(word, stopwords)) {
                        wordCount++;
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Display file content and word count
            System.out.println("\nFile: " + file.getName());
            System.out.println("2) Content:\n" + content.toString());
            System.out.println("   Total number of words: " + wordCount);

            // Display word frequency
            System.out.println("3) Word Frequency:");
            for (String word : wordFrequency.keySet()) {
                System.out.println("   " + word + ": " + wordFrequency.get(word));
            }

            // Display content after removing stopwords
            System.out.println("4) Content after removing stopwords:");
            String contentWithoutStopwords = content.toString();
            for (String stopword : stopwords) {
                contentWithoutStopwords = contentWithoutStopwords.replaceAll("\\b" + stopword + "\\b", "");
            }
            System.out.println(contentWithoutStopwords);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isStopword(String word, String[] stopwords) {
        for (String stopword : stopwords) {
            if (stopword.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
}
