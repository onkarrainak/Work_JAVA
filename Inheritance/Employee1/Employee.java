package Employee1;

public class Employee {
    int empno;
    String name;
    float sal;
    String desig;
    
    
    public Employee (int empno, String name, float sal, String desig)
    {
        this.empno = empno;
        this.name = name;
        this.sal = sal;
        this.desig = desig;

    }

    public void employeeDetails()
    {
        System.out.println(empno + " " + name + " " + sal + " " + desig + " " );
    }
}
