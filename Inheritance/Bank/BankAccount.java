package Bank;

import java.util.Scanner;

public class BankAccount {

    int accountno;
    int totalbalance;

    BankAccount(int accountno, int totalbalance)
    {
        this.accountno = accountno;
        this.totalbalance = totalbalance;
    }

    void displaydetails()
    {
        System.out.println("Accountno.="+ accountno);
	    System.out.println("Totalbalance="+ totalbalance);
    }

    void readdata()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Account No. " + accountno);
        accountno = s.nextInt();
        System.out.println("Enter the Amount details");
        totalbalance = s.nextInt();
    }


    public void deposit()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited " );
        int deposit = s.nextInt();
        totalbalance = totalbalance + deposit;
        System.out.println("*******-----*******");
        System.out.println("Total Balance is " + totalbalance);
        System.out.println("*******-----*******");
    }

    public void withdraw()
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the amount to be withdraw ");
    int withdraw =s.nextInt();
        System.out.println("*******-----*******");
        if (withdraw < totalbalance) 
        {
            totalbalance = totalbalance - withdraw;
            
            System.out.println("Remaining balance after withdraw= " + totalbalance);     
        }else
        {
            System.out.println("Insufficient funds");
        }
        System.out.println("*******-----*******");

    }

    public void getbalance()
    {
        System.out.println("*******-----*******");
        System.out.println("Your balance is " + totalbalance);
        System.out.println("*******-----*******");
    }

    void choices()
    {
        Scanner s = new Scanner(System.in);
        int choices = 0;
        System.out.println("**********************************");
        System.out.println("1= Deposite");
        System.out.println("2= Withdraw");
        System.out.println("3= Get your CurrentBalance");
        System.out.println("Enter your choices");
        choices = s.nextInt();
        System.out.println("**********************************");

        switch (choices) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                getbalance();
                break;
        
            default:
                System.out.println("wrong choice");
                break;
        }
    }




}