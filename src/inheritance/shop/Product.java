package inheritance.shop;

import java.math.BigDecimal;

public class Product {
//- codice (numero intero)
//- nome
//- descrizione
//- prezzo
//- iva

    private String codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    private double ivaIndex;

    public Product(String codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = codice;
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


}
