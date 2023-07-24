import java.util.Scanner;

public class Result {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        float cS, fDE, bCS, cL, wT, total, percentage, average;
        
        System.out.print("Enter Marks in Communication Skills = ");
        cS = sc.nextFloat();

        System.out.print("Enter Marks in Fundamental of Digital Electronics = ");
        fDE = sc.nextFloat();

        System.out.print("Enter Marks in Basic of Computer System = ");
        bCS = sc.nextFloat();

        System.out.print("Enter Marks in C Language = ");
        cL = sc.nextFloat();

        System.out.print("Enter Marks in Web Technology = ");
        wT = sc.nextFloat();

        total = cS + fDE + bCS + cL + wT;
        average = total / 5;
        percentage = total / (500 / 100);

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Total Percentage = " + percentage + "%");

        sc.close();
    }
}
