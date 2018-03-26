public class Main {
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8,200);
        System.out.println("Your new final score is " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // void keyword means don't return anything
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
