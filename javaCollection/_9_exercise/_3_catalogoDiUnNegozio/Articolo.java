package _1_javaExerciseForGithub.tutorExe._3_catalogoDiUnNegozio;

public class Articolo extends Product implements Sconto{

        private String descrizione;
        private TipoProdotto tipoProdotto;
        private double sconto;

    public Articolo(String nome, double prezzo, String descrizione, TipoProdotto tipoProdotto) {
        super(nome, prezzo);
        this.descrizione = descrizione;
        this.tipoProdotto = tipoProdotto;
    }

    public String getDescrizione() {return descrizione;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    public TipoProdotto getTipoProdotto() {return tipoProdotto;}
    public void setTipoProdotto(TipoProdotto tipoProdotto) {this.tipoProdotto = tipoProdotto;}

    public double getScontoArticolo() {return sconto;}
    public void setSconto(double sconto) {this.sconto = sconto;}

    @Override
    public void applicaSconto(double sconto) {
        this.sconto = sconto ;
    }
@Override
    public double calcolaPrezzoScontato() {
        return (this.getPrezzoProduct() / 100) * (100 - this.sconto);
    }
}
