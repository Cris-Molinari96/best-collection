package _1_javaExerciseForGithub._3__javaAdvanced._7_tryCatch;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        try{

            readOrderTxt(Path.of("newFile.txt"));

        }catch( IOException ioException){
            ioException.printStackTrace();
        }

    }

    public static String readOrderTxt(Path path) throws IOException {
        String fileContent = " Ciao, ho ordinato un cheeseburgher";
        boolean fileDoesNotExists = true ;

        if(fileDoesNotExists){
            throw  new IOException("File does not exist!");
        }
        return  fileContent;
    }

}
