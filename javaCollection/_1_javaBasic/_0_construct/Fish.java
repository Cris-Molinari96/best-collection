package _1_javaExerciseForGithub._1_javaBasic._0_construct;
/*
* In questa classe, stiamo creando un altro tipo di animale il quale ha caratteristiche diverse rispetta ad un cane,
* infatti il nome per il movimento qui sarà diverso, e come potremo vedere, i metodi sono resi privati, e questi vengono richiamatati dai
* metodi della superclasse
* */
public class Fish extends Animal {

    private int branchie;
    private int pinne;
// il mio oggetto fish avrà questo stato quando nasce, ovviamente avrà un riferimento legato alla varabile infatti
    // una variabile va a fare da riferimento a quell'obj
    public Fish(String tipo, double peso, int branchie, int pinne) {
        super(tipo, "small", peso);
        this.branchie = branchie;
        this.pinne = pinne;
    }

    private void moveMuscles(){
        System.out.println("Muovo i muscoli per nuotare più velocemente");
    }

    private void movePinne(){
        System.out.println("Muovo le pinne, ma questo mi rende lento");
    }

    @Override
    public void move(String speed) {
        if(speed.equals("fast")) {
            moveMuscles();
        }else{
            movePinne();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "branchie=" + branchie +
                ", pinne=" + pinne +
                "} " + super.toString();
    }
}
