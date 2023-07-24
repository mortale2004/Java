import java.util.Scanner;

class Multiplication
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        
        System.out.print("Enter First Number = ");
        num1 = sc.nextInt();
        
        System.out.print("Enter Second Number = ");
        num2 = sc.nextInt();

        result = num1 * num2;

        System.out.println("Multiplication = " + result);

        sc.close();
    }
}