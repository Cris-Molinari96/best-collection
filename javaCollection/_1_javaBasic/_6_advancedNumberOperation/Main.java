package _1_javaExerciseForGithub._1_javaBasic._6_advancedNumberOperation;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFourBonus();
    }
    public static void exerciseOne(){
    double value = 20;
    double valueSquareRoot = Math.sqrt(value);
    System.out.println(valueSquareRoot);
    }
    public static void exerciseTwo(){
    int valueMax = 10;
    int valueMin = 1;
    int findValueMax = Math.max(valueMax, valueMin);
    int findValueMin = Math.min(valueMax, valueMin);
    System.out.print("The value max is : " + findValueMax);
    System.out.print("The value min is : " + findValueMin);
    }
    public static void exerciseThree(){
    int wallet = 50;
    int priceBurger = 9;
    int walletAfterBuyAnyBurgerPossibile = wallet % priceBurger;
    System.out.println("After buy burger the rest in my wallet is:  "+walletAfterBuyAnyBurgerPossibile);
    }
    public static void exerciseFourBonus(){
    double value = 4.5;
    System.out.println(value + " ceil method " + Math.ceil(value) ); // Approssima per eccesso
    System.out.println(value + " floor method " + Math.floor(value) ); // Approssima per difetto
    System.out.println(value + " round method " + Math.round(value) ); // Approssima per il numero più vicino
    System.out.println(value + " pow (2) method " + Math.pow(value, 2) ); // elevato a 2 in questo caso
    System.out.println(value + " pow (3) method " + Math.pow(value, 3) ); // elevato a 3 in questo caso
    System.out.println(value + " random method " + Math.random() * value ); // Genere un numero randomico da 0 a 1
    }

}
