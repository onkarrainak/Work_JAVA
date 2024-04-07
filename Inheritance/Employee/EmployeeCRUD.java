package Employee;

import java.util.Scanner;


public class EmployeeCRUD {

    public static Employee[] createArrayOfEmployee()
    {
        Employee[] e = new Employee[2];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i<e.length;i++)
        {
            int empno = s.nextInt();
            String name = s.next();
            float sla = s.nextFloat();
            String desig = s.next();

            e[i] = new Employee(empno, name, sla, desig);
        }
        
        return e;

    }

    public static void displayEmployee(Employee[] e)
    {
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null){
                e[i].employeeDetails();
            }
            
        }
    }

    public static void updateEmployee(Employee[] e)
    {
        System.out.println("Enter the Empployee No to update salary ");
        Scanner s = new Scanner(System.in);
        int eno = s.nextInt();
        for (int i = 0; i<e.length;i++)
        {
            if(e[i].empno == eno){
                e[i].sal = e[i].sal+2000;
            }
            
        }
    }

    public static void deleteEmployee(Employee[] e) 
    {

	 System.out.println("enter the empno to DELETE");
	    
	    Scanner s = new Scanner(System.in);
		int eno = s.nextInt();
	
		for(int i = 0;i<e.length;i++)
		{
			if(e[i].empno == eno)
			{
				e[i]= null;
			}
				
		}
    }   


}
