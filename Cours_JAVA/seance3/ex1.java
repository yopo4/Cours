package seance3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pos = 0, max = 0, j = 1;
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("Entrez le nombre numero " + i + ": ");
        // int n = inp.nextInt();
        // if (i == 1)
        // max = n;
        // else if (max <= n) {
        // max = n;
        // pos = i;
        // }
        // }

        // while (j <= 10) {
        // System.out.print("Entrez le nombre numero " + j + ": ");
        // int n = inp.nextInt();
        // if (j == 1)
        // max = n;
        // else if (max <= n) {
        // max = n;
        // pos = j;
        // }
        // j++;
        // }

        do {
            System.out.print("Entrez le nombre numero " + j + ": ");
            int n = inp.nextInt();
            if (j == 1)
                max = n;
            else if (max <= n) {
                max = n;
                pos = j;
            }
            j++;
        } while (j <= 10);
        
        System.out.println("Le plus grand nombre est: " + max + ", sa position est: " + pos);
        inp.close();
    }
}
