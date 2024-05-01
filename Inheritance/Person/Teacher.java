package Person;

public class Teacher extends Person
{

    String  Subject;

    Teacher(int id,String name,String address,String Subject)
    {
        super(id, name, address);
        this.Subject = Subject;

    }

    public void teacherdetails()
    {
        System.out.println("******* Teacher Details*******");
        super.PersonDetails();
        System.out.println(" "+ Subject + "\n");
    }
    

}
