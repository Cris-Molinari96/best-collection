package _1_javaExerciseForGithub.tutorExe._3_catalogoConMap;

public class Article extends Product implements Discount {
    String description;
    EnumTypeProduct categoriaProdotto;

    Article(String name, int price, String description, EnumTypeProduct categoriaProdotto,int numeroPezzi){
        super(name,price,numeroPezzi);
        this.description = description;
        this.categoriaProdotto = categoriaProdotto;
    }
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public EnumTypeProduct getCategoriaProdotto() {return categoriaProdotto;}
    public void setCategoriaProdotto(EnumTypeProduct categoriaProdotto) {this.categoriaProdotto = categoriaProdotto;}

    @Override
    public void applicaSconto(double sconto) {}
    @Override
    public double calcolaPrezzoScontato() {return 0;}
}
