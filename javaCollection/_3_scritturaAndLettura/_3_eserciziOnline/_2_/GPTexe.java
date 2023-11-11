package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._2_;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GPTexe {

    public static List<String> readWithFiles(Path pathFile)throws  IOException{
        String nomiFile = Files.readString(pathFile);
        String[] n = nomiFile.split("\n");
        return Arrays.stream(n).sorted().toList();
    }

    public static void writeWithFiles(Path pathFile)throws IOException{

        StringBuilder sb = new StringBuilder();

    }

    public static void creaFile (Path pathFile) throws IOException {
        Files.createFile(pathFile);
    }
    public static void writeFile(Path pathFile) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter(pathFile.toFile()));
        List<String> nomi = new ArrayList<>();
        nomi.addAll(Arrays.asList("Cristian","Alberto","Marco","Federico"));
        nomi.forEach(n -> {
            try {
                bf.write(n + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bf.close();
    }
    public static void readAndWriting(Path newFile,Path pathFile)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        List<String> orderName = new ArrayList<>();
        String s ;
        while (br.ready()){
            s = br.readLine();
            orderName.add(s);
        }
        br.close();
        List<String> listName = orderName.stream().sorted().toList();
        Files.createFile(Path.of("newFile"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile.toFile()));
        for (String stringName : listName) {
            bw.write(stringName + "\n");
        }
        bw.close();
    }
}
