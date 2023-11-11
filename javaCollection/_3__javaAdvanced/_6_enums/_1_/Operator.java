package _1_javaExerciseForGithub._3__javaAdvanced._6_enums._1_;

public enum Operator {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    String op;

    Operator(String op) {this.op = op;}

    double a ;
    double b ;

    public String getOp() {return op;}
    public void setOp(String op) {this.op = op;}

    // Terzo modo --> ossia passandogli una variabile, ad esempio plus
    public void riconosciVariabile(double a, Operator x, double b){
        switch (x){
            case  ADD -> System.out.println(a + b);
            case  SUBTRACT -> System.out.println(a - b);
            case  MULTIPLY -> System.out.println(a * b);
            case  DIVIDE -> System.out.println(a / b);
        }
    }

    // Primo modo --> gli passiamo la stringa E poi quando richiamiamo quel metodo, l'estraiamo dal getOp
    public void segno(double a, String s, double b){
        switch (s.strip()){
            case"+" -> System.out.println(a + b);
            case"-" -> System.out.println(a - b);
            case"*" -> System.out.println(a * b);
            case"/" -> System.out.println(a / b);
        }
    }

    // Secondo modo --> gli passiamo direttamente l'enumerazione quindi non abbiamo bisogno del construct
    public void operation(double a , Operator x, double b){
        switch (x){
            case ADD -> System.out.println(a + b);
            case SUBTRACT -> System.out.println(a - b);
            case MULTIPLY -> System.out.println(a * b);
            case DIVIDE -> System.out.println(a / b);
        }
    }
}
