package Bank;

import java.util.Scanner;

import javafx.scene.chart.StackedAreaChart;

public class TestBankaccount {
    
    static void BankAccount()
    {
        BankAccount bank = new BankAccount(1001,5000);
        bank.displaydetails();
        bank.choices();
    }

    static void SavingAccount()
    {
        SavingAccount saving = new SavingAccount(1001, 10000, 500);
        saving.displaySavingdetails();
        saving.addinterest();
    }

    static void CheckingAccount()
    {
        CheckingAccount check = new CheckingAccount(1001, 5000, 100);
        check.displaycheckindetails();
        check.deductfee();
    }

    public static void main(String[] args) {
        
        int choice = 0;
        Scanner s = new Scanner(System.in);
        while (true) 
        {
            System.out.println("***********************");
            System.out.println("Enter your choices:");
            System.out.println("1: Make Transactions");
            System.out.println("2: Checking Saving Account details");
            System.out.println("3: Checking Checking Accoung details");
            System.out.println("4: exit");
            choice = s.nextInt();
            System.out.println("***********************");

            switch (choice) {
                case 1:
                    BankAccount();                    
                    break;
                case 2:
                    SavingAccount();                  
                    break;
                case 3:
                    CheckingAccount();                    
                    break;
                case 4:
                    System.exit(0);                    
                    break;
            
                default:
                    System.out.println("wrong choice");
                    break;
            }
        }
    }
    
}
