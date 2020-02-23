package lab4;
public class Account {

    String AccountName;
    String SortCode;
    int AccountNumber;
    boolean InCredit;
    double acctBalance;
    static int CurrentNumber = 0;

    public Account(String AccountName, String SortCode, boolean InCredit, double acctBalance) {

        this.AccountName = AccountName;
        this.SortCode = SortCode;
        this.InCredit = InCredit;
        this.acctBalance = acctBalance;
        AccountNumber=CurrentNumber++;

    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getSortCode() {
        return SortCode;
    }

    public boolean isInCredit() {
        return InCredit;
    }


    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public void setSortCode(String sortCode) {
        SortCode = sortCode;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public void setInCredit(boolean inCredit) {
        InCredit = inCredit;
    }

    public void depsosit(int acctBalance) {
        int deposit = 100;

        acctBalance = deposit + acctBalance;
    }

    public void withdraw(int acctBalance) {
        int withdraw = 0;

        acctBalance = withdraw - acctBalance;
    }

    public String toString() {
        super.toString();
        return "\nAccount Name: " + getAccountName() + "\nSort Code: " + getSortCode() + "\nAccount Number: "
                + getAccountNumber()+ "\ninCredit: " + isInCredit() + "\nAccount Balance: " + getAcctBalance();

    }

}