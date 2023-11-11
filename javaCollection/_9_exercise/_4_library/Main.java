package _1_javaExerciseForGithub.tutorExe._4_library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Library ibs = new Library("ibs","Via novecento", Arrays.asList(), Arrays.asList());
        Book padreRicco = new Book("padre ricco, padre povero", "Robert k","NFUWEN12");
        Book riccoPardre = new Book("ricco padre,  povero padre", "k Robert","21NERWUFR");
        Book java = new Book("java", "Marco Adriani","FVNERUFBN594");
        Book php = new Book("php", "Giuseppe Rossi","MCREBVEYR65");
        Book python = new Book("python", "Andre Blu","NMYITMB99");
        Book  javascript = new Book("javascript", "Roberto black","VBEMIRNCW124");
        Book  javascript1 = new Book("javascriptAdvanced", "Carlo Verdi","VNEURBV6589");
        Book  matematica = new Book("matematica", "Anna Bianchi","XXXXPPP");
        Book  italiano = new Book("italiano", "Serena Verdi","VXWEX");
        Book  latino = new Book("latino", "Giulio Cesare","ESTROM");

    ArrayList<Book> libriProgrammazione = new ArrayList<>(Arrays.asList(java,javascript,php,python,javascript1));
    ArrayList<Book> libriSuperioriBase = new ArrayList<>(Arrays.asList(italiano,matematica,latino));
    ArrayList<Book> libriFormazioneFinanziaria = new ArrayList<>(Arrays.asList(padreRicco,riccoPardre));

    ibs.addAllListBook(libriProgrammazione);
    ibs.addAllListBook(libriSuperioriBase);
    ibs.addAllListBook(libriFormazioneFinanziaria);

        System.out.println("\n --------- \n");

        ibs.removeBook(italiano);
        ibs.removeAllListBook(libriFormazioneFinanziaria);

//        ibs.searchBook("java");

        System.out.println("\n --------- \n");

        Borrowed newBorrowed = new Borrowed("Cristian" ,"cristian.borrow@gmail.com", Arrays.asList());
        Borrowed newBorrowed1 = new Borrowed("Marco" ,"marco.borrow@gmail.com", Arrays.asList());
        Borrowed newBorrowed2 = new Borrowed("Filippo" ,"filippo.borrow@gmail.com", Arrays.asList());
        Borrowed newBorrowed3 = new Borrowed("Matteo" ,"matteo.borrow@gmail.com", Arrays.asList());

        ibs.addBorrowed(newBorrowed);
        ibs.addBorrowed(newBorrowed1);
        ibs.addBorrowed(newBorrowed2);
        ibs.addBorrowed(newBorrowed3);

/* * Codice funzionante */
//        ibs.showBorro();
        ibs.searchBorrowed("Marco");
//ibs.prestitoBook(java, newBorrowed);
//        System.out.println(newBorrowed.getLoanedBookBorro());
//        System.out.println(newBorrowed.getLoanedBookBorro());
        System.out.println("\n --------- \n");

//        ibs.prestitoBook(latino,newBorro);
//
//    newBorro.getLoanedBookBorro();

    }
}
