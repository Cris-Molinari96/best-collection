package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._2_intro;

public interface MyLambda {

    // in tanto possiamo definire un metodo nelle interfacce, con la key world default!
    // non è possibile sovrascrivere questo metodo nel main, ma può essere eseguito direttamente magari un metodo
    default void helloWorld() {
        System.out.println("Hello!!!");
    }

    public void helloString(String s);

}
