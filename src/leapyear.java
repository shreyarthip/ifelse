import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args)
    {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year: ");
        year = scanner.nextInt();

        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}









