package _1_javaExerciseForGithub._1_javaBasic._4_VariabilesNamingConvertions;

public class Main {


    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }
    public static void exerciseOne(){
        int age = 26;
        System.out.println("My age is : " +age);
    }

    public static void exerciseTwo(){
        char firstWordName = 'C';
        int age = 26;
        System.out.println("My first letter of my name is : " + firstWordName + " anche my age is : " + age);
    }

    public static void exerciseThree(){
        // Price of normal lunch
        double lunchPrice = 4.99;
        // Pay in dollaro
        char priceInDollaro = '$';

        System.out.println("My lunch today in America has price : " + lunchPrice + priceInDollaro);
        // inflation oppure iva da aggiungere
        double increasePrice = 2.50;
        // Price with add of inflation
        double lunchPriceInflation = lunchPrice + increasePrice;

        System.out.println("My lunch after inflation is : " + lunchPriceInflation + priceInDollaro);
    }
}
