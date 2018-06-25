package librarymanagement;

public class AudioCopy extends Books{

    String Duration;
    
    public void audioCopyInfo(){
        inputAll();
        in.nextLine();
        System.out.println("Duration:");
        Duration = in.nextLine();
    }
    
    public void memberForBook(){
        Member obj = new Member();
        setBorrowerID(obj.getMemeberID());
    }
    
    public void printAudioCopyInfo(){
        System.out.println("BookID"+getBookId()
                + "BookTitle:"+getBookTitle()
                + "BookAuthor:"+getBookAuthor()
                + "BookPrice:"+getBookPrice()
                + "Duration:"+Duration);
        
        if (bookAvailability()){
            System.out.println("Book is Available");
        }
        else{
            System.out.println("Book is not Available");
        }
    }
}
