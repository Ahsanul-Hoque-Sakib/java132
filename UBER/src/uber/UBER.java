package uber;
import java.util.Scanner;
public class UBER {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Distance:");
        Double Distance = input.nextDouble();
        System.out.println("Input PricePerKM:");
        Double perKMPrice = input.nextDouble();
        input.nextLine();
        System.out.println("PromotionDiscount:");
        String Promotion_Discount = input.nextLine();      
        System.out.println("Percentage:");
        Double Percent= input.nextDouble();
        
        Taxi t1 = new Taxi(Distance,perKMPrice,Promotion_Discount);
        t1.Display();
        Double TotalAmount= t1.calculateAmount();
        System.out.println("TotalAmount:"+TotalAmount);
        Double Discount = t1.Discount(TotalAmount,Percent);
        System.out.println("Discount:"+Discount);               
        Double Payable = t1.PayableAmount(TotalAmount,Discount);
        System.out.println("Payable AMount:"+Payable);
                
    }
    
}
