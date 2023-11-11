package _1_javaExerciseForGithub.tutorExe._3_catalogoDiUnNegozio;

abstract class Product {
    protected String nomeProduct;
    protected double prezzoProduct;
    protected int numeroPezzi ;

    public Product(String nome, double prezzo) {
        this.nomeProduct = nome;
        this.prezzoProduct = prezzo;
    }

    public String getNomeProduct() {return nomeProduct;}
    public double getPrezzoProduct() {return prezzoProduct;}

    public void setNomeProduct(String nomeProduct) {this.nomeProduct = nomeProduct;}
    public void setPrezzoProduct(double prezzoProduct) {this.prezzoProduct = prezzoProduct;}

    public int getNumeroPezzi() {return numeroPezzi;}
    public void setNumeroPezzi(int numeroPezzi) {this.numeroPezzi = numeroPezzi;}

    @Override
    public String toString() {
        return "Product{" +
                "nomeProduct='" + nomeProduct + '\'' +
                ", prezzoProduct=" + prezzoProduct + "€" +
                ", numeroPezzi" + numeroPezzi +
                "}\n";
    }
}

