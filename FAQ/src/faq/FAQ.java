package faq;
import java.util.Scanner;
public class FAQ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input CountryID:");
        String CountryID=input.nextLine();
        System.out.println("Input CountryName:");
        String CountryName=input.nextLine();
        System.out.println("TotalFoodProduce:");
        int totalFoodProduce=input.nextInt();
        
        Country c1 = new Country(CountryID,CountryName,totalFoodProduce);
        c1.totalFoodProduction();
        
    }
    
}
