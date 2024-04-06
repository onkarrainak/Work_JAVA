package Bank;

public class SavingAccount extends BankAccount
{
    float interest;

    SavingAccount(int accountno, int totalbalance, float interest) {
        super(accountno, totalbalance);
        this.interest = interest;
    }

    void addinterest()
    {
        interest = totalbalance + ((totalbalance * 8)/100);
        System.out.println("Balance after adding interest"+ interest);
    }

    void displaySavingdetails()
    {
        super.displaydetails();
    }
    
}
