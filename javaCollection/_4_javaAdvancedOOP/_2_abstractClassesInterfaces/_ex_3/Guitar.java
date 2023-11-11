package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_3;

public class Guitar extends Instrument{
// guitar estendendo La classe padre, ha disposizione i suoi attributi e il suoi metodi
    public Guitar(String name, String brand) {
        super(name, brand);
    }
// Guitar estendendo Instrument, ha i suoi metodi a disposizione.
    @Override
    public String play() {
        return "Play the guitar: " + this.name + ", for the brand: " + this.brand;
    }
}
