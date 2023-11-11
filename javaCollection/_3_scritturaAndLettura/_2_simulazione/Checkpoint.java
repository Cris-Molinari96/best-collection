package _1_javaExerciseForGithub._3_scritturaAndLettura._2_simulazione;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkpoint {
    public static void createFile(Path pathFile)throws  IOException{
        String abc = "Domani vado a scuola\n" +
                "Giovedi ho il checkpoint\n" +
                "Parole sensa senso\n" +
                "Una rima più forte di prima\n";
        FileWriter file = new FileWriter(pathFile.toFile());
        BufferedWriter bw = new BufferedWriter(file);
        for (int i = 0; i < 10; i++) {
            bw.write(abc + "\n");
        }
        bw.close();
    }

    public static List<String>loadLines(String pathFile)throws IOException {
    List<String>listString = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(pathFile));
    while(br.ready()){
        String[] sp = br.readLine().split("\n" );
        for (String s : sp) {
        listString.add(s + "\n");
        }
    }
        br.close();
return listString;
//        return Files.lines(new File(pathFile).toPath()).toList();
    }

    public static Map<Integer,String>processLines(List<String> lines)throws IOException{
        Map<Integer,String>mappa = new HashMap<>();
        for (String line : lines) {
            if(line.length() == 0)continue;
            int len =  line.strip().length();
            if(mappa.containsKey(len))System.out.println("Attenzione linea già presente");
            else{
                mappa.put(len, line.substring(0, line.length()/2));
            }
        }
        return mappa;
    }

    public static void writeLines(Path pathFile, Map<Integer,String> map)throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));

        for (Integer key : map.keySet()) {
            bw.write(map.get(key).toUpperCase() + " \n");
        }

//        for(Map.Entry<Integer,String> entry : map.entrySet()){
//            bw.append(entry.getKey() + " " + entry.getValue());
//        }
        bw.close();
    }


}
