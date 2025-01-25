import java.util.Scanner;

public class Main {
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("What's your name? ");
        // hàm đọc từ input, tuy nhiên không chạy bằng IntelliJ được mà phải chạy qua terminal
        System.out.println("Hello " + name);
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        return "";
    }

    public static void main(String[] args) {
        try {
            System.out.print(getInputFromConsole(2024));
        } catch (NullPointerException e) {
            System.out.print(e);
        }
    }
}
