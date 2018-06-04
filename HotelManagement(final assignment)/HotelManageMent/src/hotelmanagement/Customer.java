package hotelmanagement;

public class Customer {
    String customerName;
    String CustomerID;
   
    public Customer(String id,String name){
       CustomerID = id;
       customerName= name;
    }
    
    public String getID(String id){
        return id;
    }
    
    
}
