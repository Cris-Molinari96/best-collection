package _1_javaExerciseForGithub._3_scritturaAndLettura._1_paroleEFile;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
//        Path pathFile1 = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\javaPackage\\src\\main\\java\\argoumentsAndExercise\\_exeDevelhope\\exe_3_scritturaAndLettura\\_1_paroleEFile");
//        Path pathDirectory = new File("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_5_paroleEFile/resources").toPath();
//        Path file = new File("src/fileName.txt").toPath();
//        ParoleEFile f = new ParoleEFile();
//        f.createNewFile();
//        Map<String, Integer> newHash = ParoleEFile.countOccurrencesWord(pathFile1);
//        ParoleEFile.writeInFile(pathFile1);
//        System.out.println(ParoleEFile.paroleInRima(file));
//        ParoleEFile.createWriteReadToFile(pathFile1);
//        ParoleEFile.printWord(pathFile1);
//        ParoleEFile.printWriter(pathFile1);
//        ParoleEFile.methodFiles(pathDirectory, file);
//    ParoleEFile.writeInFile2(file);
//    ParoleEFile.readFile2(file);
        Path path = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\" +
                "java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileString.txt");
        System.out.println(ParoleEFile.countOccurrencesWord(path));
    }
}