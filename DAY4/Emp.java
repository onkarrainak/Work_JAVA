import java.util.Scanner;

public class Emp {

    public static void main(String[] args) {
        Emp e = new Emp();
        e.read_emp_data();
        e.display_Emp_data();


    }

    int emp_no;
    String emp_name;
    String designation;
    String dept;
    double salary;

    public void read_emp_data()
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Employee id ");
        emp_no = s.nextInt();
        System.out.println("Enter the Employee name ");
        emp_name = s.next();
        System.out.println("Enter the Employee designation ");
        designation = s.next();
        System.out.println("Enter the Employee department  ");
        dept = s.next();
        System.out.println("Enter the Employee salary ");
        salary = s.nextDouble();


    }    
    public void display_Emp_data()
    {
        System.out.println("***************************\n\n");
        System.out.println("The Employee id " + emp_no);
        System.out.println("The Employee name " + emp_name);
        System.out.println("The Employee designation " + designation);
        System.out.println("The Employee department " + dept);
        System.out.println("The Employee salary " + salary);
        
        
    }

}
