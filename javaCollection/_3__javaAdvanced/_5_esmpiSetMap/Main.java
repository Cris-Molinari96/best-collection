package _1_javaExerciseForGithub._3__javaAdvanced._5_esmpiSetMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    Studente studente1 = new Studente("Cristian", "Molinari", 26);
    Studente studente2 = new Studente("Marco", "Adriani", 29);
    Studente studente3 = new Studente("Giulio", "Pesto", 18);
    Studente studente4 = new Studente("Riot", "Qualcosa", 30);
    Studente studente5 = new Studente("Stefano", "Qualcosa", 30);
    Studente studente6 = new Studente("Daniele", "Romani", 30);

    HashMap<Studente, Integer> newMap = new HashMap<>();
    Classe classe1 = new Classe("1A", Arrays.asList(studente1,studente2,studente3,studente4,studente5));
    classe1.addStudente(studente6);
        for ( Studente s : classe1.getListaMembriClasse()) {
            newMap.put(s, s.getAge());
        }

        for (Map.Entry<Studente,Integer> entry: newMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurname() + " " + entry.getValue());
        }

    Scuola scuola1 = new Scuola("Develhope", Arrays.asList(classe1));

    }
}
