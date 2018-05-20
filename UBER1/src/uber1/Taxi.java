/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber1;

/**
 *
 * @author user
 */
public class Taxi {
    
    
    Double  travelDistance;
    Double perKPrice;
    Double amount;
    String promotionDiscount;
    
    public Taxi(Double travelDistance,Double perKPrice,String promotionDiscount){
        
        this.travelDistance=travelDistance;
        this.perKPrice=perKPrice;
        this.promotionDiscount=promotionDiscount;
    }
    
    public Double calculateAmount(){
        return travelDistance*perKPrice;
    }
    
    public Double Discount(String Promotion_Discount,Double TotalAmount){
        if(promotionDiscount.equalsIgnoreCase("Active")){
              amount = TotalAmount*0.1;
            
        }
        else{
            amount = 0.0;
        }
        return amount;
                
    }
    
    public Double payable(Double TotalAmount,Double Discount){
        return TotalAmount-Discount;
        
    }
    
    public void Display(){
        System.out.println("Distance:"+travelDistance+"\n"+"Price:"+perKPrice+"\n"+"PromotionDiscoutn:"+promotionDiscount);
        
    }
}
