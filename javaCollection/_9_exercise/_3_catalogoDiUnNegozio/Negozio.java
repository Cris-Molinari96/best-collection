package _1_javaExerciseForGithub.tutorExe._3_catalogoDiUnNegozio;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Negozio {
    String nameShop;
    List<Articolo> productList;

    public Negozio(String nameShop) {
        this.nameShop = nameShop;
        this.productList = new ArrayList<>();
    }

    public String getNameShop() {return nameShop;}
    public List<Articolo> getproductList() {return productList;}

    public void addArticolo(Articolo articolo, int numeroPezzi) {
        if(articolo.getNumeroPezzi() == 0){
            productList.add(articolo);
            articolo.setNumeroPezzi(articolo.getNumeroPezzi() + numeroPezzi);
        }else{
            articolo.setNumeroPezzi(articolo.getNumeroPezzi() + numeroPezzi);
        }
    }
    public void addListaArticoli(List<Articolo> articoli, int numeroPezzi) {
        for (Articolo articolo : articoli) {
            if(articolo.getNumeroPezzi() == 0){
                    productList.add(articolo);
                    articolo.setNumeroPezzi(articolo.getNumeroPezzi() + numeroPezzi);
            }else{
                    articolo.setNumeroPezzi(articolo.getNumeroPezzi() + numeroPezzi);
                }
            }
    }
    public void removeArticolo(Articolo articolo,int numeroPezzi) {
        if((articolo.getNumeroPezzi() - numeroPezzi) == 0){
            productList.remove(articolo);
        }else{
            articolo.setNumeroPezzi(articolo.getNumeroPezzi() - numeroPezzi);
        }
    }
    public void removeListaArticoli(List<Articolo> articoli,int numeroPezzi) {
        for (Articolo articolo : articoli) {
            if((articolo.getNumeroPezzi() - numeroPezzi) == 0){
                productList.remove(articolo);
            }else{
                articolo.setNumeroPezzi(articolo.getNumeroPezzi() - numeroPezzi);
            }
        }
    }
    // --> Per ogni elemento della lista, lui farà il confronto, solo quando avrà trovato quell'articolo, stamperà magari la disponibilità e se non è presente da un feed "articolo non disponibile"
    // Risolto con un boolean, in modo da poter dare un feedback all'utente se non è presente quell'articolo
    //!  invece questo metodo piuttosto che restituire un articolo, stampa dei valori salvati in una variabile tipo stringa
    public void getArticolo(String s) {
        boolean b = false;
        String st;
        for (Articolo a : productList) {
            if (a.getNomeProduct().strip().toLowerCase().contains(s.strip().toLowerCase())) {
                st = a.getNomeProduct() + "\n"+ a.getDescrizione() + "\n" + a.getPrezzoProduct() + "€\n";
                System.out.println(st);
                b = true;
            }
        }
        if(!b){
            System.out.println("Aricolo non presente nel catalogo");
        }
    }
    //! In questo modo  stiamo recuperando il nome + descrizione + ecc dell'articolo, settando il nuovo articolo che sputerà questo metodo
        // aggiornamento di questo metodo, restituiva un articolo, ma dato che al momento non ci faccio nulla ma voglio solo visualizzare delle infoArticolo, stampa solo
//    public void getArticolo(String s) {
//        Articolo newArticolo = new Articolo("Stringa",0);
//        for (Articolo a : this.listaArticoli) {
//            if (a.getNomeProduct().strip().toLowerCase().contains(s.strip().toLowerCase())) {
//                newArticolo.setNomeProduct(a.getNomeProduct());
//                newArticolo.setPrezzoProduct(a.getPrezzoProduct());
//                newArticolo.setDescrizione(a.getDescrizione());
//                System.out.println(newArticolo.toString()  + a.getDescrizione() + "\n");
//            }
//        }
////        return newArticolo;
//    }

    //! Quest'altro metodo molto bello, ci permette di applicare uno sconto a tutta una categoria di prodotti, come ? -->  giocando con i setter
    // * potrei cercare un modo che applica lo sconto in automatico, giocando con le date
    public void applicaScontoPerTipo(TipoProdotto tp, double sc){
        boolean applicaSconto = false; // --> preme un tasto e diventa true applicando lo sconto
        if (applicaSconto) {
            for (Articolo a : productList) {
                if (a.getTipoProdotto().equals(tp)) {
                    a.applicaSconto(sc);
                    System.out.println(a.getPrezzoProduct() + "€, senza sconto");
                    a.setPrezzoProduct(a.calcolaPrezzoScontato());
                    System.out.println("prezzo scontato: " + a.getPrezzoProduct() + "€");
                }
            }
        }else{
            System.out.println("Gli sconti sono validi solo la prima settimana del mese");
        }
    }
    /**
     * method that generate a _1_list of type products
     */
    public void  generateList() {
        Set<String> nameList = new HashSet<>();
        for (Articolo a : productList) {
            nameList.add(a.getTipoProdotto().getNameCategory());
        }
        nameList.forEach(l -> System.out.println(l));
        List<Articolo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\ninserisci una categoria\n");
        String str = sc.nextLine();
        switch (str) {
            case "pc gaming":
                list.addAll(productList.stream().filter(a -> a.getTipoProdotto().equals(TipoProdotto.PC_Gaming)).toList());
                list.forEach(a -> System.out.println(a));
                break;
            case "pc office":
                list.addAll(productList.stream().filter(a -> a.getTipoProdotto().equals(TipoProdotto.PC_Office)).toList());
                list.forEach(a -> System.out.println(a));
                break;
            default:
                System.out.println("insert the name the category");
        }
    }
    /**
     * @throws IOException
     */
public void saveCatalogo(Path pathFile)throws  IOException{
try{
    BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile.toFile()));
    for (Articolo a : productList) {
        bw.append(a.toString());
    }
bw.close();
    System.out.println("File created with success");
}catch (IOException e){
    System.out.println("An error occurred");
    e.printStackTrace();
}

    }
/**
 * * Un secondo modo forse più semplice
 */
//public void readMyFile(Path path) throws IOException {
//    String[]str = Files.readString(path).split("\n");
//    for (String s : str) {
//        System.out.println(s);
//    }
//}

    /**
     * * come leggere un file esterno
     * @param pathname
     * @throws IOException
     */
    public void readCatalogo(Path pathname) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathname .toFile()));
        while (br.ready()) {
            String[] riga = br.readLine().split("\n");
            for (String s : riga) {
                System.out.println(s);
            }
        }
    }
}
