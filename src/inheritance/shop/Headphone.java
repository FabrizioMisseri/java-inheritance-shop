package inheritance.shop;

public class Headphone extends Product {

    private boolean wireless;

    private String colore;

    public Headphone(String nome, String descrizione, double prezzo, double iva, boolean wireless, String colore) {
        super(nome, descrizione, prezzo, iva);
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

    @Override
    public String toString() {
        return "Headphone{" + super.toString() + '\'' +
                "wireless=" + wireless +
                ", colore='" + colore + '\'' +
                '}';
    }

    @Override
    public double getDiscountedPrice() {
        if (!this.wireless){
            return super.getPrezzoIva() * 0.93;
        }else{
            return super.getDiscountedPrice();

        }
    }
}
