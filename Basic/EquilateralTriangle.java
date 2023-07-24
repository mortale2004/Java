import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);
        double s, area;

        System.out.print("Enter Side of Triangle = ");
        s = sc.nextFloat();

        area = (Math.sqrt(3) / 4) * (s * s);
        
        System.out.printf("Area of Triangle = %.2f square units.", area);

        sc.close();
    }
}
