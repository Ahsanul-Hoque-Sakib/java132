package weathertemperature;
import java.util.Scanner;
public class Weathertemperature {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Input  Weather:");
     String Weather=input.nextLine();
     AirCondition ac1 = new AirCondition();
     ac1.AssignValue(Weather);
     //ac1.GetValue();
     System.out.println("SetTemperature:"+ac1.GetValue());
     
    }
    
}
