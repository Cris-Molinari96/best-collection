package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_1;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow((this.height / 2), 2);
    }
}
