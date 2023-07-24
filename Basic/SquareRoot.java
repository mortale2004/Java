import java.util.Scanner;

public class SquareRoot {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        double number, result;
        
        System.out.print("Enter a number = ");
        number = sc.nextDouble();

        result = Math.sqrt(number);

        System.out.println("The Square Root of " + number + " is " + result);

        sc.close();
    }
}
