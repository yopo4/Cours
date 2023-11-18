import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Donner le volume horaire: ");
        int nbrHeures = inp.nextInt();
        System.out.print("Donner le tarif horaire: ");
        float tarifHeure = inp.nextFloat();
        int heuresSupp = nbrHeures - 39;
        float tarifSupp = 0;
        float salaire;

        if (heuresSupp >= 0) {
            if (nbrHeures >= 40) {
                tarifSupp = 5 * tarifHeure * 1.5f;
                salaire = tarifSupp + (nbrHeures - heuresSupp) * tarifHeure;
            } 
            if (nbrHeures >= 44) {
                tarifSupp = 5 * tarifHeure * 1.75f + 5 * tarifHeure * 1.5f;
                salaire = tarifSupp + (nbrHeures - heuresSupp) * tarifHeure;
            } 
            if (nbrHeures >= 50) {
                tarifSupp = heuresSupp * tarifHeure * 2f;
            }
        }
        System.out.println("Le prix des heures obligatoires: " + ((nbrHeures - heuresSupp) * tarifHeure));
        System.out.println("Le prix des heures supplementaires: " + tarifSupp);
        System.out.println("Le prix total: " + (tarifSupp + (nbrHeures - heuresSupp) * tarifHeure));
        inp.close();
    }
}
