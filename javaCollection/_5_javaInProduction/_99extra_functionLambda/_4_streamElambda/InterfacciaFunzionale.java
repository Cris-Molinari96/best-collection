package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._4_streamElambda;

// Le interfacce funzionali vengono marcate con la notazione @FunctionalInterface
// Un interfaccia funzionale è un interfaccia che ha un solo metodo astratto.

//! @FunctionalInterface
public interface InterfacciaFunzionale {
    String printString(String str);

    // se definisci più metodi in un interfaccia funzionale, questi non possono essere eseguiti in un main
//    void printInteger(Integer integer);
//    void printBool(Boolean bool);

}
