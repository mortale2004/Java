import java.util.Scanner;

public class CompundInterest {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        double principle, rate, time, compundInterest;

        System.out.print("Enter Principle Amount = ");
        principle = sc.nextDouble();

        System.out.print("Enter Time Period = ");
        time = sc.nextDouble();

        System.out.print("Enter Interest Rate = ");
        rate = sc.nextDouble();

        compundInterest = principle * Math.pow(((1 + rate / 100)), time);

        System.out.printf("Compund Interest = %.2f Rs.", compundInterest);

        sc.close();

    }
}
