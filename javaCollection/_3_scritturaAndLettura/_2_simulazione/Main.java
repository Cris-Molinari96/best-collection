package _1_javaExerciseForGithub._3_scritturaAndLettura._2_simulazione;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Path file = new File("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_6_simulazione/file.txt").toPath();
        Checkpoint.createFile(file);

        List<String> righeTesto = Checkpoint.loadLines("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_6_simulazione/file.txt");
        System.out.println(righeTesto);

        Map<Integer,String> map = Checkpoint.processLines(righeTesto);

        Checkpoint.writeLines(file, map);
    }
}
