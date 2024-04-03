public class Employee
{
    //instance variable or non static variable
    int eid;
    String ename;
    float sal;


    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        System.out.println("First object ");

        e1.eid = 1001;
        e1.ename = "onkar";
        e1.sal = 60000;

        System.out.println(e1.eid + " \n" + e1.ename + " \n" + e1.sal + " \n");


        Employee e2 = new Employee();
        System.out.println("second object ");

        e2.eid = 1002;
        e2.ename = "Rainak";
        e2.sal = 70000;
        
        System.out.println(e2.eid + "\n " + e2.ename + " \n" + e2.sal);
        
    }

}