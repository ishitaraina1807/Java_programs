import java.util.Scanner;

class Perfect {
    public static void main(String args[]) {
    int num,i, sum=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    num = scanner.nextInt(); 
    for (i=1 ; i<=num/2 ; i++) {
          if(num%i == 0){
            sum = sum + i ;
          }

    } 
    if (num == sum){
        System.out.println("it is a perfect number");

    }
    else {
        System.out.println("it is a not perfect number");
    }
}
    }
