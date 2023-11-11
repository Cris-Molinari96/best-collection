package _1_javaExerciseForGithub._3__javaAdvanced._9_polymorphism;

public class A extends  B{
    @Override
    public int metodo(int a , int b){
        return a - b ;
    }

//    public final int metodoFinal(int a , int b){    --> Non posso sovrascrivere un metodoFinal
//        return a - b ;
//    }

}
