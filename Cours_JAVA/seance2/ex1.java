import java.util.Scanner;

public class ex1 {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Donner le prix HT: ");
    float ht = inp.nextFloat();
    final float TVA = 0.196f;
    float remise = 0;
    if (ht > 4000) {
      remise = 0.08f;
    } else if (ht > 2500){
      remise = 0.05f;
    }
    float ttc = ht + (ht * TVA);
    System.out.println("Prix sans remise: " + ttc);
    ttc -= (ttc * remise);
    System.out.println("Prix avec remise: " + ttc);
    inp.close();
  }
}
