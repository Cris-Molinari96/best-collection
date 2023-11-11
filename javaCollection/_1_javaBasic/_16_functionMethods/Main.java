package _1_javaExerciseForGithub._1_javaBasic._16_functionMethods;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     **/
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        String conversionDescription = fetchCelsius(15);
        // End
        System.out.println(conversionDescription);
    }

    // * Restituisce i gradi da celsius in fahrenheit
    static String fetchCelsius(int grade){
        double celsius = grade;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");
// * Con questo ciclo --> cicliamo gli elementi nella lista di array, e facciamo un check se un nome contiene numeri con matches
        for (String name : names) {
            // Call your function
            String checkOk = " ";
            if(fetchName(name).matches(".*\\d.*")){
                System.out.println(name + " Invalid name");
            }else{
                checkOk = fetchName(name + "  Valid name");
                System.out.println(checkOk);
            };
        }

    }
    static String fetchName(String name){
        return name.toUpperCase().trim();
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function*//*
        printVariable(myLunchPrice, lunchType, description, weightInGrams);

    }
    static void printVariable(double lunch, String lunchType, String desc, int weight ){
        System.out.println(
                "My lunch price = " + lunch + "\n" +
                        "My type of lunch = " + lunchType + "\n" +
                        "Description lunch = " + desc + "\n " +
                        "Weight lunch " + weight);
    }
}
