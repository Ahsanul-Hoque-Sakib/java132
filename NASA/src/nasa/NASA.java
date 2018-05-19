package nasa;
import java.util.Scanner;
public class NASA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input TotalBuget:");
        Double totalBuget = input.nextDouble();
        System.out.println("Input Gemini Buget:");
        Double total_Project_Gemini_buget = input.nextDouble();
        System.out.println("Input Vikings Buget:");
        Double total_Project_Vikings_buget = input.nextDouble();
        
        project p1 = new project(totalBuget,total_Project_Gemini_buget,total_Project_Vikings_buget);
        Double bugetCalculation=p1.totalBugetCalculation();
        System.out.println("Total Buget Calculation:"+bugetCalculation);
        p1.compareBuget();
    }
    
}
