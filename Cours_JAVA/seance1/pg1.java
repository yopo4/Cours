package seance1;

import java.util.Scanner;

public class pg1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String text;
        
        System.out.print("Entrer un text: ");
        text = inp.nextLine();
        System.out.println("Le text recue est: " + text);
        inp.close();
    }
}
