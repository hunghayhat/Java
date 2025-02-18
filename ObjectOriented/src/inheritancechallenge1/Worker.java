package inheritancechallenge1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDateObj = LocalDate.parse(this.birthDate, formatter);
        return Period.between(birthDateObj, LocalDate.now()).getYears();
    }

    public double collectPay() {
        return 1;
    }

    public void terminate (String endDate) {
        this.endDate = endDate;
        System.out.println(name + " is terminated in " + endDate);
    }
}
