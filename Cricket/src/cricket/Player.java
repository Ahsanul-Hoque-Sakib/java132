package cricket;

public class Player {
  
    String Name;
    String Age;
    Double prizeMoney;
    Double totalPrizeMoney;
    
    public Player(String Name,String Age,Double prizeMoney){
        this.Name=Name;
        this.Age=Age;
        this.prizeMoney=prizeMoney;
    }
    
    public Double calculate_PrizeMoney(){
        return prizeMoney*10;
    }
    
    public Double bonus(int Matches){
        Double b=0.0;
        if(Matches>10){
            b = 1000.0;
        }
        return b;
    }
    
    public void Display(){
        System.out.println("Name:"+Name+"\n"+"Age:"+Age+"\n"+
                "PrizeMoney"+prizeMoney+"\n"+"Total PrizeMoney:"+calculate_PrizeMoney());
    }
}
