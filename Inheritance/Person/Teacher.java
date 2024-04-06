package Person;

public class Teacher extends Person
{

    double salary;

    Teacher(int id,String name,String address,double salary)
    {
        super(id, name, address);
        this.salary = salary;

    }

    public void teacherdetails()
    {
        System.out.println("******* Teacher Details*******");
        super.PersonDetails();
        System.out.println(" "+ salary + "\n");
    }

}
