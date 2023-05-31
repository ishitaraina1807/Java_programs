import java.util.Scanner;

class equation {
    public static void main(String args[]) {
        int x, y;
        double side, q, eqn;
        Scanner eq = new Scanner(System.in);
        System.out.println("enter a : ");
        x = eq.nextInt();
        System.out.println("enter b : ");
        y = eq.nextInt();
        q = Math.cos(45);
        eqn = x * x + y * y - 2 * x * y * q;
        side = Math.sqrt(eqn);
        System.out.println("side is : " + side);

    }
}
