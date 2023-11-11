package _1_javaExerciseForGithub._5_javaInProduction._1_ternaryRecordBigClassN;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        /**
         * 1:
         *
         *
         * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
         *
         * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
         *
         * Experiment with different values of x and observe the output
         */
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        int x = (int) (Math.random() * 100);
        String s = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(s);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person p = new Person("Cristian", 26, "Via giulio Cesare");
        System.out.println(p.toString());
    }

    /**
     * 3:
     * <p>
     * <p>
     * Nel metodo principale creare una variabile BigInteger con un valore elevato.
     * <p> Crea una variabile BigDecimal con un valore elevato
     * <p> Dividi BigInteger per 3 usando il metodo divide e assegna il risultato a una nuova variabile BigInteger
     * <p> Dividi BigDecimal per Math.PI usando il metodo divide e assegna il risultato in una nuova variabile BigDecimal
     * <p> Stampa i risultati
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
            // Integer
        BigInteger bigInteger = new BigInteger("15000000000");
        BigInteger b = new BigInteger("3");
        BigInteger newBig = bigInteger.divide(b);
        System.out.println(newBig);

            // Decimal
        BigDecimal bigDecimal = new BigDecimal("5955.99");
        BigDecimal bd = new BigDecimal(Math.PI);
        BigDecimal newBigD = bigDecimal.divide(bd, MathContext.DECIMAL32);
        System.out.println(newBigD);

    }

}
