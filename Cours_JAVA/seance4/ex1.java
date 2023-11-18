package seance4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] notes = new double[10];
        int i = 0;
        double sum = 0;
        double moy;
        String output = "[";

        while (i < notes.length) {
            System.out.print("Donner la note numero " + (i + 1) + ": ");
            double note = inp.nextDouble();
            if (0 <= note && note <= 20) {
                notes[i] = note;
                sum += notes[i];
                i++;
            } else {
                System.err.println("Erreur, la note doit être comprise entre 0 et 20.");
            }
        }
        moy = sum / notes.length;

        System.out.println("Les notes superieures à la moyenne " + moy + " sont: ");
        for (int j = 0; j < notes.length; j++) {
            if (notes[j] >= moy) {
                output += (notes[j] + "; ");
            }
        }
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);

        inp.close();
    }
}
