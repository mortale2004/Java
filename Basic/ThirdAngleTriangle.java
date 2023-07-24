import java.util.Scanner;

public class ThirdAngleTriangle {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int angle1, angle2, angle3;

        System.out.print("Enter First Angle of Triangle = ");
        angle1 = sc.nextInt();

        System.out.print("Enter Second Angle of Triangle = ");
        angle2 = sc.nextInt();

        angle3 = 180 - angle1 - angle2;

        System.out.println("The Third Angle of Triangle = " + angle3);

        sc.close();

    }
}
