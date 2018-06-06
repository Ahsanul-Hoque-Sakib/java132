package meenabazar;

public class Customer extends Person{

    String address;
    String cType;
    Double price=0.0;
    Double totalPrice=0.0;
    final double discount=0.05;
    final double tax=0.02;
    Double Discount;
    public void inputCustomerInfo(){
        inputAll();
        System.out.println("Address:");
        address=input.nextLine();
        System.out.println("Customer Type:");
        cType=input.nextLine();
    }
    
    public Double totalPrice(Double price){
        totalPrice=totalPrice+price;
        return totalPrice;
    }
    
    public Double taxAmount(){
        return totalPrice*tax;
    }
    
    public Double customerType(){
        if(cType.equalsIgnoreCase("Regular")){
            
            Discount =0.0;
        }
        
        else{
            Discount=totalPrice*discount;
        }
            
         return Discount;   
    }
    
    
    public void printCustomerInfo(){
        System.out.println("ID:"+id+"\n"+"Name:"+name+"\n"+"Address:"+address+"\n"+"CustomerType:"+cType);
        
    }
    
    
}
    

