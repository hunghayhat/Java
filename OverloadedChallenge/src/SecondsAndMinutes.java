public class SecondsAndMinutes {
    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int remain_seconds = seconds % 60 ;
        return getDurationString(remain_seconds, minutes);
    }

    public static String getDurationString(int seconds, int minutes) {
        if (seconds < 0 || seconds > 59 || minutes < 0) return "Invalid time!";
        else {
            int hours = minutes / 60;
            int remain_minutes = minutes % 60;
            return hours + "h " + remain_minutes + "m " + seconds + "s";
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(98923));
        System.out.print(getDurationString(60, 123));

    }
}
