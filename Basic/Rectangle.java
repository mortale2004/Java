import java.util.Scanner;

public class Rectangle {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        float length, breadth, perimeter, area;

        System.out.print("Enter length of Rectangle = ");
        length = sc.nextFloat();
        
        System.out.print("Enter breadth of Rectangle = ");
        breadth = sc.nextFloat();

        area = length * breadth;
        perimeter = 2 * (length+breadth);

        System.out.println("Perimeter of Rectangle = " + perimeter + " meter.");
        System.out.println("Area of Rectangle = " + area + " square meter.");

        sc.close();

    }
}
