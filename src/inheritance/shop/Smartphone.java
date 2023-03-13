package inheritance.shop;

import java.util.Random;

public class Smartphone extends Product {

    private String imei;
    private int memoria;

    Random rand = new Random();

    public Smartphone(String nome, String descrizione, double prezzo, double iva, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = Integer.toString(this.rand.nextInt(999999999));
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

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() + '\'' +
                "imei='" + imei + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
