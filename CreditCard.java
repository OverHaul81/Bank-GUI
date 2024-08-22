/**
 * Write a description of class Credit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
 private int CVC_NUMBER;
 private double CREDIT_LIMIT;
 private double INTEREST_RATE;
 private String EXPIRATION_DATE;
 private int GRACE_PERIOD;
 private boolean IS_GRANTED;
   public CreditCard(int CVC_Number,double Interest_Rate,
   String Expiration_Date,int Card_ID, String Client_Name,
   String Issuer_Bank, String Bank_Account, int Balance_Amount)
   {
       super(Card_ID, Issuer_Bank, Bank_Account,
       Balance_Amount);
       
       this.CVC_NUMBER= CVC_Number;
       this.INTEREST_RATE= Interest_Rate;
       this.EXPIRATION_DATE= Expiration_Date;
       this.IS_GRANTED= false;
   }
   
   public int getCVCNumber() 
   {
       return this.CVC_NUMBER;
   }
   
   public double getLimit()
   {
       return this.CREDIT_LIMIT;
   }
   
   public int getGracePeriod()
   {
       return this.GRACE_PERIOD;
   }
   
   public double getInterestRate()
   {
       return this.INTEREST_RATE;
   }
   
   public String getExpirationDate()
   {
       return this.EXPIRATION_DATE;
   }
   
   public boolean getIsGranted()
   {
       return this.IS_GRANTED;
   }
   
   public void setCredit_Limit(double Credit_Limit, int Grace_Period)
   {if (CREDIT_LIMIT <= (2.5* super.getAmount()))
       {
       this.CREDIT_LIMIT=Credit_Limit;
       this.GRACE_PERIOD=Grace_Period;
       this.IS_GRANTED = true;
       }
       else
       {
           System.out.println("Insufficent Balance. Thank you.");   
       }
    }
    
    public void Cancel_Credit_Card()
    {
        if (this.IS_GRANTED == true)
        {
            this.CVC_NUMBER=0;
            this.CREDIT_LIMIT=0;
            this.GRACE_PERIOD=0;
        }
        else{
            System.out.println("No Credit Issued");
        }
    }
    
    public void Display()
    {
        super.Display();
        System.out.println("The CVC Number is: " + this.CVC_NUMBER);
        System.out.println("The Interest Rate is: " + this.INTEREST_RATE);
        System.out.println("The Expiration Date is: " + this.EXPIRATION_DATE);
        System.out.println("The IsGranted status is: " + this.IS_GRANTED);
        
        if(IS_GRANTED == true)
        {
            System.out.println("The Credit Limit is: " + this.CREDIT_LIMIT);
            System.out.println("The Grace Period is: " + this.GRACE_PERIOD);
        }
    }
}
