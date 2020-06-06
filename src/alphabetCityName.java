import java.util.Scanner;

public class alphabetCityName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter alphabet from a to f: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'A') {
            System.out.println("Ahmedabad");
        } else if (alphabet == 'b') {
            System.out.println("Bombay");
        } else if (alphabet == 'c') {
            System.out.println("Chennai");
        } else if (alphabet == 'd') {
            System.out.println("Delhi");
        } else if (alphabet == 'e') {
            System.out.println("Egypt");
        } else if (alphabet == 'f') {
            System.out.println("Florida");
        } else {
            System.out.println("invalid city name");
        }
    }
}