public class Main {

    public static void main(String[] args) {
        // return statement needs to be stored into new variable
//        int newScore = calculateScore("Noah", 500);
//        System.out.println("New score is: " + newScore);
//        calculateScore(75);
//        calculateScore();

        System.out.println("Centimeters: " + calcFeetAndInchesToCentimeters(5,7));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters;

        if(feet < 0) {
            System.out.println("Incorrect Feet.");
            return -1;
        }

        if(inches < 0 || inches > 12) {
            System.out.println("Incorrect inches.");
            return -1;
        }
        double convertToInches = feet * 12 + inches;

        centimeters = convertToInches * 2.54;

        return centimeters;
    }
}