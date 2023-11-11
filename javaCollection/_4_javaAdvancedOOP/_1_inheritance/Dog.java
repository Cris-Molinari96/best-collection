package _1_javaExerciseForGithub._4_javaAdvancedOOP._1_inheritance;

public class Dog extends Animal{

private String breed;

    public Dog(String breed,double height, double weight) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    public void printInfoBreed(){
        System.out.println("Razza: " +this.breed + " - "  + this.height + " cm - " + this.weight +" Kg");
    }

    public double runSpeedMetersPerSecond(){
        return height * 2 ;
    }
}
