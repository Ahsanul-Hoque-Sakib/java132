package mentormanagementsystem;

public class Advisor extends Person{

    int numberOfStudents;
    String[] StudentId = new String[40];
    public Advisor(){
        numberOfStudents =0;
    }
    public void inputAdvisorInfo(){
        inputAll();
    }

    public void AddStudent(String id){
      if(numberOfStudents == 40){
          System.out.println("No Vacancy");
      }
      
      else{
          numberOfStudents+= 1;
          StudentId[numberOfStudents - 1] = new String();
          StudentId[numberOfStudents-1]=id;
      }
    }
    
    
    public void ShowDue(String id, Double payble, Double paid){
        int index = -1;
        for(int i =0;i<StudentId.length;++i){
            if(StudentId[i].equals(id)){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            System.out.println("Not Available");
        }
        else{
            System.out.println("StudentID:"+StudentId[index]);
            System.out.println("Due:"+(payble-paid));
        } 
    }
    
    public void ShowLowCGPAIds(String id,Double cgpa){
        int index = -1;
        for(int i =0;i<StudentId.length;++i){
            if(StudentId[i].equals(id)){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            System.out.println("Not Available");
        }
        else{
            if(cgpa<3.00){
            System.out.println("StudentID:"+StudentId[index]);
            System.out.println("CGPA:"+cgpa);
            }
        }
    }
    
    public void ShowAbsentDays(String id,int Day){
        int index = -1;
        for(int i =0;i<StudentId.length;++i){
            if(StudentId[i].equals(id)){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            System.out.println("Not Avalilable");
        }
        else{
            if(Day>10){
                System.out.println("StudentID:"+StudentId[index]);
                System.out.println("AbsentDays:"+Day);
            }
        }
        
    }
    
    
    
}
