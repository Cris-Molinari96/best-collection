package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_3;

public class Piano extends Instrument{

    public Piano(String name, String brand) {
        super(name, brand);
    }
// Piano estendendo Instrument, ha i suoi metodi a disposizione.
    @Override
    public String play() {
        return "Play the piano: " + this.name + ", for the brand: " + this.brand;
    }
}
