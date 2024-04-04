import java.util.Scanner;

public class Product1 {

    
    int pid;
    String pname;
    float price;    

public Product1() 
{

}

public Product1(int pid, String pname, float price) 
{
    this.pid = pid;
    this.pname = pname;
    this.price = price;
}
    public static void main(String[] args) 
    {
        
		Product1[] p= new Product1[3];
				
		for(int i=0;i<2;i++)
		{
		
			p[i]= new Product1();
			
			Product1 obj =p[i].readProduct();
			
			p[i] = obj;
			
			p[i].displayProduct();
		    
			p[i].findDiscount();
			
			System.out.println();
			
		}
		 
        
    }
	
	public Product1 readProduct()
	{
		
      Scanner s = new Scanner(System.in);
		
			System.out.println("enter pid");
			pid = s.nextInt();
			System.out.println("enter pname");
			pname = s.next();
			System.out.println("enter price");
			price = s.nextFloat();
			
			Product1 p = new Product1(pid,pname,price);
			
			return p;
			
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
	
	

}
