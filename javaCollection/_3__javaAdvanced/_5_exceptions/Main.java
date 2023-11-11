package _1_javaExerciseForGithub._3__javaAdvanced._5_exceptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**\
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            if (Files.exists(Path.of("Test.txt"))) {
                Files.delete(Path.of("Test.txt"));
            } else {
                String newString = "Greg Tua mamma è mia";
                Files.createFile(Path.of("Test.txt"));
                Files.writeString(Path.of("Test.txt"), newString);
            }
        } catch (Exception exception) {
            System.out.println("Problem with delete file");
        }
    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        String userInputFileName = "test-file.txt";

        try {
            Files.readString(Path.of(userInputFileName));
        } catch (Exception exception) {
            System.out.println("The file could not be found");
        }
    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        try {
            Integer.parseInt("house");
        } catch (Exception exception) {
            System.out.println("The input was not a valid integer");
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        try {
// --> non esiste un'eccezione perché Double può gestire un numero infinito, essendo abbastanza grande
// quindi devo crearla io
            Double c = num1 / Double.parseDouble(num2AsString);
            if (Double.isInfinite(c)) {
                throw new ArithmeticException("Divided by zero cannot possible");
            }
            // Your catch blocks here
        } catch(ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        } finally{
            throw new ArithmeticException("Divided by zero cannot possible --> generate infinite");
        }
    }
}
