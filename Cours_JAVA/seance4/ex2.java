package seance4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nombre, i = 0;
        System.out.print("Donner la taille: ");
        int taille = inp.nextInt();
        int[] nombres = new int[taille];
        String output = "[";

        while (true) {
            if (i == taille) 
                break;
            System.out.print("Donner les nombres à inserer: ");
            nombre = inp.nextInt();
            if (nombre == 0)
                break;
            if (nombre % 2  == 0)
                nombres[i] = nombre*nombre;
            else 
                nombres[i] = nombre;
            output += (nombres[i] + "; ");
            i++;
        }
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
        inp.close();
    }
}
