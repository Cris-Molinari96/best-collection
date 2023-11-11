package _1_javaExerciseForGithub.tutorExe.explainExe.exe_1;

public class FootballPlayer {

    private static int idCounter = 0;
    private  int id = 0;
    private String name;
    private String surname;
    private int numbersPresence;
    private int numGoalsScored;
    private int numAssistsScored;
    private Team teamMembership;

    // CONSTRUCTOR
    FootballPlayer(String name, String surname,int numbersPresence,int numGoalsScored, int numAssistsScored){
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
        this.numbersPresence = numbersPresence;
        this.numGoalsScored = numGoalsScored;
        this.numAssistsScored = numAssistsScored;
    }
    FootballPlayer(String name, String surname){
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    // GETTERS
    public static int getIdCounter() {return idCounter;}
    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getNumbersPresence() {return numbersPresence;}
    public int getNumGoalsScored() {return numGoalsScored;}
    public int getNumAssistsScored() {return numAssistsScored;}

    // SETTERS
    public void setNumbersPresence(int numbersPresence) {this.numbersPresence = numbersPresence;}
    public void setNumGoalsScored(int numGoalsScored) {this.numGoalsScored = numGoalsScored;}
    public void setNumAssistsScored(int numAssistsScored) {this.numAssistsScored = numAssistsScored;}

    // METHODS
    public Double score(){
    Double scorePlayer = ( numGoalsScored  + (0.75 * numAssistsScored) / numbersPresence);
    return scorePlayer;
    }
}
