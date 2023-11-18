package seance1;

public class ex1 {
    static int s;
    static int x;
    static int y;
    public static void main(String[] args) {
        // x = Integer.parseInt(args[0]);
        // y = Integer.parseInt(args[1]);

        // System.out.println(x + " + " + y + " = " + (x+y));
        for (String str : args) {
            System.out.print(str);
            s += Integer.parseInt(str);
            if (str != args[args.length - 1]) System.out.print(" + ");
        }
        System.out.println(" = " + s);
    }
}
