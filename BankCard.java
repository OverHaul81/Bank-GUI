
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    private int CARD_ID;
    private String CLIENT_NAME;
    private String ISSUER_BANK;
    private String BANK_ACCOUNT;
    private int BALANCE_AMOUNT;
    public BankCard(int Card_ID, String Issuer_Bank, 
    String Bank_Account, int Balance_Amount)
    {
       this.CARD_ID = Card_ID;
       this.CLIENT_NAME = "";
       this.ISSUER_BANK = Issuer_Bank;
       this.BANK_ACCOUNT = Bank_Account;
       this.BALANCE_AMOUNT = Balance_Amount;
    }
    public int getID()
    {
        return this.CARD_ID;
    }
    public String getName()
    {
        return this.CLIENT_NAME;
    }
    public String getBank()
    {
        return this.ISSUER_BANK;
    }
    public String getAccount()
    {
        return this.BANK_ACCOUNT;
    }
    public int getAmount()
    {
        return this.BALANCE_AMOUNT;
    }
    public void setCLIENT_NAME(String ClientName)
    {
      this.CLIENT_NAME = ClientName;  
    }
    public void setBALANCE_AMOUNT(int Amount)
    {
    this.BALANCE_AMOUNT = Amount;
    }
    public void Display()
    {
        System.out.println("The card id is: " + this.CARD_ID);
        System.out.println("The issuer bank is: " + this.ISSUER_BANK);
        System.out.println("The bank account is: " + this.BANK_ACCOUNT);
        System.out.println("The balance amount is: " + this.BALANCE_AMOUNT);
        if(this.CLIENT_NAME == "")
        {
            System.out.print("Client Name is empty");
        }
        else
        {
            System.out.println("The Client Name is " +this.CLIENT_NAME);
        }
    }
}

