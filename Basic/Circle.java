import java.util.Scanner;

public class Circle {
  
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        final float PI = 3.14f;
        float radius, diameter, circumference, area;

        System.out.print("Enter Radius of Circle = ");
        radius = sc.nextFloat();

        diameter = radius * 2;
        circumference = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("Diameter of Circle = " + diameter + " meter");
        System.out.println("Circumference of Circle = " + circumference + " meter");
        System.out.println("Area of Circle = " + area + " square meter");
        
        sc.close();
    }
}
