package _1_javaExerciseForGithub._3__javaAdvanced._5_streamAndMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "the fox and the lazy dog saw another fox with another not lazy dog";

        List <String> newString = Arrays.stream(str.split(" ")).toList() ;
        List <String> newString2 = Arrays.asList(str.split(" ")) ;

        System.out.println(newString);
        System.out.println(newString2.stream().count());

        exercise3(); // richiamato qui
    }
    // Metodo non legato alla classe
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        System.out.println("-->"+words);
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        System.out.println(words.stream().count()); // conta quante lettere sono presenti
        wordCount.put(str, 14);
        wordCount.put(str, null);

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            int count = 0;
            if(wordCount.containsValue(entry.getValue())){ //! Questa è una condizione che controlla se il valore nella mappa è nullo
                wordCount.put(str, ++count);
            };
        }
    }
}
