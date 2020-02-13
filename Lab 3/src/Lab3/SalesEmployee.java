package Lab3;

class SalesEmployee extends Employee {
    double commissionEarned;

    public SalesEmployee(String First, String Second, int Staff, double Annual, double Commission) {
        super(First, Second, Staff, Annual);

        this.commissionEarned=Commission;
    }

    public double getCommissionEarned() {
        return commissionEarned;
    }

    public void setCommissionEarned(double commissionEarned) {
        this.commissionEarned = commissionEarned;
    }
    public double calculatepay( )
    {
        return this.getAnnualSalary() * this.getCommissionEarned() / 12;
    }

    public String toString(){

        return super.toString()+ "\nCommission Rate:" + getCommissionEarned();
    }
}
