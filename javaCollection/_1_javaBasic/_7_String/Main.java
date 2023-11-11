package _1_javaExerciseForGithub._1_javaBasic._7_String;

public class Main {
    public static void main(String[] args) {
    exerciseOne();
    exerciseTwo();
    exerciseThree();
    exerciseFour();
    }
    public static void exerciseOne(){
        String firstString = "Hello I'm ";
        String firstName = "Cristian";
        firstName += " Molinari";
        System.out.println(firstString + firstName);

    }
    public static void exerciseTwo(){
    String firstName = "cristian";
    String middleName = " CRIS";
    String lastName = " molinari";
    System.out.println(firstName.toUpperCase() + middleName.toLowerCase() + lastName.toUpperCase());
    }
    public static void exerciseThree(){
    String textFrom2Primitive = "" + 1 + 1 ;
    System.out.println(textFrom2Primitive);
    }
    public static void exerciseFour(){
    String endNumbers = " 7 8 9";
    String middleNumbers = "           4 5 6";
    String earlyNumbers = "1 2 3 ";
    System.out.println(earlyNumbers + middleNumbers.trim() + endNumbers);
    }
}