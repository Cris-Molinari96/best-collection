package _1_javaExerciseForGithub._2_javaOOP._1_createClasses;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise2();
        exercise3();
        /**
         * 1: Create a new Class in this package
         *
         *    Call this class 'Course'
         *
         *    Inside add the following variables, using an appropriate type.
         *    courseName, maxStudents, qualityRatingOutOf10
         *
         *    On top of this choose 2 variables of your choice!
         */
        Course newCourse = new Course();
        newCourse.courseName = "Java OOP";

    }


    /**
     * 2: use the class called 'Student', add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        // Use a for i loop
        for (int i = 0; i < studentNames.size() && i < studentAges.size(); i++) {
            System.out.println(studentNames.get(i) + " " + studentAges.get(i));
        }
        createNewStudent("Cristian", 26);
    }

    private static Student createNewStudent(String name, Integer age) {
        // Write your code here
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setAge(age);
        return newStudent;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        Course course = new Course();
        course.etaMediaStudenti();
    }
}
