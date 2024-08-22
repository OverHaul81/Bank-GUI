import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BankCardGUI implements ActionListener
{
    private JFrame obj;
    private JPanel pobj;
    private JLabel DebitCard;
    private JLabel CardIdDC;    
    private JTextField CardIdDCTF;
    private JLabel ClientNameDC;
    private JTextField ClientNameDCTF;
    private JLabel IssuerBankDC;
    private JTextField IssuerBankDCTF;
    private JLabel BankAccountDC;
    private JTextField BankAccountDCTF;
    private JLabel BalanceAmountDC;
    private JTextField BalanceAmountDCTF;
    private JLabel PinNumber;
    private JTextField PinNumberTF;
    private JButton AddDebitCard;
    private JButton DisplayButtonDC;
    private JButton WithdrawButton;
    private JButton ClearButtonDC;
    private JLabel WithdrawalAmount;
    private JTextField WithdrawalAmountTF;
    private JLabel DateOfWithdarwal;
    private JComboBox YearsDC;
    private JComboBox MonthsDC;
    private JComboBox DaysDC;
    private JPanel pobj2;
    private JLabel CreditCard;
    private JLabel CardIdCC;
    private JTextField CardIdCCTF;
    private JLabel ClientNameCC;
    private JTextField ClientNameCCTF;
    private JLabel IssuerBankCC;
    private JTextField IssuerBankCCTF;
    private JLabel BalanceAmountCC;
    private JTextField BalanceAmountCCTF;
    private JLabel CVCNumber;
    private JTextField CVCNumberTF;
    private JLabel CreditLimit;
    private JTextField CreditLimitTF;
    private JLabel GracePeriod;
    private JTextField GracePeriodTF;
    private JLabel ExpirationDate;
    private JComboBox YearsCC;
    private JComboBox MonthsCC;
    private JComboBox DaysCC;
    private JButton DisplayButtonCC;
    private JButton ClearCreditCC;
    private JButton AddCreditCard;
    private JButton WithdrawButtonCC;
    private JButton SetCreditLimit;
    private JButton CancelCreditCard;
    private JLabel BankAccountCC;
    private JTextField BankAccountCCTF;
    private JLabel InterestRate;
    private JTextField InterestRateTF;
    
    ArrayList<BankCard> arraylist = new ArrayList<BankCard>();
    
public void actionPerformed(ActionEvent AE)
{
  //Add Button
  if(AE.getSource()== AddDebitCard)
    {
            //logic of add for debit card
        int PNTF = Integer.valueOf(PinNumberTF.getText()); 
        int BADCTF = Integer.valueOf(BalanceAmountDCTF.getText());
        int CIDDCTF = Integer.valueOf(CardIdDCTF.getText());
       // int DC = Integer.valueOf(WithdrawalAmountTF.getText());
        String BAcDCTF= BankAccountDCTF.getText();
        String IBDCTF = IssuerBankDCTF.getText();
        String CNDCTF = ClientNameDCTF.getText();
        
           
            boolean B1 = true;
           for (BankCard Bobj : arraylist)
            {
           
                if (Bobj instanceof DebitCard){
                   
                    DebitCard dobj = (DebitCard) Bobj;
                    if (Bobj.getID() == CIDDCTF )
                    {
           
                        B1= false;
                    }        
            }
            }
       
        if (B1 == true)
            {
             //int Pin_Number,int Balance_Amount,String Bank_Account,String Issuer_Bank,int Card_ID,String Client_Name
             DebitCard DebitObj1 = new DebitCard(PNTF, BADCTF, BAcDCTF, IBDCTF, CIDDCTF, CNDCTF);
             arraylist.add(DebitObj1);
             //for dialog message
             JOptionPane.showMessageDialog(pobj , "Successfully added");
            }
        else if (B1 ==  false)
            {
             JOptionPane.showMessageDialog(pobj , "The Debit Card with CardId : "+ CIDDCTF +" is alreadyadded ");
            }
        }
       
        //Credit Card
        else if (AE.getSource()== AddCreditCard){
            String CNCCTF = ClientNameCCTF.getText();
            String IBCCTF = IssuerBankCCTF.getText();
            String BAcCCTF = BankAccountCCTF.getText();
            int CIDCCTF = Integer.valueOf(CardIdCCTF.getText());
            int BACCTF = Integer.valueOf(BalanceAmountCCTF.getText());
            int CVCNTF = Integer.valueOf(CVCNumberTF.getText());
            double IRTF = Double.valueOf(InterestRateTF.getText());
            String YCC = YearsCC.getSelectedItem().toString();
            String MCC = MonthsCC.getSelectedItem().toString();
            String DCC = DaysCC.getSelectedItem().toString();
            String ED = YearsCC+""+MonthsCC+""+DaysCC;
            
            boolean B2  = false;
           
            for (BankCard Cobj : arraylist)
            {
                if (Cobj instanceof CreditCard){
                    CreditCard CreditC = (CreditCard) Cobj;
                    if (CreditC.getID() == CIDCCTF)
                    {
                            B2= true;
                    }        
            }
            }
       
            if (B2 == false)
            {
                //int CVC_Number,double Interest_Rate, String Expiration_Date,int Card_ID, String Client_Name, String Issuer_Bank, String Bank_Account, int Balance_Amount
                CreditCard obj_credit = new CreditCard(CVCNTF, IRTF, ED, CIDCCTF, CNCCTF, IBCCTF, BAcCCTF, BACCTF);
                arraylist.add(obj_credit);
                //for dialog message
                JOptionPane.showMessageDialog(pobj2,"Successfully added");
            }
       
            else if (B2 ==  true)
            {
                JOptionPane.showMessageDialog(pobj2, "the creditcard with Crad_id : "+ CIDCCTF +" is added ");
            }
        }
       
        else if(AE.getSource()== WithdrawButton)
        {
            int CIDDCTF = Integer.valueOf(CardIdDCTF.getText());
            String YDC = YearsDC.getSelectedItem().toString();
            String MDC = MonthsDC.getSelectedItem().toString();
            String DDC = DaysDC.getSelectedItem().toString();
            String DOW =DDC+ "" +MDC+","+YDC;
            int PNTF = Integer.valueOf(PinNumberTF.getText());
            int WATF = Integer.valueOf(WithdrawalAmountTF.getText());
           
        for (BankCard Dobj : arraylist)
            {
           
                if (Dobj instanceof BankCard){
                      DebitCard debit_obj= (DebitCard) Dobj;
                    if (Dobj.getID() == CIDDCTF)
                    {
                      //message dialog
                      JOptionPane.showMessageDialog(pobj, "The card id is : " + CIDDCTF +"\n"+"The withdrawl amount is: "+WATF+"\n"+"The pin number is: "+PNTF+"\n"+"The date of withdrawl: "+DOW);
                           
                    }
                    if(debit_obj.getPin() == PNTF)
                    {
                        if(WATF <= debit_obj.getAmount())
                        {
                            debit_obj.Withdraw(WATF, DOW, PNTF);
                            JOptionPane.showMessageDialog(pobj,"Successfully withdrawed");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(pobj, "The Withdraw was unsuccessful");
                        }
                       
                    }
                   
                    else
                    {
                        JOptionPane.showMessageDialog(pobj, "Incorrect Pin Number");
                    }
                }
            }  
            }
       
          else if (AE.getSource()== DisplayButtonDC)
          {
            int PNTF = Integer.valueOf(PinNumberTF.getText());
            int WATF = Integer.valueOf(WithdrawalAmountTF.getText());
            int BADCTF = Integer.valueOf(BalanceAmountDCTF.getText());
            int CIDDCTF = Integer.valueOf(CardIdDCTF.getText());
            String BAcDCTF = BankAccountDCTF.getText();
            String IBDCTF = IssuerBankDCTF.getText();
            String CNDCTF = ClientNameDCTF.getText();
            
            String YDC = YearsDC.getSelectedItem().toString();
            String MDC = MonthsDC.getSelectedItem().toString();
            String Day = DaysDC.getSelectedItem().toString();
            String WD = YDC + "" + MDC + " "+YDC; 
            System.out.println("The Pin Number is: " + PNTF);
            System.out.println("The Withdrawal Amount is: " + WATF);
            System.out.println("The Date of Withdrawal is: " + WD);
            System.out.println("The Card Id is: "+ CIDDCTF);
            System.out.println("The Bank Account is: "+ BAcDCTF);
            System.out.println("The Issuer Bank is: "+ IBDCTF);
            System.out.println("The Client Name is: "+ CNDCTF);
            System.out.println("The Balance Amount is: "+ BADCTF);
           
           
            //JOPtionPane
            JOptionPane.showMessageDialog(pobj,"The Pin Number is: " + PNTF+"\nThe Withdrawal Amount is: " + WATF+ "\nThe Date of withdrawal is: " + WD+
            "\nThe balance amount is: "+ BADCTF + "\nThe card id is: "+ CIDDCTF + "\nThe bank account is: "+ BAcDCTF+ "\nThe issuer bank is: "+ IBDCTF + "\nThe client name is: "+CNDCTF);
          }
         
          else if (AE.getSource()== DisplayButtonCC)
          {
            int CIDCCTF = Integer.valueOf(CardIdCCTF.getText());
            String CNCCTF = ClientNameCCTF.getText();
            String IBCCTF = IssuerBankCCTF.getText();
            String BAcCCTF = BankAccountCCTF.getText();
            int BACCTF = Integer.valueOf(BalanceAmountCCTF.getText());
            int CVCCCTF = Integer.valueOf(CVCNumberTF.getText());
            double IRTF = Double.valueOf(InterestRateTF.getText());
            double CLTF = Double.valueOf(CreditLimitTF.getText());
            int GPTF = Integer.valueOf(GracePeriodTF.getText());
           
            String YCC = YearsCC.getSelectedItem().toString();
            String MCC = MonthsCC.getSelectedItem().toString();
            String DCC = DaysCC.getSelectedItem().toString();
           
            String ED = YCC +""+ MCC +""+ ""+DCC;
           
            System.out.println("The Card Id is: " +CIDCCTF);
            System.out.println("The Client Name is: " +CNCCTF);
            System.out.println("The Issuer Bank is: " +IBCCTF);
            System.out.println("The Bank Account is: " +BAcCCTF);
            System.out.println("The Balance Amount is: " +BACCTF);
            System.out.println("The CVC Number is: " + CVCCCTF);
            System.out.println("The Interest Rate is: " +IRTF);
            System.out.println("The Credit Limit is: " +CLTF);
            System.out.println("The Grace Period is: " +GPTF);
            System.out.println("The Expiration Date is: " +ED);
           
            JOptionPane.showMessageDialog(pobj2, "The card id is: "+CIDCCTF+
            "\nThe client name is: " +CNCCTF+"\nThe issuer bank is: "+ IBCCTF +"\nThe namk account is: "+BAcCCTF+ "\nThe balance amount is: "+BACCTF+
            "\nThe CVC number is: "+CVCCCTF+ "\nThe interest rate is: "+IRTF+ "\nThe credit limit is: "+CLTF+ "\nThe grace periiod is: "+GPTF+ "\nThe expiration date is: "+ED); 
          }
          else if (AE.getSource()== ClearCreditCC){
             CardIdCCTF.setText("");
             ClientNameCCTF.setText("");
             IssuerBankCCTF.setText("");
             BankAccountCCTF.setText("");
             BalanceAmountCCTF.setText("");
             InterestRateTF.setText("");
             CVCNumberTF.setText("");
             CreditLimitTF.setText("");
             GracePeriodTF.setText("");
          }
          else if (AE.getSource()== ClearButtonDC){
              CardIdDCTF.setText("");
              ClientNameDCTF.setText("");
              IssuerBankDCTF.setText("");
              BankAccountDCTF.setText("");
              BalanceAmountDCTF.setText("");
              WithdrawalAmountTF.setText("");
              PinNumberTF.setText("");
            }
         //adding action listener for CANCEL CREDIT CARD  button
      else if (AE.getSource()==CancelCreditCard)
      {  {
            try
            {
                int CIDCCTF = Integer.valueOf(CardIdCCTF.getText());

                boolean B2 = false;
                for(BankCard Cobj : arraylist)
                {
                    if(Cobj instanceof CreditCard && Cobj.getID() == CIDCCTF)
                    {
                        B2 = true;
                        CreditCard credit_obj = (CreditCard) Cobj;

                        credit_obj.Cancel_Credit_Card();

                        JOptionPane.showMessageDialog(null, "Your Credit Card has been cancelled successfully.","Successfully cancelled.", JOptionPane.PLAIN_MESSAGE);
                    }
                }
                if(B2 == false)
                {
                    JOptionPane.showMessageDialog(null, "Card Id doesn't exist\n" + "Please enter correct Card Id","Incorrect Card Id", JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(Exception E)
            {
                JOptionPane.showMessageDialog(null, "Your Credit Card details are invalid!!!", "Invalid Credit Card details!!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
           
           else if (AE.getSource()== SetCreditLimit)
      {
          int BACCTF = Integer.valueOf(BalanceAmountCCTF.getText());
          int CIDCCTF = Integer.valueOf(CardIdCCTF.getText());
          String BAcCCTF = BankAccountCCTF.getText();
          String IBCCTF = IssuerBankCCTF.getText();
          String CNCCTF = ClientNameCCTF.getText();
          int CVCNTF = Integer.valueOf(CVCNumberTF.getText());
          String YCC = YearsCC.getSelectedItem().toString();
          String MCC = MonthsCC.getSelectedItem().toString();
          String DCC = DaysCC.getSelectedItem().toString();
          String ED = YCC + " " + MCC + " " + DCC;
          int GPTF = Integer.valueOf(GracePeriodTF.getText());
          int CLTF = Integer.valueOf(CreditLimitTF.getText());
          Double IRTF = Double.valueOf(InterestRateTF.getText());
          CreditCard Cobj = new CreditCard(CVCNTF, IRTF, ED, CIDCCTF, CNCCTF, IBCCTF, BAcCCTF, BACCTF);
          boolean cvC= false;
            for (BankCard cc : arraylist)
      {
        if(cc instanceof CreditCard)
        {
            CreditCard credit_card = (CreditCard)cc;
            if (cc.getID() == CIDCCTF)
            {  JOptionPane.showMessageDialog(pobj2, "The card id is : "+CIDCCTF+"\n"+
                "The garce period is : "+ GPTF + "\n" + "The credit limit is : "+ CLTF);
                if(CLTF<=2.5*(credit_card.getAmount()))
                {
                arraylist.add(Cobj);
                JOptionPane.showMessageDialog(pobj2, "Credit limit set for card with ID: " + CIDCCTF);
                credit_card.setCredit_Limit(CLTF,GPTF);
                return;
            }
            else{JOptionPane.showMessageDialog(pobj2,"Credit Limit cannot be set");}
        }else {JOptionPane.showMessageDialog(pobj2,"Enter valid Card ID");}
      }
     }
    }
}
public static void main(String [] args)
{
    BankCardGUI Direct = new BankCardGUI();
    Direct.GUi();
}
    public void GUi()
{
        //JFrame of BankCard
        obj = new JFrame();
        obj.setTitle("BankCard GUI");
        obj.setBounds(375, 50, 800,750);
        obj.setLayout(null);
       
        //JPanel of Debit Card
        pobj = new JPanel();
        pobj.setBounds(0, 0,800,375);
        pobj.setLayout(null);
        pobj.setBackground(Color.CYAN);
        
        //JLabel of Debit Card
        DebitCard = new JLabel();
        DebitCard.setText("DEBIT CARD");
        Font DCH = new Font("Arial", Font.BOLD , 18);
        DebitCard.setFont(DCH);
        DebitCard.setBounds(325,0,150,80);
        pobj.add(DebitCard);
       
        //JLabel of Card Id
        CardIdDC = new JLabel();
        CardIdDC.setText("Card ID :");
        CardIdDC.setBounds(80,80,75,30);
        pobj.add(CardIdDC);
        
        //JTextField of Card Id
        CardIdDCTF = new JTextField();
        CardIdDCTF.setBounds(160,85,155,20);
        pobj.add(CardIdDCTF);
       
        //JLabel of Client Name 
        ClientNameDC= new JLabel();
        ClientNameDC.setText("Client Name:");
        ClientNameDC.setBounds(80,120,75,30);
        pobj.add(ClientNameDC);
        
        //JTextField of Client Name
        ClientNameDCTF = new JTextField();
        ClientNameDCTF.setBounds(160,125,155,20);
        pobj.add(ClientNameDCTF);
       
        //JLabel of Issuer Bank
        IssuerBankDC = new JLabel();
        IssuerBankDC.setText("Issuer Bank:");
        IssuerBankDC.setBounds(80,160,75,30);
        pobj.add(IssuerBankDC);
       
        //JTextField of Issuer Bank
        IssuerBankDCTF = new JTextField();
        IssuerBankDCTF.setBounds(160,165,155,20);
        pobj.add(IssuerBankDCTF);
       
        //JLabel of Bank Account
        BankAccountDC = new JLabel();
        BankAccountDC.setText("Bank Account:");
        BankAccountDC.setBounds(400,80,100,30);
        pobj.add(BankAccountDC);
       
        //JTextField of Bank Account
        BankAccountDCTF = new JTextField();
        BankAccountDCTF.setBounds(530,85,155,20);
        pobj.add(BankAccountDCTF);
       
        //JLabel of Balance Amount
        BalanceAmountDC = new JLabel();
        BalanceAmountDC.setText("Balance Amount:");
        BalanceAmountDC.setBounds(400,120,140,30);
        pobj.add(BalanceAmountDC);
       
        //JTextField of Balance Amount
        BalanceAmountDCTF = new JTextField();
        BalanceAmountDCTF.setBounds(530,125,155,20);
        pobj.add(BalanceAmountDCTF);
       
        //JLabel of Pin Number
        PinNumber = new JLabel();
        PinNumber.setText("Pin Number:");
        PinNumber.setBounds(400,160,100,30);
        pobj.add(PinNumber);
       
        //JTextField of Pin Number
        PinNumberTF = new JTextField();
        PinNumberTF.setBounds(530,165,155,20);
        pobj.add(PinNumberTF);
    
        //JButton of Add Debit Card
        AddDebitCard = new JButton();
        AddDebitCard.setText(" Add Debit Card");
        AddDebitCard.setBounds(225, 200, 150, 20);
        AddDebitCard.addActionListener(this);
        pobj.add(AddDebitCard);
        
        //JButton of Display
        DisplayButtonDC = new JButton();
        DisplayButtonDC.setText("Display");
        DisplayButtonDC.setBounds(400, 200,90, 20);
        DisplayButtonDC.addActionListener(this);
        pobj.add(DisplayButtonDC);
        
        //JButton of Withdraw
        WithdrawButton = new JButton();
        WithdrawButton.setText("Withdraw");
        WithdrawButton.setBounds(260, 250,90, 20);
        WithdrawButton.addActionListener(this);
        pobj.add(WithdrawButton);
        
        //JButton of Clear
        ClearButtonDC = new JButton();
        ClearButtonDC.setText("Clear");
        ClearButtonDC.setBounds(405, 250, 80, 20);
        ClearButtonDC.addActionListener(this);
        pobj.add(ClearButtonDC);
       
        //JLabel of Withdrawal Amount
        WithdrawalAmount = new JLabel();
        WithdrawalAmount.setText("Withdrawal Amount:");
        WithdrawalAmount.setBounds(250,285,170,30);
        pobj.add(WithdrawalAmount);
        
        //JTextField of Withdrawal Amount
        WithdrawalAmountTF = new JTextField();
        WithdrawalAmountTF.setBounds(370,290,140,20);
        pobj.add(WithdrawalAmountTF);
        
        //JLabel of Date of Withdarawal
        DateOfWithdarwal = new JLabel();
        DateOfWithdarwal.setText("Date of Withdrawal:");
        DateOfWithdarwal.setBounds(170,325,290,30);
        pobj.add(DateOfWithdarwal);
       
        //JComboBox of Years
        String YearsVDC[] = {"2023","2024","2025","2026","2027","2028","2029",
            "2030","2031","2032","2033"};
        YearsDC = new JComboBox(YearsVDC);
        YearsDC.setBounds (295,325,70,25);
        pobj.add(YearsDC);
       
        //JComboBox of Months
        String MonthsVDC[] = {"January","February","March","April","May",
            "June","July","August","September","October","November",
            "December"};
        MonthsDC = new JComboBox(MonthsVDC);
        MonthsDC.setBounds (365,325,70,25);
        pobj.add(MonthsDC);
       
        //JComboBox of Days
         String DaysVDC[] = {"1","2","3","4","5","6","7","8","9","10","11",
             "12","13","14","15","16","17","18","19","20","21","22", "23"
             , "24", "25", "26", "27", "28", "29","30"};
        DaysDC = new JComboBox(DaysVDC);
        DaysDC.setBounds (435,325,50,25);
        pobj.add(DaysDC);
       
        //JPanel of Credit Card
        pobj2 = new JPanel();
        pobj2.setBounds(0, 375,800,375);
        pobj2.setLayout(null);
        pobj2.setBackground(Color.ORANGE);
       
        //JLabel of Credit Card
        CreditCard = new JLabel();
        CreditCard.setText("CREDIT CARD");
        Font fc = new Font("Arial", Font.BOLD , 18);
        CreditCard.setFont(fc);
        CreditCard.setBounds(325,0,150,80);
        pobj2.add(CreditCard);
       
        //JLabel of Card ID
        CardIdCC = new JLabel();
        CardIdCC.setText("Card ID:");
        CardIdCC.setBounds(80,60,75,30);
        pobj2.add(CardIdCC);
       
        //JTextField of Card ID
        CardIdCCTF = new JTextField();
        CardIdCCTF.setBounds(160,65,155,20);
        pobj2.add(CardIdCCTF);
       
        //JLabel of Client Name
        ClientNameCC= new JLabel();
        ClientNameCC.setText("Client Name:");
        ClientNameCC.setBounds(80,100,75,30);
        pobj2.add(ClientNameCC);
       
        //JTextField of Client Name
        ClientNameCCTF = new JTextField();
        ClientNameCCTF.setBounds(160,105,155,20);
        pobj2.add(ClientNameCCTF);
       
        //JLabel of Issuer Bank
        IssuerBankCC = new JLabel();
        IssuerBankCC.setText("Issuer Bank:");
        IssuerBankCC.setBounds(80,140,75,30);
        pobj2.add(IssuerBankCC);
       
        //JTextField of Issuer Bank
        IssuerBankCCTF = new JTextField();
        IssuerBankCCTF.setBounds(160,145,155,20);
        pobj2.add(IssuerBankCCTF);
        
        //JLabel of CVC Number
        CVCNumber = new JLabel();
        CVCNumber.setText("CVC Number:");
        CVCNumber.setBounds(400,60,100,30);
        pobj2.add(CVCNumber);
       
        //JTextField of CVC Number
        CVCNumberTF = new JTextField();
        CVCNumberTF.setBounds(530,65,155,20);
        pobj2.add(CVCNumberTF);
       
        //JLabel of Balance Amount
        BalanceAmountCC = new JLabel();
        BalanceAmountCC.setText("Balance Amount:");
        BalanceAmountCC.setBounds(400,100,140,30);
        pobj2.add(BalanceAmountCC);
       
        //JTextField of Balance Account
        BalanceAmountCCTF = new JTextField();
        BalanceAmountCCTF.setBounds(530,105,155,20);
        pobj2.add(BalanceAmountCCTF);

        //JLabel of Credit Limit
        CreditLimit = new JLabel();
        CreditLimit.setText("Credit Limit:");
        CreditLimit.setBounds(400,140,100,30);
        pobj2.add(CreditLimit);
        
        //JTextField of Credit Limit
        CreditLimitTF = new JTextField();
        CreditLimitTF.setBounds(530,145,155,20);
        pobj2.add(CreditLimitTF);
       
        //JButton of Adding Credit Card
        AddCreditCard = new JButton();
        AddCreditCard.setText("Add Credit Card");
        AddCreditCard.setBounds(170, 180, 150, 20);
        AddCreditCard.addActionListener(this);
        pobj2.add(AddCreditCard);
        
        //JButton of Display Button
        DisplayButtonCC = new JButton();
        DisplayButtonCC.setText("Display");
        DisplayButtonCC.setBounds(330, 180,90, 20);
        DisplayButtonCC.addActionListener(this);
        pobj2.add(DisplayButtonCC);
        
        //JButton of Canceling Credit Card
        CancelCreditCard = new JButton();
        CancelCreditCard.setText("Cancel Credit Card");
        CancelCreditCard.setBounds(460, 180, 150, 20);
        CancelCreditCard.addActionListener(this);
        pobj2.add(CancelCreditCard);
       
        //JLabel of Expiration Date
        ExpirationDate = new JLabel();
        ExpirationDate .setText("Expiration Date:");
        ExpirationDate.setBounds(120,220,150,30);
        pobj2.add(ExpirationDate );
       
        String YearsVCC[] = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015",
        "2016","2017","2018","2019","2020","2021","2022","2023"};
       
        YearsCC = new JComboBox(YearsVCC);
        YearsCC.setBounds (230,220,70,25);
        pobj2.add(YearsCC);
       
        String MonthsVCC[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       
        MonthsCC = new JComboBox(MonthsVCC);
        MonthsCC.setBounds (300,220,70,25);
        pobj2.add(MonthsCC);
       
         String DaysVCC[] = {"1","2", "3", "4", "5", "6", "7", "8", "9",
        "10","11","12", "13", "14", "15", "16", "17", "18", "19","20",
        "21","22", "23", "24", "25", "26", "27", "28", "29","30"};
       
        DaysCC = new JComboBox(DaysVCC);
        DaysCC.setBounds (370,220,50,25);
        pobj2.add(DaysCC);
       
        //JButton of Clearing Credit
        ClearCreditCC = new JButton();
        ClearCreditCC.setText("Clear");
        ClearCreditCC.setBounds(470, 220,90, 20);
        ClearCreditCC.addActionListener(this);
        pobj2.add(ClearCreditCC);
       
        //JLabel of Bank Account
        BankAccountCC = new JLabel();
        BankAccountCC.setText("Bank Account:");
        BankAccountCC.setBounds(80,260,100,30);
        pobj2.add(BankAccountCC);        
        
        //JTextField of Bank Account
        BankAccountCCTF = new JTextField();
        BankAccountCCTF.setBounds(180,265,135,20);
        pobj2.add(BankAccountCCTF);
       
        //Jlabel of Interest Rate
        InterestRate = new JLabel();
        InterestRate .setText("Interest Rate :");
        InterestRate .setBounds(400,260,170,30);
        pobj2.add(InterestRate );
       
        //JTextField of Interest Rate
        InterestRateTF = new JTextField();
        InterestRateTF.setBounds(530,265,155,20);
        pobj2.add(InterestRateTF);

        //JButton of Setting Credit Limit
        SetCreditLimit = new JButton();
        SetCreditLimit.setText("Set The Credit Limit");
        SetCreditLimit.setBounds(180,300,180 , 20);
        SetCreditLimit.addActionListener(this);
        pobj2.add(SetCreditLimit);
       
        //JLabel of Grace Period
        GracePeriod = new JLabel();
        GracePeriod.setText("Grace Period:");
        GracePeriod.setBounds(400,300,170,30);
        pobj2.add(GracePeriod);
       
        //JTextField of Grace Period
        GracePeriodTF= new JTextField();
        GracePeriodTF.setBounds(530,305,155,20);
        pobj2.add(GracePeriodTF);obj.add(pobj);
        obj.add(pobj2);
        obj.setVisible(true);
}
}