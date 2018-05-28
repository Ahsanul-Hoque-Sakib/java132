
package banking;


public class Accountant extends Employee {
    final double bonusRate =0.03;
    
    public void AccountantInfo(double allAmount){
        inputAll();
        Salary=fixedSalary+honourableBonus+eidBonus+(allAmount*bonusRate);
    }
    
    public void printAccountantinfo(){
        System.out.println("Accountant Name:"+name+"\n"+"Age:"+age+"\n"+"Eid Bonus:"+eidBonus+"\n"+"Honourable Bonus:"+honourableBonus+"\n"+"Salary:"+Salary+"\n");
        
    }
}
