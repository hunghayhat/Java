public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 15; i < 1000 && count < 5; i++) {
            if (i % 15 == 0) {
                count ++;
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
