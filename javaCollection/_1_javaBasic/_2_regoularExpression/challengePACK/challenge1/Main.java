package _1_javaExerciseForGithub._1_javaBasic._2_regoularExpression.challengePACK.challenge1;

public class Main {
    public static void main(String[] args) {
        /* * Scrivere un espressione regolare che matches/corrisponda alla frase esatta (Hello, World!) */
        String input = "Hello, World!";
//        trovaLaParola(input);

        /* * Scrivere un espressione regolare che matches/corrisponda ad una frase che inizia con una lettera maiuscola e termina con un . */
        String[] input2 = {"La ferrari è rossa.","Come stai?","ciao mondo","Porca troia. "};
        trovaLaParola2(input2);


    }
    private static void trovaLaParola(String input){
        String pattern = "^Hello, World!$"; // --> questo è un pattern specifico per trovare l'unica parola esatta

        boolean matches = input.matches(pattern);
        if(matches){
            System.out.println("Input corrisponde al pattern");
        }else{
            System.out.println("Input non corrispondente al pattern");
        }
    }
    private static void trovaLaParola2(String... input2){
        String pattern = "[A-Z].*\\."; //! anche in quest'altra soluzione possiamo capire che dopo la prima Lettera maiuscola sono accetti
        //! qualsiasi tipo di carattere escluso il punto

        // String pattern = "^[A-Z][^.]*\\.$"; //! sto dicendo che l'inizio della stringa dev'essere una maiuscola,
        //! poi devi considerare tutti i caratteri a seguire diversi dal punto e
        //! \\. serve a scappare in quanto il punto è considerato un metacarattere e inoltre stiamo dicendo che la frase deve terminare col .

        for (String s : input2) {
            boolean matches = s.matches(pattern);
            System.out.println("Pattern -> " + pattern + " " + matches + " " +  s );
        }
    }
}
