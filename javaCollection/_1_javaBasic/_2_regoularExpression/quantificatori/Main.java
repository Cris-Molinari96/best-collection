package _1_javaExerciseForGithub._1_javaBasic._2_regoularExpression.quantificatori;

public class Main {
    public static void main(String[] args) {

    /* ? QUANTIFICATORI*/
//        String testString = "Anyone Abcde tutti possono imparare abc's,123's, bny any java e Anche le regoluar expression - java";
//        String rimpiazza = "(-)";
//        functionExampleIntro(testString,rimpiazza);
//        replaceQuantificatorePer(testString,rimpiazza); // *
//        replaceQuantificatorePlus(testString,rimpiazza); // +
//        replaceQuantificatoreBrackets(testString,rimpiazza); // {}

    /* ? CARATTERI SPECIALI / BOUNDARY MATCHERS*/
//        String testString = "Anyone Abcde tutti possono imparare abc's,123's, bny any java e Anche le regoluar expression - java";
//        String rimpiazza = "(-)";
//        dollarCharacters(testString,rimpiazza);

        /* ? METODI UTILIZZATI DALLE ESPRESSIONI REGOLARI */
        String testo = """
                Double, double toil and trouble;
                "Fire burn and caldron bubble.
                "Fillet of a fenny snake,
                "In the caldron boil and bake
                "Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                """;

        splitMethod(testo);
        replaceMethod(testo);
    }

    // ! QUANTIFICATORI
    private static void functionExampleIntro(String testo, String rim) {
        String[] patternRegex = {
                "abc","123","java","A" // qui si definiscono i caratteri del testo che devono essere sostituiti
        };

        // il patternRegex cerca corrispondenze esatte per abc - 123 ecc
        for (String regex : patternRegex) {
            String output = testo.replaceFirst(regex,rim); // -> ci permette di sostituire
            // una volta trovata l'occorenza definita nel pattern, col carattere di rimpiazzamento
            System.out.println("Pattern - regex -> " + regex + " replace -> " + output );
        }
    }

    private static void replaceQuantificatorePer(String testString, String rim) {
        String[] patternClassRegex = {
                "[a-dA-D]*",
                "[0-9]*",
                "[java]*",
                "[A]*" // qui si definiscono i caratteri del testo che devono essere sostituiti
        };


        System.out.println("\n--------\n");
        System.out.println("Quantificatore universale");

        // il patternClassRegex cerca corrispondenze esatte per singoli caratteri quindi 'a' 'b' 'c'
        for (String regex : patternClassRegex) {
            String output = testString.replaceFirst(regex,rim); // -> ci permette di sostituire
            // una volta trovata l'occorenza definita nel pattern, col carattere di rimpiazzamento
            System.out.println("Pattern - regex -> " + regex + " replace -> " + output );
        }
    }
    private static void replaceQuantificatorePlus(String testString, String rim) {
        String[] patternClassRegex = {
                "[a-dA-D]+",
                "[0-9]+",
                "[java]+", // --> non funziona in questo modo la ricerca per la singola parola
                "[A]+" // qui si definiscono i caratteri del testo che devono essere sostituiti
        };


        System.out.println("\n--------\n");
        System.out.println("Quantificatore plus");

        // il patternClassRegex cerca corrispondenze esatte per singoli caratteri quindi 'a' 'b' 'c'
        for (String regex : patternClassRegex) {
            String output = testString.replaceFirst(regex,rim); // -> ci permette di sostituire
            // una volta trovata l'occorenza definita nel pattern, col carattere di rimpiazzamento
            System.out.println("Pattern - regex -> " + regex + " replace -> " + output );
        }
    }

    private static void replaceQuantificatoreBrackets(String testString, String rim) {
        String[] patternClassRegex = {
                "[a-dA-D]{2}",
                "[0-9]{2}",
                "[java]+", // --> non funziona in questo modo la ricerca per la singola parola con le cornici
                "[A]+" // qui si definiscono i caratteri del testo che devono essere sostituiti
        };


        System.out.println("\n--------\n");
        System.out.println("Quantificatore { }");

        // il patternClassRegex cerca corrispondenze esatte per singoli caratteri quindi 'a' 'b' 'c'
        for (String regex : patternClassRegex) {
            String output = testString.replaceFirst(regex,rim); // -> ci permette di sostituire
            // una volta trovata l'occorenza definita nel pattern, col carattere di rimpiazzamento
            System.out.println("Pattern - regex -> " + regex + " replace -> " + output );
        }
    }

    // ! CARATTERI SPECIALI / BOUNDARY MATCHERS --> ^ - \b - $

    private static void dollarCharacters(String testString, String rim) {
        String[] patternClassRegex = {
                "[a-zA-Z]*$", // * sostituirà l'occorenza che si trova a fine riga
                "^[a-zA-Z]{3}", // * sostituirà i primi 3 caratteri della prima parola
                "\b\bjava\b\b",
                "[aA]ny\\b" // * scritto in questo modo la regex, l'espressione corrisponderà ad una parola any o Any
        };


        System.out.println("\n--------\n");
        System.out.println("Carattere speciale --> *$ - ^ - \\b ");

        // il patternClassRegex cerca corrispondenze esatte per singoli caratteri quindi 'a' 'b' 'c'
        for (String regex : patternClassRegex) {
            String output = testString.replaceFirst(regex,rim); // -> ci permette di sostituire
            // una volta trovata l'occorenza definita nel pattern, col carattere di rimpiazzamento

            System.out.println("Pattern - regex -> " + regex + " replace -> " + output );
        }
    }

    /* ? METODI UTILIZZATI DALLE ESPRESSIONI REGOLARI */
    private static void splitMethod(String song){
        String[] counterlines = song.split("\n"); // contatore di linee
        String[] counterWord = song.split("\\s"); // contatore di parole

        System.out.println("Numero di righe --> " + counterlines.length);
        System.out.println("Numero di parole --> " + counterWord.length );

    }

    private static void replaceMethod(String song){

        System.out.println(song.replaceAll("[a-zA-Z]+ron","[fuckkk]"));

    }
}
