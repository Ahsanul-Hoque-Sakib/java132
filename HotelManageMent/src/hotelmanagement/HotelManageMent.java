package hotelmanagement;
import java.util.Scanner;
public class HotelManageMent {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        Customer obj1 = new Customer();
        obj1.rent_Room();
        
        
        System.out.println("Which type of Room do you Want?\n1.Standard\n2.Deluxe");
        int select = input.nextInt();
        
        switch(select){
        
        case 1:
       standardRoom obj2 = new standardRoom();
       obj2.acAvailability();
       obj2.printStandardRoomInfo();
            break;
        case 2:
       deluxeRoom obj = new deluxeRoom();
       obj.RoomSize();
       obj.printDeluxeRoomInfo();
            break;
    }
  }
}
