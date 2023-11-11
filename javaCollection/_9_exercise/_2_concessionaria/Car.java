package _1_javaExerciseForGithub.tutorExe._2_concessionaria;

public class Car {

    private static int id = 0 ;
    private String targa;
    private String modello;
    private String marchio ;
    private double prezzo ;
    private int kmXLitro ;
    private boolean isElettrica ;

    // CONST
    public Car(String targa, String modello, String marchio, double prezzo, int kmXLitro, boolean isElettrica) {
        this.targa = targa;
        this.modello = modello;
        this.marchio = marchio;
        this.prezzo = prezzo;
        this.kmXLitro = kmXLitro;
        this.isElettrica = isElettrica;
    }
    public Car(String targa, String modello, String marchio){
        this.targa = targa;
        this.modello = modello;
        this.marchio = marchio;
    }

    // GETTERS
    public static int getId() {return id;}
    public String getTarga() {return targa;}
    public String getModello() {return modello;}
    public String getMarchio() {return marchio.strip().toLowerCase();}
    public double getPrezzo() {return prezzo;}
    public int getKmXLitro() {return kmXLitro;}
    public boolean isElettrica() {return isElettrica;}

    // SETTERS
    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}

    // METHODS
    public Boolean isGreen(){
        if(isElettrica || kmXLitro > 20){
            System.out.println();
            return true;
        }else{
            return false;
        }
    }

}
