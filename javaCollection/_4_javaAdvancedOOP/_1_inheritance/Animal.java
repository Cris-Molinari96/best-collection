package _1_javaExerciseForGithub._4_javaAdvancedOOP._1_inheritance;

public class Animal {

    protected double height, weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
}
