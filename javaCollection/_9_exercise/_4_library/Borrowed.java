package _1_javaExerciseForGithub.tutorExe._4_library;

import java.util.ArrayList;
import java.util.List;

public class Borrowed {

    private String nameBorrowed;
    private String emailBorrowed;
    private List<Book>loanedBookBorrowed;

    public Borrowed(String nameBorrowed, String emailBorrowed, List<Book> loanedBookBorrowed) {
        this.nameBorrowed = nameBorrowed;
        this.emailBorrowed = emailBorrowed;
        this.loanedBookBorrowed = new ArrayList<>(loanedBookBorrowed);
    }
    public Borrowed(String nameBorrowed, String emailBorrowed){
        this.nameBorrowed = nameBorrowed;
        this.emailBorrowed = emailBorrowed;
    }

    public String getNameBorrowed() {return nameBorrowed;}
    public String getEmailBorrowed() {return emailBorrowed;}
    public List<Book> getLoanedBookBorrowed() {return loanedBookBorrowed;}

    public void addLoanedBook(Book b){loanedBookBorrowed.add(b);}

    public String toString(){
        return "Nome: " + nameBorrowed + "\nEmail: " + emailBorrowed +"\n";
    }

}
