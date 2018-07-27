package mentormanagementsystem;
import java.util.Scanner;
public class Person {

    String id;
    String name;
    String contact_no;
    Scanner r;
    public Person(){
        r = new Scanner(System.in);
    }
    
    public void inputAll(){
    System.out.println("ID:");
    id = r.nextLine();
    System.out.println("Name:");
    name = r.nextLine();
    System.out.println("Contact:");
    contact_no = r.nextLine();
    }
    
}
