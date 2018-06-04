package hotelmanagement;

public class standardRoom extends Room{
    String Ac_availability;
    
    public standardRoom(){
        super();
    }
    
    public void acAvailability(){
        
        inputAll();
        System.out.println("Input AC-Availability(Press 1 for yes//Press 0 for no):");
        Ac_availability= input.nextLine();
        
    }
    
   public void printStandardRoomInfo(){
       System.out.println("RoomID:"+roomid+"\n"+"CustomerID:"+customerid+"\n"+"AC_Avaliability:"+Ac_availability);
   }
}
