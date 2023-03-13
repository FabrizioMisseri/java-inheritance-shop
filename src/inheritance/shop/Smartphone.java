package inheritance.shop;

public class Smartphone extends Product {

    private String imei;
    private int memoria;


    public Smartphone(String codice, String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    //GETTERS
    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    //SETTERS

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
