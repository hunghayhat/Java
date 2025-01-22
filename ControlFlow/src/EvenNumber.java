public class EvenNumber {
    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        int number = 5;
        int count = 0;
        int sum = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                count ++;
                sum += number;
        }
            number ++;
            if (count >= 5) break;
    }
        System.out.println("Sum of even numbers = " + sum);
}
}
