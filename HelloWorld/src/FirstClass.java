public class FirstClass {
    public static void main(String[] args) {
       double a = 20.00;
       double b = 80d;
       double result = 100*b+a;
       boolean reminderOrNot = (result % 40d != 0d);
       System.out.println(reminderOrNot);
       String conclusion = reminderOrNot ? "got some remainder!" : "Don't have remainder";
        System.out.print(conclusion);
        System.out.print(conclusion);

    }
}
