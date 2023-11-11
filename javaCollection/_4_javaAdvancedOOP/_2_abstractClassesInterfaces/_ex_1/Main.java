package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_1;

public class Main {
    public static void main(String[] args) {
        exercise1();
    }

    /**
     * 1:
     * <p>
     * Create an abstract class called "Shape" with fields of height and width
     * <p>
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     * <p>
     * Create instances of both and calculate their area
     * <p>
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     * <p>
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle r = new Rectangle(4.0, 4.0);
        System.out.println(r.calculateArea());
        Circle c = new Circle(6.0, 6.0);
        System.out.println(c.calculateArea());

    }
}

