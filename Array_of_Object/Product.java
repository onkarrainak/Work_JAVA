import java.util.Scanner;

public class Product {

    public static void main(String[] args) 
    {
        Product[] p = new Product[3];

        Scanner s = new Scanner(System.in);
        int pid;
		String name;
		float price;

        for (int i = 0; i < 2; i++) {
            System.out.println("enter pid");
			pid = s.nextInt();
			System.out.println("enter pname");
			name = s.next();
			System.out.println("enter price");
			price = s.nextFloat();
			
			p[i] = new Product(pid,name,price);
            
        }

        for(int i=0;i<2;i++)
		{
					
			p[i].displayProduct();
		    p[i].findDiscound();
			System.out.println();
			
		}        
    }

    int pid;
    String pname;
    float price;

    public Product (int pid,String pname,float price)
    {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public void displayProduct()
    {
        System.out.println(pid + " " + pname + " " + price + " ");        
    }
    
    public void findDiscound()
    {
        float discound;
        if (price >= 50000) 
        {
            discound = price * 0.02f;
        }
        else
        {
            discound = price * 0.01f;   
        }
        System.out.println("Discound On this product is " + discound + "\n");
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
