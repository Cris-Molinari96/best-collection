package _1_javaExerciseForGithub._3__javaAdvanced._9_polymorphism;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // ho richiamato il costruttore di a quindi oltre ad accedere alle proprietà e i metodi della classe padre, eseguo i metodi della classe figlia

        B aa = new A();

        System.out.println("Classe padre");
        int c = b.metodo(5,5);
        int cFinal = b.metodoFinal(5,5);
        System.out.println(c +  " " + cFinal + "\n");

        System.out.println("sotto classe \n");
        int d = a.metodo(8,5);
        int dFinal = a.metodoFinal(8,5);
        System.out.println(d + " " + dFinal + " \n");

        System.out.println("instanza di B construttore di A");
        int f = aa.metodo(5,10);
        System.out.println(f);
        int fFinal = aa.metodoFinal(5,10);
        System.out.println(f + " " + fFinal);

    }

}
