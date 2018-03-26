public class Main {
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true, 10000, 8,200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // void keyword means don't return anything
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
