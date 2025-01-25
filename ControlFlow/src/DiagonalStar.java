public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == number) System.out.println("*");
                    else if (i == j || i == 1 || i == number || j == 1 || i == number + 1 - j) System.out.print("*");
                    else System.out.print(" ");

                }
            }
        }

    }

    public static void main(String[] args) {
        printSquareStar(5);
    }
}