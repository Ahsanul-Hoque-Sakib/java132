package librarymanagement;

public class HardCopy extends Books{

    String NumberOFPage;
    
    public void hardCopyInfo(){
        inputAll();
        in.nextLine();
        System.out.println("Number Of Page:");
        NumberOFPage= in.nextLine();
    }
    
        public void memberForBook(){
        Member obj = new Member();
        setBorrowerID(obj.getMemeberID());
    }

    
    public void printHardCopyInfo(){
        System.out.println("BookID"+getBookId()
                + "BookTitle:"+getBookTitle()
                + "BookAuthor:"+getBookAuthor()
                + "BookPrice:"+getBookPrice()
                + "NumberOfPage:"+NumberOFPage);
        
        if (bookAvailability()){
            System.out.println("Book is Available");
        }
        else{
            System.out.println("Book is not Available");
        }
    }
}
