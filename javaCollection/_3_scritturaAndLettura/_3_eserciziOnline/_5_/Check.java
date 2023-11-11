package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._5_;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check {
    public static List<String> processLine(String pathFile)throws IOException {
        List<String> listString = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(pathFile));
        while(br.ready()){
            String str = br.readLine().strip();
            listString.add(str);
        }
        return listString;
    }

    public static Map<Character, Integer> processLines(List<String> listString)throws IOException{
        Map<Character,Integer> map = new HashMap<>();
        for (String riga : listString) {
            if(riga.length() == 0) System.out.println("La riga è vuota!");
            else {
                String[] splitString = riga.split("\\W+");
                for (String word : splitString) {
                    if(word.length() == 0)continue;
                    if(map.containsKey(word.charAt(0))){
                        map.put(word.charAt(0), map.get(word.charAt(0)) + 1);
                    }else{
                        map.put(word.charAt(0), 1);
                    }
                }
            }
        }
        return map;
    }

    public static void writeFile(String fileName, Map<Character,Integer> map)throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (Map.Entry<Character,Integer> entry :map.entrySet()){
            bw.append(entry.getKey() +" --> " + entry.getValue() +"\n");
        }
        bw.close();
    }
}
