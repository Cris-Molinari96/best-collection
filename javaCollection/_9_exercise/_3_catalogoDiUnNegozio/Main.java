package _1_javaExerciseForGithub.tutorExe._3_catalogoDiUnNegozio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        final Path PATH = Paths.get("src/main/java/argoumentsAndExercise/_exeDevelhope/tutorExe/_3_CatalogoDiUnNegozio/fileName.txt");

        Articolo macPc = new Articolo("Pc Mac", 1000, "Pc alta risoluzione d'img", TipoProdotto.PC_Office);
        Articolo msiPc = new Articolo( "Pc MSI", 2000, "Pc da gaming" , TipoProdotto.PC_Gaming);
        Articolo msiPcPortatile = new Articolo( "MSI game", 1599, "Pc da gaming" , TipoProdotto.PC_Gaming);
        Articolo iphone14 = new Articolo("iphone 14", 1299, "Smartphone con una fotocamera ad alta risoluzione", TipoProdotto.Smartphone_Apple);
        Articolo galaxySpace = new Articolo("galaxy SE", 1299, "Smartphone pieghevole", TipoProdotto.Smartphone_SGalaxy);
        Articolo galaxy22 = new Articolo("galaxy 22", 1299, "Smartphone pieghevole", TipoProdotto.Smartphone_SGalaxy);

        Negozio newNegozioRoma = new Negozio("TuttoPC");

        List<Articolo>listArticle = Arrays.asList(macPc,msiPc,msiPcPortatile,iphone14,galaxySpace,galaxy22);
        List<Articolo>newList = Arrays.asList(macPc,msiPcPortatile,galaxy22);

        System.out.println(newNegozioRoma.getproductList());
//        newNegozioRoma.saveCatalogo(PATH);
//        newNegozioRoma.readCatalogo(PATH);
//        newNegozioRoma.saveCatalogo(PATH);
    }
}
