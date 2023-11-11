package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._3_;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ReadAndWrite {

    public static Path createFile(Path pathFile)throws IOException {
        return Files.createFile(pathFile);
    };

    public static void writeFile(Path pathFile)throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
        List<String> names = new ArrayList<>(Arrays.asList("Cristian", "Rosaria", "Enzo", "Martina", "Eduardo", "Romina", "Paolo", "Francesca", "Miriam", "Gioia", "Vittoria"));
        for (String name : names) {
            bw.write(name + ",\n");
        }
        bw.close();
    }

    public static void readFile(Path pathFile,Path pathNewFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        List<String> listName = new ArrayList<>();
        TreeMap<String, Integer> mapSorted = new TreeMap<>();
        while (br.ready()) {
            String name = br.readLine();
            String[] splitName = name.replaceAll(",", " ").split(" ");
            for (String n : splitName) {
                listName.add(n);
            }
        }
        br.close();
        List<String> sortedNameList = listName.stream().sorted().toList();
        int id = 0;
        for (String nameSorted : sortedNameList) {
            mapSorted.put(nameSorted, id++);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(pathNewFile.toFile()));
        for (Map.Entry<String, Integer> entry : mapSorted.entrySet()) {
            bw.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        bw.close();
    }

    /**
     *Reading and Writing with FILES
     */
    public static void readStringFiles(Path pathFile)throws IOException{
        Files.lines(pathFile).forEach(riga -> {
            Arrays.stream(riga.split("  ")).forEach(System.out::println);
        });
    }
    public static void writingStringFiles(Path pathFile,Path pathNewFile) throws IOException{
        String test = Files.readString(pathFile);
        List<String> lines ;
        lines = List.of(test.replaceAll("," ," ").split("  "));
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line);
        }
        Files.writeString(pathNewFile, sb);
    }
}

