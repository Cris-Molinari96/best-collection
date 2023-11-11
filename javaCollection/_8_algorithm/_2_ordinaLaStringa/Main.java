package _1_javaExerciseForGithub._8_algorithm._2_ordinaLaStringa;

public class Main {
    public static void main(String[] args) {

        // Ordinamento di una stringa in ordine alfabetico brutte merde

        String str = "genuanferoapsdfwr";

        char[] ac = new char[str.length()];
        boolean sca;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ac[i] = c;
        }

        do {
            // fintanto che c'è un scambio che viene effettuato nella condizione if, allora sca divento true;
            sca = false;
            for (int i = 1; i < ac.length; i++) {
                if (ac[i - 1] > ac[i]) {
                    char c = ac[i - 1];
                    ac[i - 1] = ac[i];
                    ac[i] = c;
                    sca = true;
                }
            }
        } while (sca);

        for (char c : ac) {
            System.out.println(c);
        }

    }
}
