package _1_javaExerciseForGithub._3_scritturaAndLettura._2_simulazione2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
//import java.util.Map;

public class Checkpoint {
    public static List<String> loadLines(Path filePath)throws IOException{
        return Files.lines(new File(filePath.toUri()).toPath()).toList();
    }

    public static Map<String,Integer> processLines(List<String>lists)throws IOException{
        Map<String,Integer>map = new HashMap<>();
        for (String word : lists) {
            if(word.length() == 0)continue;
            if (!word.contains("$")) System.out.println("Error : $ not present");
            else{
                String[]str = word.split("\\$");
                for (String s : str) {
                    String chiave = str[0];
                    int sum = str[1].strip().length();
                    map.put(chiave, sum);
                }
            }
        }
        return map;
    }

    public static void writeLines(Path pathFile, Map<String, Integer> map)throws  IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
        for (String key : map.keySet()){
            bw.write(key + " " +  map.get(key));
        }
        bw.close();
    }

    public static void splitMethod(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sp = str.split(" "); // --> ogni volta che incontra uno spazio, va a capo
        for (int i = 0; i < sp.length; i++) {
//            System.out.println(i); //! --> stampa la posizione della parola nell'array
//            System.out.println(sp[i]); // --> stampa la parola
        }
    }

}
