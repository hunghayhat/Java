public class TheForLoop {
    public static void calculateInteres (double amount) {
        float i = 7.5F;
        for (i = 7.5F; i <= 10; i += 0.25f) {
            System.out.println("Ammount of " + amount + " at " + i + " % is " + amount * (1+ i /100));
        }
    }

    public static void main(String[] args) {
        calculateInteres(5000);
    }
}
