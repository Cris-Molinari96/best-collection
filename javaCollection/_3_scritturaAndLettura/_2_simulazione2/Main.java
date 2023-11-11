package _1_javaExerciseForGithub._3_scritturaAndLettura._2_simulazione2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path file = new File("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_6_simulazione2/fileString.txt").toPath();
        Path file1 = new File("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_6_simulazione2/fileInteger.txt").toPath();

//        List<String> listString = Checkpoint.loadLines(file);
//        Map<String,Integer> map = Checkpoint.processLines(listString);
//        Checkpoint.writeLines(file1, map);
        Checkpoint.splitMethod();
    }

}
