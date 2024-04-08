package Employee1;

public class EmployeeMain {
    public static void main(String[] args) 
	{
		
		EmployeeCRUD obj = new EmployeeCRUD();
		
		obj.createArrayOfEmployee();
		
		obj.displayEmployee();
		
		obj.updateEmployee();
		
		obj.displayEmployee();
		
		obj.deleteEmployee();
		
		obj.displayEmployee();
		
		
	}
}
