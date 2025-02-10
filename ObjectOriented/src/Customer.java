public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName(String name) {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}


