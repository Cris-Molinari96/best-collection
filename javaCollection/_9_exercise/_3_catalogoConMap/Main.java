package _1_javaExerciseForGithub.tutorExe._3_catalogoConMap;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final Path PATH = Paths.get("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_3_catalogoConMap/fileName.txt");

        Shop JMarket = new Shop("JMarket");
        Article iphone11 = new Article("Iphone 11", 500,"apple telephone", EnumTypeProduct.APPLE,0);
        Article iphone12 = new Article("Iphone 12", 800,"apple telephone", EnumTypeProduct.APPLE,0);
        Article iphone13 = new Article("Iphone 13", 1_000,"apple telephone", EnumTypeProduct.APPLE,0);
        Article iphone14 = new Article("Iphone 14", 1_200,"apple telephone", EnumTypeProduct.APPLE,0);
        Article galaxy19 = new Article("ss19", 500, "galaxy telephone",EnumTypeProduct.SAMSUNG,0);
        Article galaxy20 = new Article("ss20", 800, "galaxy telephone",EnumTypeProduct.SAMSUNG,0);
        Article galaxy21 = new Article("ss21", 1_000, "galaxy telephone",EnumTypeProduct.SAMSUNG,0);
        Article galaxy22 = new Article("ss22", 1_200, "galaxy telephone",EnumTypeProduct.SAMSUNG,0);

        List<Article> articlesList = Arrays.asList(iphone11,iphone12,iphone13,iphone14,galaxy19,galaxy20,galaxy21,galaxy22);

        JMarket.addListArticle(articlesList, 5);
        JMarket.removeListArticle(articlesList, 5);

        System.out.println(JMarket.getCatalogoShop());

//        JMarket.saveCatalogo(PATH);
//        JMarket.readCatalogo(PATH);

    }
}
