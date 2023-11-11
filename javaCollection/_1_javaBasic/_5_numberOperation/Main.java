package _1_javaExerciseForGithub._1_javaBasic._5_numberOperation;

public class Main {
    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFourBonus();
        exerciseFiveBonus();
    }

    public static void exerciseOne(){
    int num = 20 +1 ;
    System.out.println("Twenty plus one "+num);
    }
    public static void exerciseTwo(){
    int num = 20;
    num *= 2 ;
    System.out.println("number after times: " + num);
    num /= 2 ;
    System.out.println("number after division: " +num);

    }
    public static void exerciseThree(){
    double celsius = 0;
    double fahrenheit = (celsius * 1.8) + 32;
    char temperatureSymbol = '°';
    //* fahrenheit *= 1.8;
    //  fahrenheit += 32 ;

    System.out.println("T in celsius : " + celsius + temperatureSymbol);
    System.out.println("T in fahrenheit : " + fahrenheit + temperatureSymbol);

    }
        public static void exerciseFourBonus(){
    int age = 10 ;
    age++;
    age++;
    age++;
    age++;
    age++;
    System.out.println("The age increase of 5 value/years : " + age );
    }
    public static void exerciseFiveBonus(){
    int firstAge = 50 ;
    int secondAge = 50 ;
    firstAge -= secondAge;
    System.out.println(firstAge);

    }

}
