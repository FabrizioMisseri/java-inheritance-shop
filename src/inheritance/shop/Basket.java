package inheritance.shop;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Benvenuto in SASSONEshop.com -> Quanti articoli vuoi acquistare?");
        int productsNumber = Integer.parseInt(scan.nextLine());
        Product[] products = new Product[productsNumber];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Quale articolo vuoi acquistare?");
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


            if (userChoice.equalsIgnoreCase("1")){
                System.out.println("inserisci memoria dispositivo");
                int memoria = Integer.parseInt(scan.nextLine());

                Smartphone product = new Smartphone(nome, descrizione, prezzo, iva, memoria);
                System.out.println(product.toString());
                System.out.println("il prezzo scontato è " + product.getDiscountedPrice());
                products[i] = product;

            } else if (userChoice.equalsIgnoreCase("2")) {
                System.out.println("la TV è smart? 1 (SI) - 2 (NO)");
                String resp = scan.nextLine();
                boolean smart = false;
                if (resp.equals("1")) {
                    smart = true;
                }
                System.out.println("inserisci larghezza");
                int width = Integer.parseInt(scan.nextLine());
                System.out.println("inserisci altezza");
                int height = Integer.parseInt(scan.nextLine());

                // smart, width, height
                Tv product = new Tv(nome, descrizione, prezzo, iva, smart, width, height);
                System.out.println(product.toString());
                System.out.println("il prezzo scontato è " + product.getDiscountedPrice());
                products[i] = product;



            } else if (userChoice.equalsIgnoreCase("3")) {

                System.out.println("il dispositivo è wireless? 1 (SI) - 2 (NO)");
                String resp = scan.nextLine();
                boolean wireless = false;
                if (resp.equals("1")) {
                    wireless = true;
                }
                System.out.println("inserisci colore:");
                String color = scan.nextLine();

                // wireless, colore
                Headphone product = new Headphone(nome, descrizione, prezzo, iva, wireless, color);
                System.out.println(product.toString());
                System.out.println("il prezzo scontato è " + product.getDiscountedPrice());
                products[i] = product;



            }else{
                System.out.println("il prodotto non esiste riprova...");
                --i;
            }
        }

        double sum = 0;

        for (Product item: products){
            sum += item.getDiscountedPrice();
        }

//        for (int i = 0; i < products.length ; i++) {
//            sum += products[i].getDiscountedPrice();
//        }

        System.out.println("il tuo carrello vale " + sum + "$");

        scan.close();
    }
}

