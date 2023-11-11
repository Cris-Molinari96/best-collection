package _1_javaExerciseForGithub._4_javaAdvancedOOP._1_inheritance;

public class Fish extends Animal {
    private String species;

    public Fish(String species, double height, double weight) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}

    public void printInfoFish(){
        System.out.println("Species: " + this.species + " - "+ this.height + " cm - " + this.weight + " g");
    }

    public double swimMetersPerSecond(){return  weight * 2 ;}
}
