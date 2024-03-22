import java.util.Scanner;


public class Electricitybill {

    public static void main(String[] args) {
        Electricitybill bill = new Electricitybill();
        bill.read_data();
        bill.show_data();
        bill.compute_bill();
        
    }


    int cust_id;
    String cusr_name;
    float units_consumed;


    public void read_data()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Customer id ");
        cust_id = s.nextInt();
        System.out.println("Enter the Customer name ");
        cusr_name = s.next();
        System.out.println("Enter the consumed units ");
        units_consumed = s.nextFloat();

    }

    public void show_data()
    {
        System.out.println("******************");
        System.out.println(cust_id);
        System.out.println(cusr_name);
        System.out.println(units_consumed);
    }

    public void compute_bill()
    {
        int bill;
        if (units_consumed <=100){
            bill= (int) (units_consumed*1.2);
            System.out.println("Bill to be pay = "+ bill);
        }else if (units_consumed <=300){
            bill = (int)(100*1.2 + (units_consumed-100)*2);
            System.out.println("Bill to be pay = "+ bill);
        }else if (units_consumed <=600){
            bill = (int)(100*1.2 +200*2 + (units_consumed-300)*3);
            System.out.println("Bill to be pay = "+ bill);
        }else { 
            bill = (int)(100*1.2 +200*2 + 300 * 3 + (units_consumed-600)*5);
            System.out.println("Bill to be pay = "+ bill);
        }

    }
    
}
