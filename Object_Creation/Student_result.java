import java.util.Scanner;

public class Student_result
{
    public static void main(String[] args) {
    
        Student_result  stu = new Student_result();
        stu.get_data(); 
        stu.find_percentage();
        stu.final_result();

        
    }

    String name;
    float total_marks;
    float subject;
    int roll_no;
    float perc;


    public void get_data()
    {
        System.out.println("Enter the student data");
        Scanner s = new Scanner(System.in);
        System.out.println("Enyer the student roll no. ");
        roll_no = s.nextInt();
        System.out.println("Enter the student name");
        name = s.next();
        System.out.println("Enter the exam total marks ");
        total_marks = s.nextFloat();
        System.out.println("Enter the student total marks ");
        subject = s.nextFloat();
    }

    public void find_percentage()
    {
        perc = (subject*100)/total_marks;
        System.out.println("The percentage is " + perc); 
    }

    public void final_result()
    {
        if (perc >= 90) {
            System.out.println("Your result is A+ grade ");
            
        }else if (perc > 80 && perc <=90) {
            System.out.println("Your result is A grade ");
        }
        else if (perc > 70 && perc <=80) {
            System.out.println("Your result is B grade ");
        }
        else if (perc > 60 && perc <=70) {
            System.out.println("Your result is grade ");
        }
        else if (perc > 50 && perc <=60) {
            System.out.println("Your result is D grade ");
        }
        else if (perc > 35 && perc <=50) {
            System.out.println("Your result is E grade ");
        }
        else {
            System.out.println("Your result is fail  ");
        }

    }


}

