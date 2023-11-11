package _1_javaExerciseForGithub._3__javaAdvanced._4_readingWritingToAFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static final Path MY_PATH = Paths.get("file.txt"); // In questo modo stiamo creando un file
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt"); // questo è un percorso

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
//            Files.createFile(MY_PATH);

            // Your code here
            Files.writeString(MY_PATH, myString);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            // Come leggere qualcosa da un file esterno
            System.out.println(Files.readString(MY_PATH));

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            // Your code here
            int countLines = 0;
            String[] stringFile = Files.readString(MY_PATH).split("\n");
            for (String s : stringFile) {
                countLines++;
            }
            System.out.println(countLines);

//            long count = Files.lines(MY_PATH).count();
//            System.out.println(count);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }


    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            // Your code here
            int numOfWords = 0;
            String[] str = Files.readString(MY_PATH).split(".");
            for (String s : str) {
                numOfWords++;
            }
            System.out.println(numOfWords);
            Files.delete(MY_PATH);

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
            Files.createDirectory(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
