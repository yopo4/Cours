import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float prixU = 0.16f, forfait = 0;
        System.out.print("Donner le nombre de photos: ");

        int n = inp.nextInt();
        if (n > 75) {
            prixU = 0.12f;
            forfait = 3;
        }
        System.out.println("Le prix totale est: " + (prixU * n + forfait));
        inp.close();
    }
}
