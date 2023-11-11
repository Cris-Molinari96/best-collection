package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._5_;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

    Path pathFile = Path.of("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\checkPoint\\untitled\\src\\resources\\String.txt");

    List<String> listString = Check.processLine("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\checkPoint\\untitled\\src\\resources\\String.txt");

Map<Character,Integer> newMap =  Check.processLines(listString);

        Check.writeFile("C:\\Users\\39351\\Work-Area\\documentazioneInformatica\\java\\develhopePackage\\checkPoint\\untitled\\src\\resources\\NewString.txt",newMap);
    }
}
