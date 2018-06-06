package meenabazar;
import java.util.Scanner;
public class MeenaBazar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantity;
        Double tp =0.0;
        Double total=0.0;
        Double Price=0.0;
        Double rice = 60.0;
        Double Dal = 130.0;
        Double Beef = 550.0;
        System.out.println("WE Have the Producs:");
        System.out.println("1.Rice||Price:60p/kg||Available");
        System.out.println("2.Dal||Price:130p/kg||Available");
        System.out.println("3.Beef||Price:550p/kg||Available");
        
        Customer obj = new Customer();
        obj.inputCustomerInfo();
         System.out.println("How many products you Want:");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Which Product Do you want?");
            int Pid= input.nextInt();
            switch(Pid){
                case 1:
                    System.out.println("Input Quantity:");
                    quantity = input.nextInt();
                    
                    Price = rice*quantity;
                    
                    break;
                    
                case 2:
                    System.out.println("Input Quantity:");
                    quantity = input.nextInt();
                    
                    Price = Dal*quantity;
                    
                    break;
                    
                case 3:
                    System.out.println("Input Quantity:");
                    quantity = input.nextInt();
                    
                    Price = Beef*quantity;
                    
                    break;
            }
           
         total =obj.totalPrice(Price);
            
        }
        
        System.out.println("TotalPrice:"+total);
        Double Tax=obj.taxAmount(total);
        System.out.println("Tax:"+Tax);
        obj.printCustomerInfo();
        Double discount = obj.customerType();
        System.out.println("Discount:"+discount);
        
        Double Payable = (total+Tax-discount);
        System.out.println("Payable:"+Payable);
        
    }
    
}
