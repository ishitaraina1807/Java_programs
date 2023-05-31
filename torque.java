import java.util.Scanner;

class torque {
    public static void main(String args[]) {
        int m1, m2, a, b;
        double g = 9.8, torque;
        Scanner tq = new Scanner(System.in);
        System.out.println("enter the mass 1 : ");
        m1 = tq.nextInt();
        System.out.println("enter the mass 2 : ");
        m2 = tq.nextInt();
        a = m1 * m2;
        b = m1 + m2;
        torque = g * a / b;
        System.out.println("torque = " + torque);
    }
}
