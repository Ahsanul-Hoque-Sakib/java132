package hotelmanagement;
import java.util.Scanner;
public class Customer {
    String customerName;
    String CustomerID;
    Scanner input;
    public Customer(){
       input = new Scanner(System.in);
    }
    
 
    public String rent_Room(){
       System.out.println("Input Name:");
       customerName = input.nextLine();
       return customerName;
    }
}
