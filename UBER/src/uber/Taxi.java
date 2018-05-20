package uber;
public class Taxi {
    Double travelDistance;
    Double perKMPrice;
    String Promotion_Discount;
    
    public Taxi(Double travelDistance,Double perKMPrice,String Promotion_Discount){
        this.travelDistance=travelDistance;
        this.perKMPrice=perKMPrice;
        this.Promotion_Discount=Promotion_Discount;
    }
    public Double calculateAmount(){
        return travelDistance*perKMPrice;
    }    
    public Double Discount(Double TotalAmount,Double Discount){
        Double discount = Discount/100;
        Double amount = TotalAmount*discount;
        return amount;
    }   
      public Double PayableAmount(Double TotalAmount,Double Discount){
            
        if(Promotion_Discount.equalsIgnoreCase("Active")){
        Double Payable = TotalAmount - Discount;
        return Payable;
        }
        else{
           return TotalAmount;
    }
        }
    public void Display(){
        System.out.println("TravelDistance:"+travelDistance+"\n"+"PerKMPrice:"+perKMPrice+"\n"+
                "PromotionDiscount:"+Promotion_Discount);
    }
}
