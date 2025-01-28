public class Account {
    private String number;
    private double balance;
    private String customerName;

    public void deposit (double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + ". New balance is: " + this.balance);
    }

    public void withdraw (double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficent funds! You only have $" + balance + " in your account!");
        }
        else {
            System.out.println("Withdraw of $"+ withdrawAmount + ". Remaining balance is: " + this.balance);
        }
    }
    private long phoneNumber;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
