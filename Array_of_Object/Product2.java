import java.util.Scanner;

public class Product2 {

    int pid;
	String pname;
	float price;
	
	
	public Product2(int pid, String pname, float price) 
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	
	public void displayProduct()
	{
		System.out.print(pid+ " " + pname+ " " +price + " ");
	}
	
	
	public void findDiscount()
	{
		
		float discount;
		
		if(price>=50000)
		{
			discount = price*0.02f;
		}else
		{
			discount = price*0.01f;
		}
		
		System.out.println(discount);
	}
	
	public static Product2[] createArrayofObject() 
	{
	
		Scanner s = new Scanner(System.in);
		
		Product2[] p= new Product2[2];
		
		int pid;
		String pname;
		float price;
		
		for(int i=0;i<2;i++)
		{
			
		System.out.println("enter pid");
		 pid = s.nextInt();
		System.out.println("enter pname");
		 pname = s.next();
		System.out.println("enter price");
		 price = s.nextFloat();
				 
		 p[i] = new Product2(pid,pname,price);
		 
		 
		}
		
		return p;
	}
		
		
	public static void main(String[] args) 
	{
		
		
		Product2[] p =createArrayofObject();
		
		for(int i = 0;i<2;i++)
		{
			p[i].displayProduct();
			p[i].findDiscount();
		}
		
			
	}
    
}
