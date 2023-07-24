import java.util.Scanner;

public class FahToCel {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        float fahrenheit, celcius;

        System.out.print("Enter Tempreture in Fahrenheit = ");
        fahrenheit = sc.nextFloat();

        celcius = (fahrenheit - 32) * 5/9;

        System.out.println("Celcius = " + celcius);

        sc.close();
    }
}
