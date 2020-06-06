import java.util.Scanner;

public class PassOrFail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Student name");
        String name = scanner.next();
        System.out.println("please Enter Student roll No:");
        int number = scanner.nextInt();
        System.out.println("please Enter your English marks");
        int english = scanner.nextInt();
        System.out.println("Please Enter your Science marks:");
        int Science = scanner.nextInt();
        System.out.println("Please Enter your Maths marks");
        int Maths = scanner.nextInt();

        if (english >= 35 && Science >= 35 && Maths >= 35) {
            System.out.println("student is pass");
        } else {
            System.out.println("student is fail");
        }
    }
}
