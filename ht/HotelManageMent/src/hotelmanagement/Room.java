package hotelmanagement;
import java.util.Scanner;
public class Room{

    String roomid;
    String customerid;
    Scanner input;
   
    public Room(String id){     
      customerid = id;
    }
 
    public void rent_Room(){
        
        input = new Scanner(System.in);
        System.out.println("Enter Room ID:");
        roomid = input.nextLine();
    }
    

}
