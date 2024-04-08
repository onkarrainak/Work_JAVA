package Employee1;

import java.util.Scanner;

public class EmployeeCRUD 
{
    Employee[] e ;


    public void createArrayOfEmployee()
    {
        e = new Employee[2];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i<e.length;i++)
        {
            int empno = s.nextInt();
            String name = s.next();
            float sla = s.nextFloat();
            String desig = s.next();

            e[i] = new Employee(empno, name, sla, desig);
        }

    }

    public void displayEmployee()
    {
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null){
                e[i].employeeDetails();
            }
            
        }
    }

    public void updateEmployee()
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

    public void deleteEmployee() 
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
