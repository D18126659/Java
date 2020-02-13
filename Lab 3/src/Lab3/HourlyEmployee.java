package Lab3;
class HourlyEmployee extends Employee {

    double HoursWorked;
    double HourlyRate;

    public HourlyEmployee(String First, String Second, int Staff, double HoursWorked, double HourlyRate) {
        super(First, Second, Staff, 0);

        this.HourlyRate=HourlyRate;
        this.HoursWorked=HoursWorked;
    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }
    public double calculatepay()
    {
        return this.getHourlyRate() * this.getHoursWorked();
    }
    public String toString()
    {
        return super.toString()+ "\nEmployees hours worked: " +getHoursWorked()+ "\nEmployees Hourly Rate: " + getHourlyRate();
    }
}
