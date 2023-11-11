package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_2;

public class Main {
    public static void main(String[] args) {
        exercise2();
    }
    /**
     * 2:
     * <p>
     * <p>
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     * <p>
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     * <p>
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car newCar = new Car(1200, 120);
        System.out.println("Metri percorsi : " + newCar.moveForward() + " ad una velocità di : " + newCar.getVelocita());
        System.out.println("Metri percorsi : " + newCar.moveBackward() + "Metri percorsi in retromarcia: " + newCar.getVelocita()  );

        Boat newBoat = new Boat(2000, 100);
        System.out.println("Metri percorsi  in barca : " + newBoat.moveForward() + " ad una velocità di : " + newBoat.getVelocita());
        System.out.println("Metri percorsi in barca : " + newBoat.moveBackward() + "Metri percorsi in retromarcia: " + newBoat.getVelocita()  );
    }


}

