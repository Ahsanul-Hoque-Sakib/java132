package banking;


public class Manager extends Employee{
    final double bonusRate = 0.07;
    
    public void ManagerInfo(double allAmount){
        inputAll();
        Salary = fixedSalary+honourableBonus+eidBonus+(allAmount*bonusRate);
    }
    public void printManagerinfo(){
        System.out.println("ManagerName:"+name+"\n"+"Age:"+age+"\n"+"Eid Bonus:"+eidBonus+"\n"+"Honourable Bonus:"+honourableBonus+"\n"+"Salary:"+Salary+"\n");
        
    }
}
