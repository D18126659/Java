package lab4;
public class CurrentAccount extends Account {

    private double penaltyAmount;

    public CurrentAccount(String AccountName, String SortCode,
                         boolean InCredit,
                          double acctBalance, double PenaltyAmount) {
        super(AccountName, SortCode, InCredit, acctBalance);

        this.penaltyAmount=PenaltyAmount;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public void withdraw(int acctBalance) {
        super.withdraw(acctBalance);
        if (acctBalance>=0)
        {
            System.out.println("Insufficent funds");
        }
    }
    public void checkCredit(int acctBalance){
        if (acctBalance>=0){
            System.out.println("Account Balance is below 0");
        }
        else{
            System.out.println("Money is above 0");
        }
    }
    public void checkCredit(String WarningMessage){

    }
}
