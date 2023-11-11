package _1_javaExerciseForGithub._3_scritturaAndLettura._1_paroleEFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ParoleEFile {
    /**
     * @File
     * method that create a newFile
     * if file already exists print "file already"
     */
    public File createNewFile() throws IOException {

        File myFile = new File("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_5_paroleEFile/fileName.txt");
        try{
        if(myFile.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exists");
        };
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return myFile;
    }
    /**
     *
     * @BufferedWriter
     * @BufferedReader
     */
    public static void createWriteReadToFile(Path pathFile)throws  IOException{
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
        bw.write("Il soldato è tornato passando per un ponte vicino a una fonte");
        bw.append("Il soldato è tornato passando per un ponte vicino a una fonte");
        bw.close();
        System.out.println("File created and write with success");

        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        while (br.ready()){
            String[]str=br.readLine().split(" ");
            for (String s : str) {
                System.out.println(s);
            }
        }
        br.close();
        }catch(Exception e){

            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    /**
     *
     * @BufferedWriter
     * that method create a file
     * and write in to file created
     */
    public static void writeInFile(Path pathFile) throws IOException {
        try{
        BufferedWriter bf = new BufferedWriter(new FileWriter(pathFile.toFile()));
        bf.append("Il soldato è tornato passando per un ponte vicino a una fonte");
        bf.close();
            System.out.println("Write to file success");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    /**
     * @write to file su più righe
     */
    public static void writeInFile2(Path pathFile) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
        String str = "Il soldato è tornato passando per un ponte vicino a una fonte\n";
//        String[]sp = str.split(""); // --> stampa in verticale lettera per lettera
        String[]sp = str.split("\n"); // --> stampa in orizzontale tutta la frase
        for (int i = 0; i < 5 ; i++) {
            for (String s : sp) {
            bw.append(s + "\n");
            }
        }
        bw.close();
    }
    /**
     * @reader2
     */
    public static void readFile2(Path pathFile)throws  IOException{
        try{
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        while (br.ready()){
//            String str = br.readLine(); // Senza lo split leggo i file linea per linea
            String[] str = br.readLine().split(" "); // --> leggo parola per parola
            for (String s : str) {
                System.out.println(s);
            }
        }
br.close();
            System.out.println("File read with success");
        }catch(IOException e ){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }

    /**
     * @PrintWriter
     */
    public static void printWriter(Path pathFile)throws IOException{
//        FileWriter fw = new FileWriter(pathFile.toFile()); // --> ci risparmiamo una riga in questo modo
        PrintWriter pw = new PrintWriter(new FileWriter(pathFile.toFile()));
        pw.println("Il soldato è tornato passando per un ponte vicino a una fonte");
        pw.println("Il soldato è tornato passando per un ponte vicino a una fonte");
        pw.println("Il soldato è tornato passando per un ponte vicino a una fonte");
        pw.close();
    }

    /**
     * @Files
     */
    public static void methodFiles(Path pathD,Path pathF)throws IOException {
        try{
            // Potrei direttamente creare il mio percorso qui dentro senza inserire alcun parametro
            Path pathFile = Paths.get(pathF.toUri()); // Path.get("percorso/percorso");
            Path pathDirectory = Paths.get(pathD.toUri()); // Path.get("percorso/percorso");
            // CREA DIRECTORY E FILE
            Path myDirectory = Files.createDirectory(pathDirectory);
            Path myFile = Files.createFile(pathFile);

            System.out.println("Directory and File created with success");
            String str = "write on write on several lines";
            String[]sp = str.split("\n" );
            for (String s : sp) {
            Files.writeString(myFile,s);
            }


        }catch (Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
/**
 * ho il mio file, prima lo devo leggere e poi inserire le stringhe dentro la mappa come chiavi, recuperare la length per i valori
 */
public static Map<String,Integer> countOccurrencesWord(Path pathFile) throws IOException{
    try{
    LinkedHashMap<String,Integer> wordMap = new LinkedHashMap<>();
    BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
    while(br.ready()){
        String[] str = br.readLine().split(" ");
        for (String s : str) {
            if(wordMap.containsKey(s)){
                wordMap.put(s,wordMap.get(s) + 1);
            }else{
                wordMap.put(s, 1);
            }
        }
    }
        br.close();
        System.out.println("Mappa generata con successo");
    return wordMap;
    }catch (IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();
    }
    return null;
}

public static Map<String, Set<String>> paroleInRima(Path pathFile) throws IOException {
    Map<String, Set<String>> mapRimata = new HashMap<>();
    BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
    Set<String> setStringhe = new HashSet<>();
    while (br.ready()) {
        String[] parole = br.readLine().toLowerCase().split("\\W+");
        for (String parola : parole) {
            parola = parola.replaceAll("[0-9]", "");
            if (parola.length() < 4) continue;
            char terzUltimo = parola.charAt(parola.length() - 3);
            String dittongo;
            if (terzUltimo == 'a' || terzUltimo == 'e' || terzUltimo == 'i' || terzUltimo == 'o' || terzUltimo == 'u') {
                dittongo = parola.substring(parola.length() - 3); // estrae una sottoString  in questo caso da -3 a length -1 quindi tutto il terzetto di una parola
                if(setStringhe.contains(parola))continue;
                mapRimata.put(dittongo, setStringhe);
            }else{
                setStringhe.add(parola);
                dittongo = parola.substring(parola.length() - 4);
                mapRimata.put(dittongo,setStringhe);
            }
        }
    }
    br.close();
    return mapRimata;
}
}
