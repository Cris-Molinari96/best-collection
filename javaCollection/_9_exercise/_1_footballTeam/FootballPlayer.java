package _1_javaExerciseForGithub.tutorExe._1_footballTeam;

public class FootballPlayer {
    // ATTRIBUTI
    private static int idCounter = 0 ;
    private int id;
    private String name ;
    private String surName;
    private int  numeroPresenze ;
    private int numGol ;
    private int  numAssist ;
    private Team teamMembership;

    // CONSTRUCT
    FootballPlayer(String name, String surName, int numeroPresenze, int numGol, int numAssist) {
        this.id = ++idCounter;
        this.name = name;
        this.surName = surName;
        this.numeroPresenze = numeroPresenze;
        this.numGol = numGol;
        this.numAssist = numAssist;
    }
    FootballPlayer(String name, String surName){
            this.id = ++idCounter;
            this.name = name;
            this.surName = surName;
        }
     // GETTERS
    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurName() {return surName;}
    public int getNumeroPresenze() {return numeroPresenze;}
    public int getNumGol() {return numGol;}
    public int getNumAssist() {return numAssist;}
    public Team getTeamMembership() {return teamMembership;}

    // SETTERS --> CI SERVIRANNO PER SETTARE I GOL, ASSIST E PRESENZE
    public void setNumeroPresenze(int numeroPresenze) {this.numeroPresenze = numeroPresenze;}
    public void setNumGol(int numGol) {this.numGol = numGol;}
    public void setNumAssist(int numAssist) {this.numAssist = numAssist;}
    public void setTeamMembership(Team teamMembership) {this.teamMembership = teamMembership;}

    // METHODS
    public Double score(){
        Double scorePlayer =  numGol + (0.75 * numAssist) / numeroPresenze;
        return scorePlayer;
        // numeroGol + (0.75*numeroAssist)) / numeroPresenze.
    }


}
