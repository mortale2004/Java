import java.util.Scanner;

public class CelToFah {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        float celcius, fahrenheit;

        System.out.print("Enter Tempreture in Celcius = ");
        celcius = sc.nextFloat();

        fahrenheit = (celcius * 9/5) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
