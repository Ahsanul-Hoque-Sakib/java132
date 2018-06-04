package hotelmanagement;

public class deluxeRoom extends Room {
    String RoomSize;
  
    public deluxeRoom(){
        super();
    }
    
    public void RoomSize(){
         
        inputAll();
        System.out.println("Enter RoomSize:");
        RoomSize = input.nextLine();
    }
    
    public void printDeluxeRoomInfo(){
        System.out.println("RoomID:"+roomid+"\n"+"CustomerID:"+customerid+"\n"+"RoomSize:"+RoomSize);
    }
}
