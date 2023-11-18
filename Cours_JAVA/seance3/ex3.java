package seance3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Donner un nombre: ");
        int n = inp.nextInt();
        int sum = 1;
        boolean premier = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                premier = false;
                sum += i;
            }
        }
        
        if (n == sum)
            System.out.println("Le nombre est parfait");
        else if (premier)
            System.out.println("Le nombre est premier");
        else
            System.out.println("Aucune proprieté");

        inp.close();
    }
}
