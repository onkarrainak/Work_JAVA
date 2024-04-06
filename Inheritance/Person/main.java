package Person;

public class main {

    public static void main(String[] args) {

        Student stud  = new Student(1001,"Onkar Rainak","Kolhapur",85);
        stud.StudentDetails();
        stud.findResult();

        Teacher teac = new Teacher(5001, "Jon", "kolhapur", "English");
        teac.teacherdetails();
        
    }
}
