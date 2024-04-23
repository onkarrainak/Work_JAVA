import java.util.Scanner;

public class Student_results
{
    public static void main(String[] args) {
    
        Student_results  stu = new Student_results();
        stu.get_data(); 
        stu.get_marks();
        stu.check_marks();
        

        
        if(stu.check_marks() == name)
        {
            stu.find_percentage();
            stu.final_result();
        }
        else{
            System.out.println(" Rewrite the input. ");
            stu.get_marks();
            stu.find_percentage();
            stu.final_result();

        }        
    }

    static String name;
    float total_marks;
    int subject;
    int subject1;
    int subject2;
    int roll_no;
    float perc;
    int sum;
    int marks;


    public void get_data()
    {
        System.out.println("Enter the student data");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student roll no. ");
        roll_no = s.nextInt();
        System.out.println("Enter the student name");
        name = s.next();
        System.out.println("Enter the exam total marks ");
        total_marks = s.nextFloat();
        

        sum = subject + subject1 + subject2; 
    }

    public void get_marks()
    {
        System.out.println("Enter the student 3 sub marks ");

        Scanner s = new Scanner(System.in);
        subject = s.nextInt();
        subject1 = s.nextInt();
        subject2 = s.nextInt();
        sum = subject + subject1 + subject2; 

    }




    public void find_percentage()
    {
        perc = (sum*100)/total_marks;
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

    public String check_marks()
    {
        
        if((subject < 0 || subject > 100)) 
        {
           return "Rewrite the input. ";
        }
    
        if((subject1 < 0 || subject1 > 100)) 
        {
            return "Rewrite the input. ";
        }
        
        if((subject2 < 0 || subject2 > 100)) 
        {
            return "Rewrite the input.";
        }
        return name;
    }


}

