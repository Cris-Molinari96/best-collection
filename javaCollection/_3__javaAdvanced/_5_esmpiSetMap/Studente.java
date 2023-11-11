package _1_javaExerciseForGithub._3__javaAdvanced._5_esmpiSetMap;

public class Studente {

    private String name;
    private String Surname;
    private int age ;

    public Studente(String name, String surname, int age) {
        this.name = name;
        Surname = surname;
        this.age = age;
    }
    // GETTERS
    public String getName() {return name;}
    public String getSurname() {return Surname;}
    public int getAge() {return age;}

    // SETTERS
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {Surname = surname;}
    public void setAge(int age) {this.age = age;}
}
