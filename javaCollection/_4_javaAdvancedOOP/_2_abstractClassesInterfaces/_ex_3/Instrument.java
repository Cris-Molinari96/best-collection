package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_3;

abstract class Instrument implements Playable {
    // la classe Instrument implementando l'interfaccia Playable implementa anche il suo metodo
    // Anche se qui non lo richiamo
    protected String name ;
    protected String brand ;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

}
