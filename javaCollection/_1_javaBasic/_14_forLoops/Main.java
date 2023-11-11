package _1_javaExerciseForGithub._1_javaBasic._14_forLoops;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // Write your code for 1a here
        for(Integer itemA : itemsA){
            sumForA += itemA;
        }
        System.out.println("The sum is A: " + sumForA);

        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // Write your code for 1b here
        for (Integer itemB : itemsB){
            sumForB += itemB;
        }
        System.out.println("The sum B: " + sumForB);

        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        // Write your code for 1c here, refer back to the lesson to check the fori syntax
        for(int i = 0 ; i < itemsA.size(); i++){
            sumForC += itemsA.get(i);
        }

        System.out.println("The sum C:" + sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
        for(Integer item : items){
        if(minNumber > maxNumber){
// Non mi sono ben chiari i passaggi che fa qui..
            minNumber = Math.min(minNumber, item);
        }
            }

        for(Integer item : items){
            if(maxNumber < minNumber){
// Non mi sono ben chiari i passaggi che fa qui..
                maxNumber = Math.max(maxNumber, item);
            }
                }


        System.out.println(minNumber);
        System.out.println(maxNumber);

    }

    /**
     * 3: Edit the fori loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < 2 ; // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication Table
     * <p>
     * Bonus, how could we use a single variable to change our times Table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        for (
        int timesTableCurrentValue = 1; // <---- Edit this line
        timesTableCurrentValue <= 10; // <---- Edit this line
        timesTableCurrentValue++ // <---- Edit this line
        ) {
            int num = 8;
            int sum = timesTableCurrentValue * num ;
            System.out.println(timesTableCurrentValue + " * " + num + " = "+ sum );
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here

                int sum = 0 ;
                int num = 0 ;
                for(num = 1; num <= 5 ; num ++){
                    sum = num * timesTableNumber ;
                }
                System.out.println(num + " * " + timesTableNumber + " = "  + sum);

        }
    }
}
