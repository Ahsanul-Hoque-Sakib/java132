package mentormanagementsystem;
import java.util.Scanner;
public class MentorManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number Of Students:");
        int number = input.nextInt();
        Students[] stu = new Students[number];
        System.out.println("Student Information");
        for(int y =0;y<stu.length;++y){
            stu[y] = new Students();
            stu[y].inputStudentInfo();
        }
        System.out.println("Advisor Information");
        Advisor adv = new Advisor();
        adv.inputAdvisorInfo();
        
        for(int i = 0;i<number;i++){
            adv.AddStudent(stu[i].getId());
        }
        
        for(int i =0;i<number;i++){
            adv.ShowDue(stu[i].getId(),stu[i].getPayble(),stu[i].getPaid());
            adv.ShowLowCGPAIds(stu[i].getId(), stu[i].cgpa());
            adv.ShowAbsentDays(stu[i].getId(), stu[i].absentDays());
        }
    }
    
}
