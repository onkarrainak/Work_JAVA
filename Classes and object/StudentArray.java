import java.util.Scanner;

public class StudentArray 
{
    int[] no = new int[5];


    public static void main(String[] args) {

        int[] no = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        int stu_count;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        stu_count = sc.nextInt();
        
        for(int i =0;i<stu_count;i++) 
        {
            System.out.println("Enter student roll no ");
            no[i] = sc.nextInt();
            System.out.println("Enter student name ");
            name[i]=sc.next();
            System.out.println("Enter student marks ");
            marks[i]=sc.nextInt();
        }  

        for (int i=0;i<stu_count;i++)
        {
            System.out.println("**************************************************************");
            System.out.println(no[i]);
			System.out.println(name[i]);
			System.out.println(marks[i]);
        }
        
    }

    
}
