package _1_javaExerciseForGithub.tutorExe._4_library;

import java.util.*;

public class Library {

    private String name;
    private String address;
    private List<Book> books;
    private List<Borrowed> listBorrowed;


    public Library(String name, String address, List<Book> books, List<Borrowed> listBorrowed) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>(books);
        this.listBorrowed = new ArrayList<>(listBorrowed);

    }
    public String getName() {return name;}
    public List<Book> getBooks() {return books;}

    public void addBook(Book b) {books.add(b);}
    public void addAllListBook(List<Book> b) {books.addAll(b);}

    public void removeBook(Book b) {books.remove(b);}
    public void removeAllListBook(List<Book> b) {books.removeAll(b);}

    public List<Borrowed> getListBorrower() {return listBorrowed;}

    /* TODO: IMPLEMENTA UNA CATEGORIA DOVE PUOI AGGIUNGERE LE LISTE DI DI LIBRI PER UNA SPECIFICA CATEGORIA*/

    public void searchBook(String s) {   // --> non funziona perché stampa sempre libro non presente, * risolto con un booleano
        String book;
        boolean bool = false;
        for (Book b : books) {
            if (b.getTitle().strip().toLowerCase().contains(s.strip().toLowerCase())) {
                book = b.getTitle() + " " + b.getAuthor();
                System.out.println(book);
                bool = true;
            }
        }
        if (bool != true) {
            System.out.println("Libro non presente"); // --> viene sempre stampato, perché sta confrontando ogni elemento quindi l'else non ci vuole, basta un solo if
        }
    }

    public void addBorrowed(Borrowed b) {listBorrowed.add(b);}
    public void removeBorrowed(Borrowed b) {listBorrowed.remove(b);}

    public void showBorrowed() {listBorrowed.forEach(b -> System.out.println(b.toString()));}

    public void searchBorrowed(String s){
//        AtomicBoolean foundBorrowed = new AtomicBoolean(false);
        List<Borrowed> newList = new ArrayList<>();
        newList.addAll(listBorrowed.stream().filter( (c) -> {
            if (c.getNameBorrowed().equals(s.strip())|| c.getEmailBorrowed().equals(s.strip())){
//                foundBorrowed.set(true);
                System.out.println(c.toString());
            }
            return Boolean.parseBoolean(null);
        }).toList());
//        throw  new IllegalArgumentException("Libro con questo nome non presente"); --> riporta sempre l'errore

    }

    //      prestitoBook(Book libro, Mutuatario mutuatario): un metodo che contrassegna l'oggetto Book specificato come preso in prestito dall'oggetto mutuatario specificato.
    //      Questo dovrebbe aggiornare la proprietà del mutuatario dell'oggetto Book e l'array di libri presi in prestito dell'oggetto del mutuatario.
    public void prestitoBook(Book book, Borrowed borrowed) {
        borrowed.addLoanedBook(book);
        for (Book b : borrowed.getLoanedBookBorrowed()) {
            System.out.println(b.getTitle() + " " + borrowed.getNameBorrowed());
        }
    }

}
