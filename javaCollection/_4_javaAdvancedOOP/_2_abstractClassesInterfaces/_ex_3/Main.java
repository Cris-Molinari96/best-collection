package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_3;

public class Main {
    public static void main(String[] args) {
        exercise3();
    }
    /**
     * 3:
     * <p>
     * <p>
     * Create an interface called "Playable" with an abstract method called "play()".
     * <p>
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     * <p>
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     * <p>
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Guitar guitar =  new Guitar("Blackie","ACDC");
        Piano piano =  new Piano("Bösendorfer","ACDC");
        System.out.println(piano.play());
        System.out.println(guitar.play());
    }
}
