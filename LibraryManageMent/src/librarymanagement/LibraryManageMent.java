package librarymanagement;

import java.util.Scanner;
public class LibraryManageMent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Which type of book do you want?");
        String bookType = input.nextLine();
        
        if(bookType.equalsIgnoreCase("Audio")){
            System.out.println("How many Audio Book You want to entry?");
            int numberOFBooks = input.nextInt();
            
            AudioCopy []AC = new AudioCopy[numberOFBooks];
            
            for(int i=0;i<numberOFBooks;i++){
                AC[i]=new AudioCopy();
                AC[i].audioCopyInfo();
                AC[i].printAudioCopyInfo();
            }
            input.nextLine();
            System.out.println("How Many Book do you Want?");
            int wantBook = input.nextInt();
            
            for(int z=0;z<wantBook;z++){
            System.out.println("Enter BookID:");
            int id = input.nextInt();
          
            for(int j=0;j<numberOFBooks;j++){
            if((AC[j].getBookId())==id){
                Member member = new Member();
                member.inputMemberinfo();
                AC[j].memberForBook();
            }
        }
    }
}
        else{
             System.out.println("How many Book You want to entry?");
            int numberOFBooks = input.nextInt();
            
            HardCopy []HC = new HardCopy[numberOFBooks];
            
            for(int i=0;i<numberOFBooks;i++){
                HC[i]=new HardCopy();
                HC[i].hardCopyInfo();
                HC[i].printHardCopyInfo();
            }
            input.nextLine();
            System.out.println("Enter BookID:");
            int id = input.nextInt();
          
            for(int j=0;j<numberOFBooks;j++){
            if((HC[j].getBookId())==id){
                Member member = new Member();
                member.inputMemberinfo();
                HC[j].memberForBook();
            } 
        } 
    }
}
    
}   
