package banking;
import java.util.Scanner;
public class AccountHolder {

    String AccountNumber;
    String name;
    Double currentBalance=10.0;
    Double deposit;
    Double withdraw;
    final double intererst = 0.1;
    Double loan;
    Scanner input;
    
    public AccountHolder(){
        input = new Scanner(System.in);
    }
   
    public void AccountHolderInfo(){
        System.out.println("Account Number:");
        AccountNumber=input.nextLine();
        System.out.println("Account Holder Name:");
        name = input.nextLine();
        
    }
    
    public double depositAmount(){
        System.out.println("Deposit Amount:");
        deposit = input.nextDouble();
        currentBalance += deposit;
        return currentBalance;
        
    }
    
    public double withdrawAmount(){
        System.out.println("Withdraw Amount:");
        withdraw=input.nextDouble();
        if(currentBalance>withdraw){
        currentBalance -= withdraw;
        
        }
        else{
            System.out.println("You Don't Have Sufficeint Money");
        }
        return currentBalance;
    }
    
    public double calculateInterest(){
        return currentBalance*intererst;
    }
    
    public boolean CheckLoan(){
        return currentBalance>500;
    }
    
    public void inputLoan(){
        if(CheckLoan()){
            System.out.println("Enter Loan Amount:");
            loan = input.nextDouble();
        }
        else{
            System.out.println("You are not Eligible for Loan");
            
        }
    }
    
    public double moneyAfterDepositOrWithdraw(){
        return currentBalance;
    }
}
