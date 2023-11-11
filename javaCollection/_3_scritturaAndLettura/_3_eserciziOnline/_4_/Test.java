package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._4_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Test {

    public static void countLine(Path pathFile)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
           int line = 0 ;
        while(br.ready()){
            String[] str = br.readLine().strip().split(" ");
            for (String s : str) {
                if (s.length() == 0) continue;
                System.out.println(s);
                line++;
            }
        }
        br.close();
        System.out.println(line);
    }

    /**
     * thaht method count the word
     */
    public static Map<String,Integer> countWord(Path pathFile)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        Map<String,Integer> countWord = new HashMap<>();
        while (br.ready()) {
        String[] splitString = br.readLine().strip().split(" ");
            for (String s : splitString) {
                    if(s.length() == 0)continue;
                if(countWord.containsKey(s)){
                 countWord.put(s, countWord.get(s)+1);
                }else{
                    countWord.put(s,1);
                }
            }
        }
        return countWord;
    }

    public static void printWordFiles(Path pathFile) throws IOException{
        Files.lines(pathFile).forEach(riga -> Arrays.stream(riga.split(" ")).forEach(System.out::println));
    }

    public static Map<String, Integer> countOccurrencesWord(Path pathFile) throws IOException{
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        while (br.ready()) {
            String[]testo = br.readLine().replaceAll(",", " ").split(" ");
            for (String parola : testo) {
                if (parola.equals("$")) continue;
                if (linkedHashMap.containsKey(parola)) {
                    linkedHashMap.put(parola, linkedHashMap.get(parola) + 1);
                } else {
                    linkedHashMap.put(parola, 1);
                }
            }
        }
        return linkedHashMap;
    }

    public static HashMap<String, Set<String>> paroleInRima(Path pathFile)throws IOException{
        HashMap<String, Set<String>> mapRimata = new HashMap<>();
        Set<String> setString = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        while(br.ready()){
            String[] testo = br.readLine().replaceAll(",", " ").toLowerCase().strip().split(" ");
            for (String word : testo) {
                if (word.length() < 4) continue;
                char terzetto = word.charAt(word.length() - 3);
                String dittongo;
                if (terzetto == 'a' || terzetto == 'e' || terzetto == 'i' || terzetto == 'o' || terzetto == 'u') {
                    dittongo = word.substring(word.length() - 3);
                    if (setString.contains(word)) continue;
                    mapRimata.put(String.valueOf(mapRimata.get(dittongo)), setString);
                } else {
                    setString.add(word);
                    dittongo = word.substring(word.length() - 4);
                    mapRimata.put(dittongo, setString);
                }
            }
        }
        br.close();
        return mapRimata;
    }

}
