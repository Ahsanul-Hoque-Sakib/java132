/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.shop;
import java.util.Scanner;
public class BdShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
             
            Employee e1  = new Employee();
            e1.setValue("Sakib","Manager",101);
            e1.SetSalary();
            e1.bonus();
            e1.Display();
    }
    
}
