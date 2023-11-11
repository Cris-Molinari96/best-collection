package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._2_;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileName.txt");
        Path pathNewFile = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileNameSorted.txt");

        System.out.println(GPTexe.readWithFiles(pathFile));


//        GPTexe.creaFile(pathFile);
//        GPTexe.writeFile(pathFile);
//        GPTexe.readAndWriting(pathNewFile,pathFile);
    }
}
