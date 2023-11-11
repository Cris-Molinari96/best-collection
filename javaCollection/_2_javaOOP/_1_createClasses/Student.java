package _1_javaExerciseForGithub._2_javaOOP._1_createClasses;

public class Student {
    private String name;
    private String surname;
    private int age;

    // Getters
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return name + " " + age ;

    }
}
