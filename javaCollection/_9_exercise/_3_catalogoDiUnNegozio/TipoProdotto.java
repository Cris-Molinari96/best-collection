package _1_javaExerciseForGithub.tutorExe._3_catalogoDiUnNegozio;

public enum TipoProdotto {
    PC_Gaming("pc gaming"),
    PC_Office("pc office"),
    Smartphone_SGalaxy("android"),
    Smartphone_Apple("apple");
    String nameCategory;

    TipoProdotto(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    public String getNameCategory() {return nameCategory;}
    public void setNameCategory(String nameCategory) {this.nameCategory = nameCategory;}
}
