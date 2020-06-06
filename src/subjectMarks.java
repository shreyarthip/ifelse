import java.util.Scanner;

public class subjectMarks
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
        int total = english + Science + Maths;
        float percentage = total / 3;
        System.out.println("Total marks = " + total);
        System.out.println("percentage = " + percentage);

        if (percentage < 35) {
            System.out.println("fail");

        } else if (percentage >= 35 && percentage < 50) {
            System.out.println(" C grade");

        } else if (percentage >= 50 && percentage < 60) {
            System.out.println(" B grade");

        } else if (percentage >= 60 && percentage < 80) {
            System.out.println(" A grade");

        } else if (percentage >= 80 && percentage <= 100) {
            System.out.println(" A+ grade ");
        }
    }
}