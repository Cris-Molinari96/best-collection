package _1_javaExerciseForGithub.tutorExe.explainExe.exe_1;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private static int idCounter = 0 ;
    private int id;
    private String name;
    private Set <FootballPlayer> listPlayers = new HashSet<FootballPlayer>();

    // CONSTRUCTOR
    Team(String name){
        this.id = ++idCounter;
        this.name = name;
    }

    Team(String name, HashSet<FootballPlayer>listPlayers){
        this.name = name;
        this.listPlayers = new HashSet<>(listPlayers);
    }

    // GETTERS
    public String getName() {return name;}
    public Set<FootballPlayer> getListPlayers() {return listPlayers;} // cosa recupera ? --> accede alla classe, accedendo ai metodi per recuperare dei valori(nome,surname,gool ecc)

    // SETTERS --> ancora non ne abbiamo bisogno

    // METHODS
    public void printTeam(){
        for (FootballPlayer p:listPlayers) {
            System.out.println(p.getName() + " " + p.getSurname());
        }
    }

    public void addPlayer(FootballPlayer p){
        listPlayers.add(p);
    }


}
