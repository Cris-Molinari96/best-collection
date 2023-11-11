package _1_javaExerciseForGithub._4_javaAdvancedOOP._2_abstractClassesInterfaces._ex_2;

public class Boat implements Movable{
    private double metriPercorsi;
    private double potenzaMotore;
    private double velocita;

    public Boat(double potenzaMotore, double velocita) {
        this.potenzaMotore = potenzaMotore;
        this.velocita = velocita;
    }

    public double getPotenzaMotore() {return potenzaMotore;}
    public void setPotenzaMotore(double potenzaMotore) {this.potenzaMotore = potenzaMotore;}
    public double getVelocita() {return velocita;}
    public void setVelocita(double velocita) {this.velocita = velocita;}

    @Override
    public int moveForward() {
        metriPercorsi = Math.random()  * potenzaMotore;
        return (int) (metriPercorsi * velocita);
    }

    @Override
    public int moveBackward() {
        metriPercorsi = Math.random() * potenzaMotore;
        return (int) (metriPercorsi / velocita);
    }
}
