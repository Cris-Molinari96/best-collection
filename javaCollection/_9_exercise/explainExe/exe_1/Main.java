package _1_javaExerciseForGithub.tutorExe.explainExe.exe_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        FootballPlayer player1 = new FootballPlayer("Diego Armando", "Maradona");
        FootballPlayer player2 = new FootballPlayer("Victor", " Oshimen");
        FootballPlayer player3 = new FootballPlayer("Kim-Min", "Jii");
        FootballPlayer player4 = new FootballPlayer("Giovanni", "Simenone");
        FootballPlayer player5 = new FootballPlayer("Crisitan", "Molinari");

        HashSet<FootballPlayer> bestPlayers = new HashSet<>(Set.of(player1, player2, player3));

        //Team A
        Team teamA = new Team("Napoli", bestPlayers);
        // Team B
        Team teamB = new Team("Panchina");
        teamB.addPlayer(player4);
        teamB.addPlayer(player5);

        for (FootballPlayer p: teamA.getListPlayers()) {
            // Richiamo i set per impostare un valore
            p.setNumGoalsScored((int)(Math.random() * 11));
            p.setNumAssistsScored((int)(Math.random() * 11));
            p.setNumbersPresence((int)(Math.random() * 30));
            // e poi impostare un controllo sui migliori giocatori secondo la mia condizione
            if(p.getNumGoalsScored() >= 5 || p.getNumAssistsScored() >= 7 && p.getNumbersPresence() >= 20){
                System.out.println(p.getName() + " " + p.getSurname() + " Goals: " + p.getNumGoalsScored() + " Assist: " + p.getNumAssistsScored() + " Prezenze: " + p.getNumbersPresence() );
            }else{
                System.out.println(p.getName() + " " + p.getSurname() + " Goals: " + p.getNumGoalsScored() + " Assist: " + p.getNumAssistsScored() + " Prezenze: " + p.getNumbersPresence() );
            }
        }
        System.out.println("------------");
        // Team C
            // Nel HashSet <> --> non gli passo nessun parametro, avvalorando tutto con add  e quindi l'aggiunta della lista dei giocatori di quel team
        HashSet myTeam = new HashSet<>();
        myTeam.addAll(teamA.getListPlayers());
        myTeam.addAll(teamB.getListPlayers());

        Team teamC = new Team("Team C", myTeam);

        for (FootballPlayer p : teamC.getListPlayers()) {
            // Richiamo i set per impostare un valore
            p.setNumGoalsScored((int)(Math.random() * 11));
            p.setNumAssistsScored((int)(Math.random() * 11));
            p.setNumbersPresence((int)(Math.random() * 30));
            // e poi impostare un controllo sui migliori giocatori secondo la mia condizione
            if(p.getNumGoalsScored() >= 5 || p.getNumAssistsScored() >= 7 && p.getNumbersPresence() >= 20){
                System.out.println(p.getName() + " " + p.getSurname() + " Goals: " + p.getNumGoalsScored() + " Assist: " + p.getNumAssistsScored() + " Prezenze: " + p.getNumbersPresence() );
            }else{
                System.out.println(p.getName() + " " + p.getSurname() + " Goals: " + p.getNumGoalsScored() + " Assist: " + p.getNumAssistsScored() + " Prezenze: " + p.getNumbersPresence() );
            }
        }

        System.out.println("------------");

        // Creazione Mappa
        HashMap<FootballPlayer, Double> newMap = new HashMap<>();
       // Abbiamo bisogno di aggiungere le chiavi e valori alla mappa, e lo facciamo con un foreach
        // Questo p rappresenta già un giocatore del team, quindi nell put non hai bisogno
        // di recuperare un valore in questo caso che è una stringa, perché il parametro rappresenta un player
        for (FootballPlayer p : teamC.getListPlayers()) {
            newMap.put(p, p.score());
        }

        for (Map.Entry<FootballPlayer, Double> entry : newMap.entrySet()) {
            if(entry.getValue() > 0.6){
                System.out.println(entry.getKey().getName() +  " " + entry.getKey().getSurname() + " " + entry.getValue());
            }
        }



    }

}
