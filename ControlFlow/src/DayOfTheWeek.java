public class DayOfTheWeek {
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> "Invalid Value";
        };
        System.out.print("Day " + day + " is stand for " + dayOfWeek);
    }

    public static void main(String[] args) {
        printDayOfWeek(5);
    }
}
