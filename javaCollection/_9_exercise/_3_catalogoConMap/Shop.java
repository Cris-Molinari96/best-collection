package _1_javaExerciseForGithub.tutorExe._3_catalogoConMap;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

/**
 * This class represent a shop contains the map of articles
 */
public class Shop {
    String name;
    Map<Article, Integer> catalogoShop;

    //COSTRUTTORE
    Shop(String name) {
        this.name = name;
        this.catalogoShop = new HashMap<>();
    }
    // GETTER E SETTER
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Map<Article, Integer> getCatalogoShop() {return catalogoShop;}
    public void setCatalogoShop(Map<Article, Integer> catalogoShop) {this.catalogoShop = catalogoShop;}

    /**
     * that method adds an article to the map
     * @param article
     * @param nPezzi
     */
    public void addArticle(Article article,int nPezzi){
        int sumPezzi = article.getNumeroPezzi() + nPezzi;
        catalogoShop.put(article,sumPezzi);
        article.setNumeroPezzi(sumPezzi);

    }
    /**
     * that method add a _1_list of article to the map
     * @param articles
     * @param nPezzi
     */
    // Come aggiorno il numero dei pezzi --> risolto con un doppio loop
    public void addListArticle(List<Article> articles, int nPezzi) {
        for (Article article : articles) {
            int sumPezzi = article.getNumeroPezzi() + nPezzi;
            catalogoShop.put(article, sumPezzi);
            article.setNumeroPezzi(sumPezzi);
        }
    }
    /**
     * that method remove an article to the map
     * @param article
     * @param nPezzi
     */
    public void removeArticle(Article article,int nPezzi) {
        for (Map.Entry<Article, Integer> entry : catalogoShop.entrySet()){
            int sumPezzi = entry.getValue() - nPezzi;
            if(entry.getKey().name.equals(article.name)){
                article.setNumeroPezzi(sumPezzi);
                if(article.getNumeroPezzi() <= sumPezzi){
                    catalogoShop.remove(article);
                }else{
                    article.setNumeroPezzi(sumPezzi);
                }
            }
        }
    }
    /**
     * that method remove a _1_list of article to the map
     * @param articles
     * @param nPezzi
     */
    public void removeListArticle(List<Article> articles, int nPezzi) {
        for (Article article : articles) {
            for (Map.Entry<Article, Integer> entry : getCatalogoShop().entrySet()) {
                int sumPezzi = entry.getValue() - nPezzi;
                if (article.equals(entry.getKey())) {
                    if (sumPezzi <= 0) {
                        catalogoShop.remove(article);
                        System.out.println("Articoli terminati");
                    } else {
                        article.setNumeroPezzi(sumPezzi);
                        catalogoShop.put(article, sumPezzi);
                    }
                }
            }
        }
    }

public Article searchArticle(String articolo){
        for (Article a : catalogoShop.keySet()){
            if(catalogoShop.containsKey(articolo)){
                return a;
            }
        }
        return null;
}
public Map<String,Integer> orderArticle(){
    Map<String, Integer> orderShop = new HashMap<>();
    int numRandomOrderPezzi = (int) (Math.random() * 10);

    return orderShop;
}

public void buyArticle(){

}

    /**
     * that method allows you to save a catalog of items in the shop
     * @param pathFile
     * @throws IOException
     */
    public void saveCatalogo(Path pathFile) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
    for (Map.Entry<Article,Integer> entry : catalogoShop.entrySet()){
        bw.append(entry.getKey().toString()+ "\n");
    }
    bw.close();
}

    /**
     * that method read a file
     * @param pathFile
     * @throws IOException
     */
    public void readCatalogo(Path pathFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathFile.toFile()));
        while (br.ready()) {
            String[] riga = br.readLine().split("\n");
            System.out.println(Arrays.toString(riga));
        }
        br.close();
    }
}
