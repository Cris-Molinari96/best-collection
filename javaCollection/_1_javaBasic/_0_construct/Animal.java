package _1_javaExerciseForGithub._1_javaBasic._0_construct;
/*
In questa classe trattiamo la superMadre quindi concetto di ereditarietà, chiunque estende questa classe,
eredita le caratteristiche e il comportamento.
* Abbiamo trattato anche il modificatore protected il quale è
un altro vantaggio dell'ereditarietà, per i campi e i metodi che non sono privati.
Si può accedere direttamente, come se fossero stati dichiarati, alla sottoclasse stessa.
Quando il codice viene eseguito, verrà ricercata nella classe il campo, cosi risalendo l'albero
 */

public class Animal {
// modificatore protected: ogni classe che è una sottoclasse può accedere a questo campo e non solo
// cosi come tutte le classi contenute nello stesso package avranno accesso
    protected String tipo;
    private String taglia;
    private double peso;

    public Animal(String tipo, String taglia, double peso) {
        this.tipo = tipo;
        this.taglia = taglia;
        this.peso = peso;
    }

// ! Questo mi permette di creare un oggetto senza passare obbligatoriamente i parametri della classe madre, dove?
// ! in una classe figlia ovvero colei che specializza la classe Animal
    public Animal() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /* C'è anche toString(), che dice essere solo un modo per
restituire una rappresentazione in stringa di un oggetto specifico.
    */
    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", taglia='" + taglia + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void move(String speed) {
        System.out.println(tipo + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(tipo + " makes some kind of noise");
    }
}
