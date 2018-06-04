package hotelmanagement;
import java.util.Scanner;
public class HotelManageMent {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Input ID:");
       String id = input.nextLine();
       System.out.println("Name:");
       String name = input.nextLine();
      
       Customer obj1 = new Customer(id,name);
       String getID = obj1.getID(id);
     
       Room ob = new Room(getID);
       
       System.out.println("Which type of Room do you Want?\n1.Standard\n2.Deluxe");
       int select = input.nextInt();
        
       switch(select){
        
       case 1:
       standardRoom obj2 = new standardRoom(getID);
       obj2.acAvailability();
       obj2.printStandardRoomInfo();
       break;
       
       case 2:
       deluxeRoom obj = new deluxeRoom(getID);
       obj.RoomSize();
       obj.printDeluxeRoomInfo();
       break;
    }
  }
}
