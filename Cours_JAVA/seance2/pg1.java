import java.util.Scanner;

public class pg1 {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int age;
    int n;

    System.out.print("Donner un nombre pour tester sa parité: ");
    // System.out.print("Entrez votre age: ");

    // if (inp.hasNextInt()) {
    //   age = inp.nextInt();
    //   if (age >= 18) {
    //     System.out.println("Majeur");
    //   } else {
    //     System.out.println("Mineur");
    //   }
    //   String cat = (age >= 18) ? "Majeur" : "Mineur";
    //   System.out.println(cat);
    // } else {
    //   System.out.println("Age invalide!");
    // }

    if (inp.hasNextInt()) {
      n = inp.nextInt();
      // if (n % 2 == 0) {
      //   System.out.println("Pair");
      // } else {
      //   System.out.println("Impair");
      // }
      String cat = (n % 2 == 0) ? "Pair" : "Impair";
      System.out.println(cat);
    } else {
      System.out.println("Nombre invalid!");
    }
    inp.close();
  }
}
