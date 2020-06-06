import java.util.Scanner;

public class additionSubtraction
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println("Please Enter Input first number");
        int a = scanner.nextInt();

        System.out.println("Please Enter Input second number ");
        int b = scanner.nextInt();

        System.out.println("please Enter symbol");
        ch = scanner.next().charAt(0);

        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = a/b;

        if(ch =='+') {
            System.out.println("add is " + add);
        }
        else if (ch =='-') {
            System.out.println("sub is " + sub);
        }
        else if (ch == '*') {
            System.out.println("multi is " +multi);
        }
        else if (ch == '/') {
            System.out.println("div is " + div);
        }
    }

}



