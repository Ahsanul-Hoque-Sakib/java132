package hotelmanagement;
import java.util.Scanner;
public class Room{

    String roomid;
    String customerid;
    Scanner input;
    public Room(){
      input = new Scanner(System.in);
       
    }
 
    public void inputAll(){
        System.out.println("Enter CustomerID:");
        Customer obj = new Customer();
        customerid=obj.CustomerID = input.nextLine();
        
        System.out.println("Enter Room ID:");
        roomid = input.nextLine();
    }
    

}
