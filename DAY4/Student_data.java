import java.util.Scanner;


public class Student_data
{
    public static void main(String[] args) {
        
        Student_data student = new Student_data();
        student.get_data();
        student.display_data();
    }
        String name;
        int Roll_no;
        float marks;

        

    public void get_data()
    {
       
          
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Student Name "); 
        name = scn.next();
        System.out.println("Enter the Student Roll no "); 
        Roll_no = scn.nextInt();
        System.out.println("Enter the Student Marks "); 
        marks = scn.nextFloat();
    }

    public void display_data()
    {
        System.out.println("******Student Data******");
        System.out.println("Student Roll no is " + Roll_no);
        System.out.println("Student name is " + name);
        System.out.println("Student marks is " + marks);

    }
    

}