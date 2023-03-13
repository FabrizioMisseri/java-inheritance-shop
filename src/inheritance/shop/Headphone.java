package inheritance.shop;

public class Headphone extends Product {

    private boolean wireless;

    private String colore;

    public Headphone(String codice, String nome, String descrizione, double prezzo, double iva, boolean wireless, String colore) {
        super(codice, nome, descrizione, prezzo, iva);
        this.wireless = wireless;
        this.colore = colore;
    }

    //GETTERS

    public boolean isWireless() {
        return wireless;
    }

    public String getColore() {
        return colore;
    }


    //SETTERS

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
