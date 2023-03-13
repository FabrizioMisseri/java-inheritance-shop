package inheritance.shop;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //INPUT
        System.out.println("Benvenuto in SASSONEshop.com -> Cosa vuoi acquistare");
        System.out.println("1 (smartphone) - 2 (TV) - 3 (headphone)");
        String userChoice = scan.nextLine();

        System.out.println("inserisci nome:");
        String nome = scan.nextLine();

        System.out.println("inserisci descrizione:");
        String descrizione = scan.nextLine();

        System.out.println("inserisci prezzo:");
        double prezzo = Double.parseDouble(scan.nextLine());

        System.out.println("inserisci IVA");
        double iva = Double.parseDouble(scan.nextLine());



        scan.close();
    }
}

