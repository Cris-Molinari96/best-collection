package _1_javaExerciseForGithub._3__javaAdvanced._5_esmpiSetMap;

import java.util.List;

public class Scuola {

    private String scuola;
    private List<Classe> listaClasse ;

    //CONSTRUCT
    public Scuola(String scuola, List<Classe> listaClasse) {
        this.scuola = scuola;
        this.listaClasse = listaClasse;
    }
    // GETTERS
    public String getScuola() {return scuola;}
    public List<Classe> getListaClassi() {return listaClasse;}
    // SETTERS
    public void setScuola(String scuola) {this.scuola = scuola;}
    public void setListaClassi(List<Classe> listaClasse) {this.listaClasse = listaClasse;}
}
