package inheritance.shop;

public class Tv extends Product{

    private boolean smart;

    private int width;

    private int height;

    public Tv(String codice, String nome, String descrizione, double prezzo, double iva, boolean smart, int width, int height) {
        super(codice, nome, descrizione, prezzo, iva);
        this.smart = smart;
        this.width = width;
        this.height = height;
    }

    //GETTERS
    public boolean isSmart() {
        return smart;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //SETTERS

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
