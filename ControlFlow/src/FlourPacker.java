public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int temp = bigCount * 5 + smallCount;
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        else if (temp < goal) return false;
        else if (temp == goal) return true;
        else {
            int maxBigCount = bigCount * 5;
            for (int i = bigCount; i > 0; i--) {
                if (maxBigCount == goal) return true;
                else if (maxBigCount > goal){
                    maxBigCount -= 5;
                    continue;
                }
                else break;
            }

            for (int j = 1; j <= smallCount; j ++) {
                maxBigCount ++;
                if (maxBigCount == goal) return true;
                else if (maxBigCount < goal) continue;
                else break;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print(canPack(2,10,19));
    }
}