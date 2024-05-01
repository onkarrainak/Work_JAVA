

import java.util.Scanner;

public class Student {

    int sid;
    String name;
    float mark;

    public static void main(String[] args) 
    {

        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.readStudent();
        s2.readStudent();
       
        s1.displayStudent();
        System.out.println("hashCode " + s1.hashCode());

        
        s2.displayStudent();
        System.out.println("hashCode " + s1.hashCode());
        
    }

    

    public void readStudent()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the student details");
        System.out.println("Enter Student id ");
        sid = s.nextInt();
        System.out.println("Enter Student name ");
        name = s.next();
        System.out.println("Enter Student marks ");
        mark = s.nextFloat();


    }
    
    public void displayStudent()
    {
        System.out.println("****************************");
        System.out.println(sid);
        System.out.println(name);
        System.out.println(mark);
        System.out.println("****************************");

    }
    
}
