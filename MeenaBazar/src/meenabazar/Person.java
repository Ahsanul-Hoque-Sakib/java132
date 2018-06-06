package meenabazar;
import java.util.Scanner;
public class Person {

    String id;
    String name;
    Scanner input;
    public Person(){

        input = new Scanner(System.in);
    }
    
    public void inputAll(){
        System.out.println("Input ID:");
        id=input.nextLine();
        System.out.println("Input Name:");
        name=input.nextLine();
    }
}

