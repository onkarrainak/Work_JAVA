/* Write a Java program to create Student class with member variable as id, name, mark and result. 
Use method to initialize the value of name, id and marks. Write a member function to find the result 
and display the student details with result. */



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