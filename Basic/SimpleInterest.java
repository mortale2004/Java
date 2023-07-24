import java.util.Scanner;

public class SimpleInterest {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        float principle, time, rate, simpleInterest;

        System.out.print("Enter Principle Amount = ");
        principle = sc.nextFloat();

        System.out.print("Enter Time Period = ");
        time = sc.nextFloat();

        System.out.print("Enter Interest Rate = ");
        rate = sc.nextFloat();

        simpleInterest = ( principle * time * rate ) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
