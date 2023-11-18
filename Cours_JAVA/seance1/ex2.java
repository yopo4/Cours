package seance1;

import java.util.Scanner;

public class ex2 {
    

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        // Q.1

        // int a;
        // int b;
        // System.out.print("Donner a: ");
        // a = inp.nextInt();
        // System.out.print("Donner b: ");
        // b = inp.nextInt();
        // a = a + b; 
        // b = a - b; 
        // a = a - b; 

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        
        // Q.2

        // int a;
        // System.out.print("Donner a: ");
        // a = inp.nextInt();

        // System.out.println("Le carré de " + a + " est " + a*a);

        // Q.3

        float ht;
        float tva;
        int nbrArticle;

        System.out.print("Donner ht: ");
        ht = inp.nextFloat();

        System.out.print("Donner tva: ");
        tva = inp.nextFloat();

        System.out.print("Donner nombre d'articles: ");
        nbrArticle = inp.nextInt();

        System.out.println("TTC = " + (ht * tva * nbrArticle));
        inp.close();

    }

}
