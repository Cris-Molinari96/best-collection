package _1_javaExerciseForGithub.tutorExe._1_footballTeam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

public static void main(String[] args) {
//
    FootballPlayer player1 = new FootballPlayer("Diego Armando", "Maradona");
    FootballPlayer player2 = new FootballPlayer("Lionel", "Messi");
    FootballPlayer player3 = new FootballPlayer("Victor", "Oshimen");
    FootballPlayer player4 = new FootballPlayer("Cristiano", "Ronaldo");
    FootballPlayer player5 = new FootballPlayer("Fabio", "Cannavaro");

    // Team A
    HashSet<FootballPlayer> bestPlayers = new HashSet<>(Set.of(player1, player2, player3));
//    bestPlayers.addAll(Set.of(maradona,messi,oshimen)); // più rapido il modo di sopra

    Team teamA = new Team("Team A", bestPlayers);

    // Team B
    Team teamB = new Team("teamB");
    teamB.addPlayer(player4);
    teamB.addPlayer(player5);

    for (FootballPlayer t : teamA.getListPlayersTeam()) {
        t.setNumAssist((int) (Math.random() * 11));
        t.setNumGol((int) (Math.random() * 11));
        t.setNumeroPresenze((int) (Math.random() * 31));
        if (t.getNumGol() >= 5 || t.getNumAssist() >= 7 && t.getNumeroPresenze() >= 20) {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        } else {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        }
    }

    System.out.println("-------------------------------");

// Creazione Team C con i giocatori del teamA + teamB
    HashSet fPlayerTeamC = new HashSet();
    fPlayerTeamC.addAll(teamA.getListPlayersTeam());
    fPlayerTeamC.addAll(teamB.getListPlayersTeam());
    Team teamC = new Team("Team C", fPlayerTeamC);

    System.out.println("Team C");

    for (FootballPlayer t : teamC.getListPlayersTeam()) {
        t.setNumAssist((int) (Math.random() * 11));
        t.setNumGol((int) (Math.random() * 11));
        t.setNumeroPresenze((int) (Math.random() * 31));
        if (t.getNumGol() >= 5 || t.getNumAssist() >= 7 && t.getNumeroPresenze() >= 20) {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        } else {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        }
    }

    HashMap<FootballPlayer, Double> newMap = new HashMap<>();

    for (FootballPlayer p : teamC.getListPlayersTeam()) {
        newMap.put(p, p.score());
    }

    for (Map.Entry<FootballPlayer, Double> entry : newMap.entrySet()) {
        if(entry.getValue() > 0.6){
            System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurName() + " " + entry.getValue());
        }
    }

    }
}
