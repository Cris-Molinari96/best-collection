package _1_javaExerciseForGithub.tutorExe._1_footballTeam;

import java.util.HashSet;
import java.util.Set;

public class Team {
    // ATTRIBUTI
    private static int idCounter = 0;
    private int id;
    private String name;
    private HashSet<FootballPlayer> listPlayersTeam = new HashSet<>();

    // CONSTRUCT
    public Team(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public Team(String name, Set<FootballPlayer> listPlayersTeam) {
        this.id = ++idCounter;
        this.name = name;
        this.listPlayersTeam = new HashSet<>(listPlayersTeam);
    }

    // GETTERS
    public int getNewId() {return idCounter; }
    public int getId() {return id; }
    public String getName() {return name; }
    public HashSet<FootballPlayer> getListPlayersTeam() {return listPlayersTeam;}

    // SETTERS --> al momento non ci interessano

    // METHODS
    public void printTeam() {
        for (FootballPlayer listPlayerTeam : listPlayersTeam) {
            System.out.println(listPlayerTeam.getName() + " " + listPlayerTeam.getSurName());
        }
    }

    public void addPlayer(FootballPlayer p) {
        listPlayersTeam.add(p);
    }
}

