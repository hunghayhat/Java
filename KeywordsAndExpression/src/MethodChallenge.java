public class MethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPositon) {
        System.out.print(playerName + " managed to get into position " + playerPositon + " on the high score list!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) position = 1;
        else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else return position;
            return position;
    }

    public static void main(String[] args) {
        String playerName;
        int playerPosition;
        int score;
        playerPosition = calculateHighScorePosition(25);
       displayHighScorePosition("Hung", playerPosition);

    }
}
