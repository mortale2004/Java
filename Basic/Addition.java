import java.util.*;

class Addition
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("Enter first number = ");
        num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        num2 = sc.nextInt();

        result = num1 + num2;
        
        System.out.println("Addition = "+result);

        sc.close();
    }
}