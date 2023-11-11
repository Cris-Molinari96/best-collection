package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._5_;
@FunctionalInterface
// Stiamo dichiarando un interfaccia, che può eseguire qualsiasi tipo di operazione!
public interface OperationType <T>{

    // Firma di un metodo che può restituire qualsiasi tipo di valore da quest'operazione.
    T operationValue(T value1, T value2);

}
