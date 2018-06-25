package librarymanagement;
import java.util.Scanner;
public class Books {

    private int BookId;
    private String BookTitle;
    private String BookAuthor;
    private Double BookPrice;
    private String Possession="0";
    
    Scanner in;
    
    public Books(){
        in = new Scanner(System.in);
    }
    
    public void inputAll(){
        System.out.println("BookID;");
        BookId=in.nextInt();
        in.nextLine();
        System.out.println("BookTitle");
        BookTitle=in.nextLine();
        System.out.println("BookAuthor:");
        BookAuthor=in.nextLine();
        System.out.println("BookPrice:");
        BookPrice=in.nextDouble();
    }
    
    public int getBookId(){
        return BookId;
    }
    
    public String getBookTitle(){
        return BookTitle;
    }
    
    public String getBookAuthor(){
       return BookAuthor;
    }
    
    public Double getBookPrice(){
        return BookPrice;
    }
    
    public Boolean bookAvailability(){
        if(Possession.equals("0")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setBorrowerID(String memberID){
        Possession=memberID;
        
    }
    
    public String getBorrowerID(){
        return Possession;
    }
    
}
