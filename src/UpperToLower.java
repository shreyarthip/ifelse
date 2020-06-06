import java.util.Scanner;

public class UpperToLower
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any Uppercase alphabet");
        String name = sc.next();

        System.out.println( name );

        String result;
        result = name.toLowerCase();

        System.out.println(result);
    }

}
