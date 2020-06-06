import java.util.Scanner;

public class salesCommission
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Sales ID");
        int ID = scanner.nextInt();
        System.out.println("Please Enter Seller's name");
        String name = scanner.next();
        System.out.println("Please Enter Sales amount");
        int amount = scanner.nextInt();
        System.out.println("Please Enter Salary Basic");
        String Basic = scanner.next();

        if (amount < 10000) {
            System.out.println("sales commission is" + (amount * 2) / 100);
        } else if (amount >= 10000 && amount < 20000) {
            System.out.println("sales commission is " + (amount * 5) / 100);
        } else if (amount >= 20000 && amount < 30000) {
            System.out.println("sales commission is " + (amount * 10) / 100);
        } else if (amount >= 30000 && amount < 50000) {
            System.out.println("sales commission is " + (amount * 20) / 100);
        } else if (amount >= 30000 && amount < 50000) {
            System.out.println("sales commission is " + (amount * 35) / 100);
        }
    }
}








