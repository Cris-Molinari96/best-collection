package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._1_;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileInteger.txt");
        writeAndReading.readFile(pathFile);
    }
}
