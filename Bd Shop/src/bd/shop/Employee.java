/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.shop;

/**
 *
 * @author user
 */
public class Employee {
    

  
    int id;
    String Name;
    String Designation;
    Double Salary;
    
    public void setValue(String Name,String Designation,int id){
    this.Name=Name;
    this.Designation=Designation;
    this.id=id;
   
}

    public void SetSalary(){
        if(Designation.equalsIgnoreCase("Manager")){
            Salary = 20000.0;
        }
        else{
            Salary = 10000.0;
        }
    }
    public double yearlySalary(){
        return Salary*12;
    }
    
    public double bonus(){
        if(Designation.equalsIgnoreCase("Manager")){
            return Salary*0.2;
        }
        else{
            return Salary*0.05;
        }
    }
    
    public void Display(){
        System.out.println("ID:"+id+"Name:"+Name+"Designation:"+Designation+"Salary:"+Salary+"YearlySalary:"+yearlySalary()+"Bonus:"+bonus());
    }



   

}
