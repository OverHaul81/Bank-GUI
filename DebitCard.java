/**
 * Write a description of class Debit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int PIN_NUMBER;
    private int WITHDRAWAL_AMOUNT;
    private String WITHDRAWAL_DATE;
    private boolean HAS_WITHDRAWN;
    public DebitCard(int Pin_Number,int Balance_Amount,
    String Bank_Account,String Issuer_Bank,int Card_ID,
    String Client_Name)
    {
        super(Card_ID, Issuer_Bank, Bank_Account, Balance_Amount);
        super.setCLIENT_NAME(Client_Name);
        this.PIN_NUMBER= Pin_Number;
        this.HAS_WITHDRAWN=false;
    }
    public int getPin()
    {
        return this.PIN_NUMBER;
    }
    
    public int getWithdrawalAmount()
    {
        return this.WITHDRAWAL_AMOUNT;
    }
    
    public String getDate()
    {
        return this.WITHDRAWAL_DATE;
    }
    
    public boolean getWithdrawn()
    {
        return this.HAS_WITHDRAWN;
    }
    
    public void setWithdrawal_Amount(int withdrawal_amount)
    {
        this.WITHDRAWAL_AMOUNT = withdrawal_amount;
    }
    
    public void setPin_Number(int pin_number)
    {
        this.PIN_NUMBER= pin_number;
    }
    
     public void Withdraw(int Withdrawal_Amount, String
        Withdrawal_Date, int Pin_Number)
        {
            if (this.PIN_NUMBER==Pin_Number && WITHDRAWAL_AMOUNT <= super.getAmount())
        {
         setWithdrawal_Amount(Withdrawal_Amount);
            super.setBALANCE_AMOUNT(super.getAmount()-this.WITHDRAWAL_AMOUNT);
          this.HAS_WITHDRAWN=true;
        }
        else
        {
   
         System.out.println("Something went wrong. Please try again");        
       
        }
    }
    
    public void Display()
    {super.Display();
        if (this.HAS_WITHDRAWN==true)
    {
        System.out.println("Pin number is:" + this.PIN_NUMBER);
        System.out.println("Withdrawl amount is:" + this.WITHDRAWAL_AMOUNT);
        System.out.println("Withdrawl date is:" + this.WITHDRAWAL_DATE);
        
        }
        else
        {System.out.println("The Balance is sufficient: " + super.getAmount());
    }
}
}
