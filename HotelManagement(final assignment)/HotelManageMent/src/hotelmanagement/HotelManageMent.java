package hotelmanagement;
import java.util.Scanner;
public class HotelManageMent {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Number of Deluxe Room:");
       int numberofDR=input.nextInt();
       System.out.println("Number of Standard Room");
       int numberofSR= input.nextInt();
       input.nextLine();
       
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
       standardRoom sR[];
       System.out.println("How many room do you want:");
       int numberofStandardRoom=input.nextInt();
       sR = new standardRoom[numberofStandardRoom];
       for(int i=0;i<numberofStandardRoom;i++){
           sR[i]=new standardRoom(getID);
       sR[i].acAvailability();
       sR[i].printStandardRoomInfo();
       }
       System.out.println("Available Standard Room:"+(numberofSR-numberofStandardRoom));
       
       break;
       
       case 2:
           deluxeRoom dR[];
           System.out.println("How many room do you want:");
           int numberofDeluxeRoom=input.nextInt();
           dR=new deluxeRoom[numberofDeluxeRoom];
           for(int j=0;j<numberofDeluxeRoom;j++){
           dR[j] = new deluxeRoom(getID);
           dR[j].RoomSize();
           dR[j].printDeluxeRoomInfo();
           }
            System.out.println("Available Deluxe Room:"+(numberofDR-numberofDeluxeRoom));
       break;
    }
       
      
  }
}
