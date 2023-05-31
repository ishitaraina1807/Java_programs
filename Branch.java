import java.io.*;

class Branch {
    public static void main(String args[]) {
        String choice = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----BRANCHES-----");
        System.out.println("COMPUTER SCIENCE");
        System.out.println("ELECTRICAL");
        System.out.println("CIVIL");
        System.out.println("MECHANICAL");
        System.out.println("AEROSPACE");
        System.out.println("ENTER YOUR CHOICE :");
        try {
            choice = br.readLine();
            System.out.flush();
            switch (choice) {
                case "COMPUTER SCIENCE":
                    System.out.println("REQUIRED PERCENTILE = 95%ILE");
                    break;
                case "ELECTRICAL":
                    System.out.println("REQUIRED PERCENTILE = 90%ILE");
                    break;
                case "CIVIL":
                    System.out.println("REQUIRED PERCENTILE = 87%ILE");
                    break;
                case "MECHANICAL":
                    System.out.println("REQUIRED PERCENTILE = 85%ILE");
                    break;
                case "AEROSPACE":
                    System.out.println("REQUIRED PERCENTILE = 98%ILE");
                    break;
                default:
                    System.out.println("--Branch not available--");
            }
        } catch (Exception enter) {
            System.out.println("I/O ERROR");
        }
    }
}