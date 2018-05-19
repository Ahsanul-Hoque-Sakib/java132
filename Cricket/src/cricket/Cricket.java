package cricket;
import java.util.Scanner;
public class Cricket {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Input Name:");
         String Name=input.nextLine();
         System.out.println("Input Age:");
         String Age=input.nextLine();
        System.out.println("PrizeMoney:");
        Double prizeMoney= input.nextDouble();
        
        Player p1 = new Player(Name,Age,prizeMoney);
        p1.Display();
        //p1.calculate_PrizeMoney();
        //Double T= p1.calculate_PrizeMoney();
        //System.out.println(T);
        System.out.println("Input Match Number:");
        int M=input.nextInt();
        Double b= p1.bonus(M);
        System.out.println("Bonus:"+b);
    }
    
}
