package inheritancechallenge1;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        terminate("12/12/2024");
        isRetired = true;
    }
    @Override
    public double collectPay() {
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired) ? annualSalary * 0.9 : annualSalary;
        return (int) adjustedPay;
    }

}
