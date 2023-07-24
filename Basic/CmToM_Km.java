import java.util.Scanner;

public class CmToM_Km {

    public static void main(String []args)
    {

        Scanner sc = new Scanner(System.in);
            
        float cm, m, km;

        System.out.print("Enter Length in Centimeters = ");
        cm = sc.nextFloat();
        
        m = cm / 100f;
        km = cm / 100000f;
        
        System.out.println("Meter = " + m);
        System.out.println("Kilometer = " + km);
        
        sc.close();
    }
}
