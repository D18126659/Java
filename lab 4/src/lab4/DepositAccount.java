package lab4;
public class DepositAccount extends Account {

    private double interestRate;

    public DepositAccount(String AccountName, String SortCode,
                          boolean InCredit,
                          double acctBalance,double InterestRate) {
        super(AccountName, SortCode,InCredit, acctBalance);

        this.interestRate=InterestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void withdraw(double takeout){
        System.out.println("You cannot withdraw from a deposit account!");
    }

}
