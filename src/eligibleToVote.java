import java.util.Scanner;

public class eligibleToVote
{
    public static void main(String[] args)
    {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        if (age >= 18)
        System.out.println("you are eligible to vote");
        else
        System.out.println("you are not eligible to vote");

    }
}
