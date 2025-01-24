public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int temp = bigCount * 5 + smallCount;
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        else if (temp < goal) return false;
        else if (temp == goal) return true;
        else {
            for (int i = bigCount; i > 0; i--) {
                temp -= 5;
                if (temp == goal) return true;
                else if (temp > goal) continue;
                else break;
            }

            for (int j = smallCount; j > 0; j --) {
                temp -= 1;
                if (temp == goal) return true;
                else if (temp > goal) continue;
                else break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(canPack(1,2,12));
    }
}