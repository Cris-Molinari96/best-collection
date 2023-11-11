package _1_javaExerciseForGithub._1_javaBasic._2_regoularExpression._1_introRE;

public class Main {
    public static void main(String[] args) {
        // il metodo formatted sosituisce i segnaPosto con gli argomenti pasasti al metodo,
        // i quali prendono il nome di argomenti di sostituzione

        String first = "%s %s %s %s".formatted("Hello","World","\nfuck","all!!");
        String second = String.format("%s %s","Hello","World","\nFucckkk","allllll!!!!!");

        System.out.println("String first format: " + first);
        System.out.println("String second format: " + second);
        String third = Main.format("%s %s %s","Hello","Fuck world!","My");
        System.out.println("String third format: " + third);

    }

    /* * Questo metodo accetta una regex, e n argomenti, all'interno del metodo viene utilizzata l'index pertenere traccia degli argomenti di sostituire
       * dove il placeholder %s sarà sostituito con gli argomenti di sostituzione.
       ! In sintesi, il metodo format prende una stringa di formato e un elenco di argomenti, cerca i placeholder %s nella stringa di formato
       ! e li sostituisce con gli argomenti corrispondenti. Il ciclo while controlla se ci sono ancora placeholder da sostituire e
       ! il metodo replaceFirst li sostituisce uno per uno. Alla fine, la stringa risultante con le sostituzioni viene restituita dal metodo.
    */
    public static String format(String regexp, String... args){
        int index = 0; // questo index tiene traccia degli argomenti di sostiutizone

        while(regexp.matches(".*%s*.")){
            System.out.println(index);
            regexp = regexp.replaceFirst("%s",args[index++]); // questo metodo sostituirà il simbolo %s con gli argomenti di sostituzione
        }

        return regexp;
    }
}
