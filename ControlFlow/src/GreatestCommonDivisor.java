public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        int greatest = 0;
        if (first < 10 || second < 10) return -1;
        else {
            int i = 1;
            while (i <= first && i <= second) {
                if (first % i == 0 && second % i == 0) {
                    greatest = i;
                    i ++;
                }
                else i++;
            }
            return greatest;
        }
    }
}