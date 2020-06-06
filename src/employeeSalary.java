import java.util.Scanner;

public class employeeSalary
{
    public static void main(String[] args)
    {
        float basic_salary,da,hra,ta,pf,Grosssalary;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Employee name");
        String name = s.next();
        System.out.println("Please Enter Employee ID");
        int ID = s.nextInt();
        System.out.println("please Enter basic salary");
        basic_salary = s.nextFloat();
        System.out.println("Please Enter Basic HRA of employee ");
        hra = s.nextFloat();
        System.out.println("please Enter Basic DA of employee");
        da = s.nextFloat();
        System.out.println("Please Enter Basic TA of employee");
        ta = s.nextFloat();
        System.out.println("Please Enter Basic PF of employee");
        pf = s.nextFloat();

        hra = (basic_salary * hra)/100;
        da = (basic_salary * da)/100;
        ta = (basic_salary * ta)/100;
        pf = (basic_salary * pf)/100;

        Grosssalary = basic_salary + hra + da + ta - pf;

        System.out.println("Gross Salary of Employee: "+Grosssalary);

    }
}
