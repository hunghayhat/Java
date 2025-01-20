/*
DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.



TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        double result = 1000*a - 1000*b;
        if (Math.abs(result) < 1) return true;
        else return false;
    }
}

/* Note: đối với những tình huống chạy phép tính với phạm vi 3 chữ số thập phân, khi tính toán rất có thể sẽ bị vượt quá phạm vi tính toán:
9.999999999998899E-4, có thể loại bỏ tình huống này bằng cách nhân thêm để loại bỏ phần thập phân
*/

