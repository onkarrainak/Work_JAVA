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
        System.out.println(" " + marks );
    }    
    
    public void findResult ()
    {
        if (marks >= 90) {
            System.out.println("Your result is A+ grade ");
            
        }else if (marks > 80 && marks <=90) {
            System.out.println("Your result is A grade ");
        }
        else if (marks > 70 && marks <=80) {
            System.out.println("Your result is B grade ");
        }
        else if (marks > 60 && marks <=70) {
            System.out.println("Your result is grade ");
        }
        else if (marks > 50 && marks <=60) {
            System.out.println("Your result is D grade ");
        }
        else if (marks > 35 && marks <=50) {
            System.out.println("Your result is E grade ");
        }
        else {
            System.out.println("Your result is fail  ");
        }

    System.out.println("");

    }

    

    
}
