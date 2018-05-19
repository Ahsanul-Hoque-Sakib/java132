package employeemanagement;

public class Employee {
  
    String id;
    String Name;
    String Designation;
    Double Salary;
    
    public Employee(String id,String Name,String Designation){
        
        this.id=id;
        this.Name=Name;
        this.Designation=Designation;
    }
    
    public void setSalary(){
        if(Designation.equalsIgnoreCase("Manager")){
            Salary = 20000.0;
        }
        else{
            Salary = 10000.0;
        }
    }
    public Double yearlySalary(){
        return Salary*12;
    }
    
    
    public Double bonus(){
        if(Designation.equalsIgnoreCase("Manager")){
            return Salary*0.2;
        }
        else{
            return Salary*0.05;
        }
    }
    
    public void Display(){
        System.out.println("ID:"+id+"\n"+"Name:"+Name+"\n"+"Designation:"+Designation+"\n"+
                "Salary:"+Salary+"\n"+"YearlySalary:"+yearlySalary()+"\n"+"Bonus:"+bonus());
    }
}
