public class FlourPacker {
    // write code here
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 1) return false;
        else {
            if (5 * bigCount + smallCount < goal) return false;
            else if (5 * bigCount + smallCount == goal) return true;
            else {
                for (int i = 0; i <= bigCount; i++) {
                    if (goal - 5 * i < 5|| i == bigCount) {
                        goal = goal - 5*i;
                        break;
                    }
                    else continue;
                }
                if (goal - smallCount <= 0) return true;
                else return false;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));

    }

}