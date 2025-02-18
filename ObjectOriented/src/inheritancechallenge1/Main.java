package inheritancechallenge1;

public class Main {
    public static void main(String[] args) {
        Employee hung = new Employee("Hung", "01/07/2002", "03/03/2024");
        System.out.println(hung);
        System.out.print("_ _ _ _ _ _");

        HourlyEmployee hung1 = new HourlyEmployee("Hung", "07/08/2002", "01/06/2024", 50);
        System.out.print(hung1);
    }
}
