import java.util.Scanner;

public class Product {

    public static void main(String[] args) 
    {
        // Product p1 = new Product(1001, "Dell laptop", 55000);
        // p1.displayProduct();
        // p1.findDiscound();

        // Product p2 = new Product(1002, "HP laptop", 45000);
        // p2.displayProduct();
        // p2.findDiscound();

        // Product p3 = new Product(1003, "macbook laptop", 100000);
        // p3.displayProduct();
        // p3.findDiscound();

        // creating product array

        // Product[] p = new Product[4];

        // p[0] = new Product(1001, "Dell laptop", 50500);
        // p[0].displayProduct();
        // p[0].findDiscound();

        // p[1] = new Product(1002, "HP laptop", 450000);
        // p[1].displayProduct();
        // p[1].findDiscound();

        // p[2] = new Product(1003, "macbook laptop", 100000);
        // p[2].displayProduct();
        // p[2].findDiscound();



        // Product[] p = new Product[3];
        // p[0] = new Product(1001, "Dell laptop", 50500);
        // p[1] = new Product(1002, "HP laptop", 450000);


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
