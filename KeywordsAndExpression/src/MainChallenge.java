public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        System.out.print("Your final score is: " +
                caculateScore(gameOver, score, bonus, levelCompleted));
    }

    public static int caculateScore(boolean gameOver, int score, int bonus, int leverCompleted) {
        int finalScore = score;
        if (gameOver) {
            finalScore += leverCompleted * bonus;
            finalScore += 1000;
        }
        return finalScore;
    }
}
