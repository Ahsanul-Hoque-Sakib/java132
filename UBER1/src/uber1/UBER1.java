package uber1;

import java.util.Scanner;
public class UBER1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Input Distance:");
        Double Distance = input.nextDouble();
        System.out.println("Input PricePerKM:");
        Double perKMPrice = input.nextDouble();
        input.nextLine();
        System.out.println("PromotionDiscount:");
        String Promotion_Discount = input.nextLine();//if promotion discount is active it will calculate with 10%
        
        Taxi t1 = new Taxi(Distance,perKMPrice,Promotion_Discount);
        t1.Display();
        
        Double TotalAmount= t1.calculateAmount();
        System.out.println("TotalAmount:"+TotalAmount);
        Double Discount = t1.Discount(Promotion_Discount, TotalAmount);
        System.out.println("Discount:"+Discount);
        Double Payable = t1.payable(TotalAmount, Discount);
        System.out.println("Payable:"+Payable);
    }
    
}
