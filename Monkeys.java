import java.util.Scanner;

class Monkeys {
    public static void main(String args[]) {
        int bn, pn,i= 50, mon=0; 
        Scanner eat = new Scanner(System.in);
        System.out.println("enter the number of banana");
        bn = eat.nextInt();
        System.out.println("enter the number of peanuts");
        pn = eat.nextInt();
        while (i!=0 ) {
        if(bn > 3) {
            bn = bn - 20 ;
            mon = mon + 1;
        }
        else 
        if(pn > 5){
            pn = pn - 5;
            mon = mon + 1 ;
        }
        else 
        if(pn + bn <= 3){
            mon = mon + 1;
            break;
        }
        i--;

    }
    System.out.println(mon);
}
}

