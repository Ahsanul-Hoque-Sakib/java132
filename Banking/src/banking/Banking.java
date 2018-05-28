package banking;

public class Banking {

   public static void main(String[] args) {
       
       AccountHolder[] obj = new AccountHolder[2];
       
       for(int i=0;i<2;i++){
           obj[i]=new AccountHolder();
       }
       
       for(int i =0;i<2;i++){
       obj[i].AccountHolderInfo();
       Double PreBalance = obj[i].moneyAfterDepositOrWithdraw();
       System.out.println("Pre-Balance :"+PreBalance );
       obj[i].depositAmount();
       obj[i].withdrawAmount();
       obj[i].CheckLoan();
       obj[i].inputLoan();
       Double Balance = obj[i].moneyAfterDepositOrWithdraw();
       System.out.println("Balance :"+Balance );
       Double InterestAmount = obj[i].calculateInterest();
       System.out.println("Interest Amount:"+InterestAmount);
       
    }
       Double allAmount = 0.0;
       for(int i=0;i<2;i++){
           allAmount+=obj[i].moneyAfterDepositOrWithdraw();
       }
       System.out.println("Input Manager Information"+"\n");
       Manager obj1 = new Manager();
       obj1.ManagerInfo(allAmount);
       obj1.printManagerinfo();
       System.out.println("Input Accountant Information"+"\n");
       Accountant obj2= new Accountant();
       obj2.AccountantInfo(allAmount);
       obj2.printAccountantinfo();
   }
}
