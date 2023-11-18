package seance3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un nombre paire compris entre 60 et 120: ");
            n = inp.nextInt();
            if (n % 2 == 0) {
                if (n < 60)
                    System.out.println("Plus grand !");
                else if (n > 120)
                    System.out.println("Plus petit !");
                else
                    break;
            } else {
                System.out.println("Le nombre est impaire !");
            }
        } while (true);
        inp.close();
    }
}
