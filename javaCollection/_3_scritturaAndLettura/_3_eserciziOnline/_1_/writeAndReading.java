package _1_javaExerciseForGithub._3_scritturaAndLettura._3_eserciziOnline._1_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class writeAndReading {

    public static void readFile(Path pathFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        int sum;
        ArrayList<Integer> numeri = new ArrayList<>();
        String leggiRighe = "";
        String[] intSplit;
        try {
            while (br.ready()) {
                leggiRighe = br.readLine();
                intSplit = leggiRighe.split(",");
                for (String n : intSplit) {
                    numeri.add(Integer.parseInt(n));
                }
            }
            br.close();
            sum = numeri.stream().reduce(0, Integer::sum);
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
