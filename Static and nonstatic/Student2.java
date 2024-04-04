public class Student2 
{

    int sid;
    String name;
    static String cname;

public Student2(int sid, String name) {
	
	this.sid = sid;
	this.name = name;
	
}


public static void readcname()
{
	cname = "JAVA";
}

public  void dispStudent()
{  
			
	System.out.println(sid+" " + name+ " "+cname);
}
	
public static void main(String[] args) 
{
	
	readcname();
	Student2 s1 = new Student2(1001,"shan");
	s1.dispStudent();
	Student2 s2 = new Student2(1002,"RAJ");
	s2.dispStudent();
	Student2 s3 = new Student2(1003,"SIJU");
	s3.dispStudent();
	Student2 s4 = new Student2(1004,"onkar");
	s4.dispStudent();
	
}
    
}
