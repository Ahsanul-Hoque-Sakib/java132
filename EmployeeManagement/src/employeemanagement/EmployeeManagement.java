package employeemanagement;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Input ID:");
        String id = input.nextLine();
        System.out.println("Input Name:");
        String Name=input.nextLine();
        System.out.println("Input Designation:");
        String Designation=input.nextLine();
        Employee kabbo = new Employee(id,Name,Designation);
        kabbo.setSalary();
        kabbo.Display();
        
       
    }
    
}
