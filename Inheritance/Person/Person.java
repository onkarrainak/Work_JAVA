package Person;


public class Person 
{
    int id;
    String name;
    String address;

    Person (int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        
    }

    public void PersonDetails()
    {
        System.out.print(id + " " +  name + " " + address );
    }
    
}