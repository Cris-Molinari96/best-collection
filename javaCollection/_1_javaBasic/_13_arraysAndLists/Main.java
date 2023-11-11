package _1_javaExerciseForGithub._1_javaBasic._13_arraysAndLists;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array _1_list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
Random random = new Random();
for(int i = 0; i < 8; i++){
    int newRandom = random.nextInt(50);
    numbers.add( newRandom);
}

        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);


    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A _1_list of strings called 'menuItems'
     * <p>
     * And a _1_list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");

        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();
        char valuta = '$';

        menuItems.add("Pizza margherita");
        menuItems.add("Gnocchi alla sorrentina");
        menuItems.add("Bistecca alla fiorentina");

        menuPrices.add(4.5);
        menuPrices.add(10.5);
        menuPrices.add(20.0);

        System.out.println(menuItems.get(0) +" " + menuPrices.get(0)+ valuta);
        System.out.println(menuItems.get(1) +" " + menuPrices.get(1)+ valuta);
        System.out.println(menuItems.get(2) +" " +  menuPrices.get(2) +valuta);
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        //Write your code here
        int sum = items[0] + items[1] + items[2] + items[4] + items[5] + items[6] + items[7] + items[8] + items[9] ;
        System.out.println(sum);
    }
}