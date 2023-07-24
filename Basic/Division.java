import java.util.Scanner;

class Division {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);
        float num1, num2, result;
        
        System.out.print("Enter First Number = ");
        num1 = sc.nextInt();

        System.out.print("Enter Second Number = ");
        num2 = sc.nextInt();

        result = num1 / num2;

        System.out.println("Division = " + result);

        sc.close();
    }
}
