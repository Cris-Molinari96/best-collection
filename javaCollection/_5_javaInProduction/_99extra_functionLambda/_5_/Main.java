package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._5_;

public class Main {
    public static void main(String[] args) {

        calculator((a,b) -> a + b, 5,2);
        Integer integer = calculator((a,b) -> a + b, 5,10);

        System.out.println(integer);
        System.out.println("________");

        // non assegnabile, a questo punto l'unico modo per poter utilizzare il metodo in maniera corretta è
        // definire un metodo statico, come fatto alla riga 7
        OperationType ot = (value1, value2) -> {
            return 15 + 5 ;
        };

        // anche se passo i valori alla fine viene eseguito ot
        Integer num = (int)ot.operationValue(5,5);
        System.out.println("ot --> " + ot);
        System.out.println("num --> " + num);

        System.out.println("________");

        Integer myNum = myCalculator((a,b,c) -> a+b+c, 5,1,2);
        System.out.println(myNum);
    }

    // abbiamo definito un metodo statico che accetta come ritorno un qualsiasi tipo di dato.
    // nei parametri del metodo calculator(
    // 1) function ci serve per richiamare il metodo definito nell'interfaccia, successivamnte
    // 2) v1 e v2 rappresentano i valori che devono essere eseguiti, inoltre
    // Utilizzando una sintassi del genere quindi sfruttando una interfaccia funzionale,
    // posso assegnare il valore di ritorno ad una variabile,
    // mentre a riga 14 il valore è assegnabile solo a variabili di tipo OperationType<T>
    //
    public static <T> T calculator(OperationType<T> function, T value1, T value2){
       return function.operationValue(value1,value2);
//        System.out.println(result);
    }
    public static <T> T myCalculator(MyOperation<T> function, T v1, T v2, T v3){
        return function.myOperation2(v1,v2,v3);
    }
}
