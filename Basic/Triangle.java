import java.util.Scanner;

public class Triangle {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        float base, height, area;

        System.out.print("Enter Base of Triangle = ");
        base = sc.nextFloat();

        System.out.print("Enter Height of Triangle = ");
        height = sc.nextFloat();

        area = 0.5f * base * height;

        System.out.println("The Area of Triangle = " + area + " square meter");

        sc.close();
    }
}
