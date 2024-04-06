package Bank;

public class CheckingAccount extends BankAccount
{
    int fee;

    CheckingAccount(int accountno, int totalbalance, int fee) 
    {
        super(accountno, totalbalance);
        this.fee = fee;      
    }

    void deductfee()
    {
        fee = totalbalance - ((totalbalance*8)/100);
    	System.out.println("Totalbalance after fee deduction="+ fee);
    }
    
    void displaycheckindetails()
    {
        super.displaydetails();
    }
}
