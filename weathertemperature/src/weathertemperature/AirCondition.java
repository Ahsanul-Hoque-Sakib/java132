package weathertemperature;

public class AirCondition {
    
    private Double Temperature;
    
    public void AssignValue(String Weather){
      if(Weather.equalsIgnoreCase("Warm")){
        this.Temperature=18.0;
        //System.out.println("Weather is Warm");
      }
      else{
          this.Temperature=25.0;
          //System.out.println("Weather is Cold");
      }
         
    }
    
    public Double GetValue(){
        //System.out.println(Temperature);
       return Temperature;
    }
    
}
