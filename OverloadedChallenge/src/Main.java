public class Main {
    public static double convertToCentimeters (int inches) {
        return 2.54d * inches;
    }

    public static double convertToCentimeters (int foot, int inches) {
        int height_inches = 12 * foot + inches;
        return convertToCentimeters(height_inches);
    }

    public static void main(String[] args) {
        int height_ft = 6;
        System.out.println("6 ft 5 inches is " + convertToCentimeters(6, 5)+ " cm");
        System.out.print("12 inches height is " + convertToCentimeters(12)+ " cm  ");
    }
}
