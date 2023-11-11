package _1_javaExerciseForGithub._1_javaBasic._0_static2;

public class Test {
    public static int a = 0;
    public  int b = 0;


    // questo fa riferimento alla possibilitò che un metodo non statico  può utilizzare i campi statici

    public int returnA(){
        a = a + 1 + b;
        return a;
    }

    // questo fa riferimento alla possibilitò che un metodo statico non può utilizzare campi non statici

//    public static int returnB(){
//        a = a + 1 ;
//        b = a + 2;
//        return b;
//    }
}
