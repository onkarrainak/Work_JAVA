package Person;

public class main {

    public static void main(String[] args) {

        Student stud  = new Student(1001,"Onkar","Kolhapur",500);
        stud.StudentDetails();

        Teacher teac = new Teacher(5001, "Rainak", "kolhapur", 100000);
        teac.teacherdetails();
        
    }
}
