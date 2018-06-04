package hotelmanagement;

public class deluxeRoom extends Room {
    String RoomSize;
  
    public deluxeRoom(String id){
        super(id);
    }
    
    public void RoomSize(){
         
        rent_Room();
        System.out.println("Enter RoomSize:");
        RoomSize = input.nextLine();
    }
    
    public void printDeluxeRoomInfo(){
        System.out.println("RoomID:"+roomid+"\n"+"CustomerID:"+customerid+"\n"+"RoomSize:"+RoomSize);
    }
}
