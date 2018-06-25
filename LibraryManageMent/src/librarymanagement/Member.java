package librarymanagement;
import java.util.Scanner;
public class Member {

    String memberName;
    String memberID;
    Scanner in ;
    
    public Member(){
        in = new Scanner(System.in);
    }
    
    public void inputMemberinfo(){
        System.out.println("Member ID:");
        memberID = in.nextLine();
        System.out.println("Name:");
        memberName = in.nextLine();
    }
    
    public  String getMemeberID(){
        return memberID;
    }
    
    public String getMemeberName(){
        return memberName;
    }
}
