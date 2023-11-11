package _1_javaExerciseForGithub.tutorExe._3_catalogoConMap;

/**
 * This class represent a generic product
 */
public abstract class Product {
    protected String name ;
    int numeroPezzi;
    protected double price ;

    Product(String name,double price,int numeroPezzi){
        this.name = name ;
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getNumeroPezzi() {return numeroPezzi;}
    public void setNumeroPezzi(int numeroPezzi) {this.numeroPezzi = numeroPezzi;}

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
