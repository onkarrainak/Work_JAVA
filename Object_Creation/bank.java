import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        bank acc = new bank();
        acc.account_work();
        
        
    }
    Scanner s = new Scanner(System.in);
    double account_no;
    String name;
    double amount = 20000;
    double add_amount;
    int number;
    
    public void account_work()
    {
        bank acc = new bank();
        acc.get_data();
        System.out.println("Your balance is " + amount);
        System.out.println("Enter 1 for withdraw");
        System.out.println("Enter 2 for deposit");
        System.out.println("Enter Your choice");
        number = s.nextInt();
        switch (number) {
            case 1: 
                acc.withdraw();
                break;
            case 2: 
                acc.deposit();
                break;
            default:
                System.out.println("Invalid request");
                break;
        }
        acc.balance();

    }

    public void get_data()
    {
        System.out.println("Enter bank details ");
        System.out.println("Enter accounr holder name");
        name = s.next();
        System.out.println("Enter account number");
        account_no = s.nextDouble();
        
        
    }

    public void balance()
    {
        System.out.println("Your account balance is " + amount);
    }

    public void withdraw()
    {
        System.out.println("Enter amount for withdraw ");
        add_amount = s.nextDouble();
        if (amount<=0)
        {
            System.out.println("Add withdrawable balance in your account ");
        }else if (amount < add_amount)
        {
            System.out.println("Add withdrawable balance in your account");
        }
        else{
            amount =amount - add_amount;
        }
    }
    public void deposit()
    {
        System.out.println("Enter amount for deposit ");
        add_amount = s.nextDouble();
        amount = amount + add_amount;
    }
}
