package Person;

public class Student extends Person
{
    int marks;

    Student (int id,String name,String address,int marks)
    {
        super(id ,name,address);
        this.marks = marks;
    }
    
    
    public void StudentDetails()
    {
        System.out.println("******* Student Details*******");
        super.PersonDetails();
        System.out.println(" " + marks + "\n");
    }      
    
}
