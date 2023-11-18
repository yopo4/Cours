package seance4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] tab = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int middle = tab.length / 2;
        String output = "[";

        for (int i = 0; i <= middle; i++) {
            tab[i] = tab[i] + tab[tab.length - i - 1];
            tab[tab.length - i - 1] = tab[i] - tab[tab.length - i - 1];
            tab[i] = tab[i] - tab[tab.length - i - 1];
        }
        
        for (int j = 0; j < tab.length; j++) {
            output += tab[j] + "; ";
        }
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
        inp.close();
    }
}
