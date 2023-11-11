package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._3_;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\" +
                "java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileString.txt");
        Path pathNewFile = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\" +
                "java\\develhopePackage\\javaPackage\\src\\main\\resources\\fileWord.txt");
//        ReadAndWrite.createFile(path);
//        ReadAndWrite.writeFile(path);
//        ReadAndWrite.readFile(path,pathNewFile);
        ReadAndWrite.writingStringFiles(path,pathNewFile);
//        ReadAndWrite.writeInOrder();
    }
}
