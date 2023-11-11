package _1_javaExerciseForGithub._3__javaAdvanced._5_esmpiSetMap;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    private String nameClass;
    private List<Studente> listaMembriClasse;
    // CONSTRUCT
    public Classe(String nameClass, List<Studente> listaMembriClasse) {
        this.nameClass = nameClass;
        this.listaMembriClasse = new ArrayList<>(listaMembriClasse); // Non l'ho capito perfettamente cosa succede?
    }
    // GETTERS
    public String getNameClass() {return nameClass;}
    public List<Studente> getListaMembriClasse() {return listaMembriClasse;} // Questo get recupera i valori della classe studente
    // SETTERS
    public void setNameClass(String nameClass) {this.nameClass = nameClass;}
    public void setListaMembriClasse(List<Studente> listaMembriClasse) {this.listaMembriClasse = listaMembriClasse;}

    public void addStudente(Studente s){
        listaMembriClasse.add(s);
    }

}
