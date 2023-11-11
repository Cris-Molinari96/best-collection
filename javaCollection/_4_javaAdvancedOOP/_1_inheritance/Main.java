package _1_javaExerciseForGithub._4_javaAdvancedOOP._1_inheritance;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog pastoreTedesco = new Dog("Pastore tedesco",110, 40  );
        pastoreTedesco.printInfoBreed();
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish nemo = new Fish("Pesce pagliaccio", 0.5, 7);
        Bird eagle = new Bird(200 , 13, 40);
        eagle.printInfoBird();
        nemo.printInfoFish();
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog husky = new Dog("Corso" , 60.0, 40);
        Fish nemo = new Fish("Pesce pagliaccio", 0.5, 7);
        Bird eagle = new Bird(200 , 13, 40);

//        System.out.println("Speed meters per second: " + corso.runSpeedMetersPerSecond());
//        System.out.println("Swim meters per second: " + nemo.swimMetersPerSecond());
//        System.out.println("Swim meters per second: " + eagle.flySpeedMetersPerSecond());

        if (husky.runSpeedMetersPerSecond() > nemo.swimMetersPerSecond() && husky.runSpeedMetersPerSecond() > eagle.flySpeedMetersPerSecond()){
            System.out.println("Il cane percorre più metri x secondo");
        } else if (nemo.swimMetersPerSecond() > husky.runSpeedMetersPerSecond() && nemo.swimMetersPerSecond() > eagle.flySpeedMetersPerSecond()) {
            System.out.println("Il pescè percorre più metri x secondo");
        }else{
            System.out.println("L'aquila percorre più metri x secondo - " + eagle.flySpeedMetersPerSecond() + " cm ");
        }
    }
}

