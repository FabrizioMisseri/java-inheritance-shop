package inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
//- codice (numero intero)
//- nome
//- descrizione
//- prezzo
//- iva
    Random rand = new Random();

    private String codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    private double ivaIndex;

    public Product(String nome, String descrizione, double prezzo, double iva) {
        this.codice = Integer.toString(this.rand.nextInt(999999999));
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.ivaIndex = (iva/100)+1;
    }

    // GETTERS
    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getPrezzoIva() {
        return this.prezzo * this.ivaIndex;
    }

    public double getIva() {
        return iva;
    }

    // SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "codice='" + codice + '\'' +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                ", ivaIndex=" + ivaIndex;
    }

    public double getDiscountedPrice(){
        return this.getPrezzoIva() * 0.98;
    }
}
