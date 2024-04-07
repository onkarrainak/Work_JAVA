package Employee;

public class EmployeeMain {
    public static void main(String[] args) 
	{
		
		Employee[] emp =EmployeeCRUD.createArrayOfEmployee();
		
		EmployeeCRUD.displayEmployee(emp);
		
		EmployeeCRUD.updateEmployee(emp);
		
		EmployeeCRUD.displayEmployee(emp);
		
		EmployeeCRUD.deleteEmployee(emp);
		
		EmployeeCRUD.displayEmployee(emp);
		
		
	}
}
