package _1_javaExerciseForGithub._1_javaBasic._0_static2;

public class Main {
    public static void main(String[] args) {

        // questo fa riferimento alla possibilità che un metodo non statico può utilizzare variabili statiche e non
        // mentre un metodo statico può fare riferimento solo a variabili statiche

        // il ++ messo dopo nella condizione non incrementa subito il valore di i
//        int i = 99;
//
//        if(i++ >= 100){
//            System.out.println(i += 10);
//        }else{
//            System.out.println(--i==99?i++:++i);
//        }

        int a = 10;
        int b = 5;
        int c = a + (b++);
        System.out.println(c);
    }
}
