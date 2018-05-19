package faq;
public class Country {

    String CountryId;
    String CountryName;
    int totalFoodProduce;
    
    public Country(String CountryId,String CountryName,int totalFoodProduce){
        this.CountryId=CountryId;
        this.CountryName=CountryName;
        this.totalFoodProduce=totalFoodProduce;
    }
    
    public void totalFoodProduction(){
        if(totalFoodProduce<=50*1000000){
            System.out.println("Need help from FAQ");
        }
        else{
            System.out.println("Does not need any help from FAQ ");
        }
    }
}
