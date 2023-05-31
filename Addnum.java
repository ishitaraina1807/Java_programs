import java.util.Scanner; // import scanner class

class Addnum {
    public static void main(String args[])

    {
        int a, b, sum;
        Scanner input = new Scanner (System.in);
        System.out.println("enter first numbers : ");
        a = input.nextInt();
        System.out.println("enter second numbers : ");
        b = input.nextInt();
        sum = a + b;
        System.out.println("Sum of numbers is : " + sum);
    }
}