package nasa;

public class project {

    Double total_Project_Gemini_buget;
    Double total_Project_Vikings_buget;
    Double totalBuget;
    
    public project(Double totalBuget,Double total_Project_Gemini_buget,Double total_Project_Vikings_buget){
        this.total_Project_Gemini_buget=total_Project_Gemini_buget;
        this.total_Project_Vikings_buget=total_Project_Vikings_buget;
        this.totalBuget=totalBuget;
    }
    
    public Double totalBugetCalculation(){
        return total_Project_Gemini_buget+total_Project_Vikings_buget;
    }
    
    public void compareBuget(){
        if(totalBugetCalculation()>totalBuget){
            System.out.println("Projects Can not be Done");
        }
        else{
            System.out.println("Projects will be Done");
        }
    }
}
