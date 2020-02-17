public class GameOver {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int LevelCompleted = 5;
        int bonus = 100;

        calculateScore();

        if (gameOver) {
            int finalScore = score + (LevelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your score was: " + finalScore);
        }
    }

            public static void calculateScore () {
                boolean gameOver = true;
                int score = 5000;
                int LevelCompleted = 5;
                int bonus = 100;

                if (gameOver) {
                    int finalScore = score + (LevelCompleted * bonus);
                    finalScore += 1000;
                    System.out.println("Your score was: " + finalScore);

                }

            }

    }
