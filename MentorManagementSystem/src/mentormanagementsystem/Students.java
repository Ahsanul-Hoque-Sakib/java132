package mentormanagementsystem;

public class Students extends Person{

    int absent_Days;
    Double cgpa;
    Double payble;
    Double paid;
    
    public Students(){
        
    }
    
    public void inputStudentInfo(){
        inputAll();
        System.out.println("AbsentDays:");
        absent_Days = r.nextInt();
        System.out.println("CGPA:");
        cgpa = r.nextDouble();
        System.out.println("Payble:");
        payble = r.nextDouble();
        System.out.println("Paid:");
        paid = r.nextDouble();
        
    }
    
    public String getId(){
        return id;
    }
    
    public Double getPayble(){
        return payble;
    }
    
    public Double getPaid(){
        return paid;
    }
      
    public Double cgpa(){
        return cgpa;
    }
    
    public int absentDays(){
        return absent_Days;
    }
    
}
