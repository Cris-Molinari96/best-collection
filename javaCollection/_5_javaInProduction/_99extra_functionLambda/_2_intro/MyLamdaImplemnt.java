package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._2_intro;

public class MyLamdaImplemnt implements  MyLambda{


    // è possibile richiamare il metodo in questo modo se dovesse servirmi
    public void hellowolrd(){
        helloWorld();
    }


    @Override
    public void helloString(String s) {
        MyLambda expression = (x) -> {
            System.out.println("Hello world! " + x);
        };

        s = "LocalgHost096";
        expression.helloString(s);
    }
}
