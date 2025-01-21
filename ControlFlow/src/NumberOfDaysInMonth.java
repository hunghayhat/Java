public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) return false;
        else if (year % 4 == 0){
            return year % 100 != 0 || year % 400 == 0;
        }
        else return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;
        else {
            int daysInMonth = switch (month) {
                case 1 -> 31;
                case 2 -> {
                    if (isLeapYear(year)) yield 29;
                    else yield 28;
                }
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
            };
            return daysInMonth;
        }
    }

    public static void main(String[] args) {
       System.out.print(getDaysInMonth(2, 2567));
    }
}