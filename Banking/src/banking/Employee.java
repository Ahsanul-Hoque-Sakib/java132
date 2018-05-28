package banking;
import java.util.Scanner;
public class Employee {
    String name;
    String age;
    final double fixedSalary = 8000.0;
    double eidBonus;
    double honourableBonus;
    double Salary;
    Scanner input;
    public Employee(){
        input = new Scanner(System.in);
    }
    
     public void inputAll(){
        
     System.out.println("Employee Name:");       
     name=input.nextLine();
     //input.nextLine();
     System.out.println("\n");
     System.out.println("Employee Age:");
     age=input.nextLine();
     System.out.println("Eid Bonus:");
     eidBonus=input.nextDouble();
     System.out.println("Honourable Bonus:");
     honourableBonus=input.nextDouble();
     }
}
