import java.util.Scanner;

class arithmetic {
    public static void main(String []args)     
    {
        Scanner sc = new Scanner(System.in);

        float num1, num2, result;

        System.out.print("Enter first number = ");
        num1 = sc.nextFloat();

        System.out.print("Enter second number = ");
        num2 = sc.nextFloat();


        result = num1+num2;
        System.out.println("Addition = " + result);
        
        result = num1-num2;
        System.out.println("Subtraction = " + result);

        result = num1*num2;
        System.out.println("Multiplication = " + result);

        result = num1/num2;
        System.out.println("Division = " + result);

        result = (int)num1 % (int)num2;
        System.out.println("Modulus = " + result);

        sc.close();
    }
}
