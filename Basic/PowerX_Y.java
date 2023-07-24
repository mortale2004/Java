import java.util.Scanner;

public class PowerX_Y {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int base, exponent;
        double result;
        
        System.out.print("Enter Base = ");
        base = sc.nextInt();

        System.out.print("Enter Exponent = ");
        exponent = sc.nextInt();

        result = Math.pow(base, exponent);

        System.out.println(base + " raise to power of " + exponent + " is " + result);

        sc.close();

    }
}
