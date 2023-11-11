package _1_javaExerciseForGithub.tutorExe._4_library;

public class Book {
    private String title;
    private String author;
    private String isb;
    private Borrowed borrowed;

    public Book(String title, String author, String isb) {
        this.title = title;
        this.author = author;
        this.isb = isb;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getIsb() {return isb;}
    public Borrowed getBorrowed() {return borrowed;}}
