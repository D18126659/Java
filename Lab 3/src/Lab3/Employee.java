package Lab3;
public class Employee {
    String firstName;
    String surName;
    int staffNumbers;
    double annualSalary=0;

    public Employee(String First,String Second, int Staff, double Annual)
    {
    this.firstName=First;
    this.annualSalary=Annual;
    this.staffNumbers=Staff;
    this.surName=Second;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStaffNumbers() {
        return staffNumbers;
    }

    public String getSurName() {
        return surName;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStaffNumbers(int staffNumbers) {
        this.staffNumbers = staffNumbers;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public double calculatepay()
    {
        return this.annualSalary  / 12;

    }
        public String toString()
        {
            super.toString();
            return "Employee First Name: " + getFirstName() +"\nEmployee Second Name: " + getSurName() +
                    "\nEmployee Staff number: " + getStaffNumbers() + "\nEmployee Annual Salary: " + getAnnualSalary();
        }
}
