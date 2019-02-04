import java.util.Random;

// 02/03/2019
// Jesse E Rodarte
// CS111B
// Assignment 7: OOP Number Guesser

public class GuessingProgram {
    public static void main(String[] args) {
        testGuess();
    }

    public static void testGuess() {
        final int GAME_COUNT = 20000;
        final int MIN = 1;
        final int MAX = 100;


        Random random = new Random();
        NumberGuesser guesser = new NumberGuesser(MIN, MAX);
        int totalGuessCount = 0;

        // Make the guesser look for a random number, GAME_COUNT times
        for (int i = 0; i < GAME_COUNT; i++) {
            // There is always the initial guess
            int guessCount = 1;
            // Generate a random value to look for, from MIN to MAX, inclusive.
            int targetValue = MIN + random.nextInt(MAX - MIN + 1);
            // Keep looping until the guesser gets it right
            while (targetValue != guesser.getCurrentGuess()) {
                // Adjust the guesser, as needed...
                if (targetValue > guesser.getCurrentGuess()) {
                    guesser.higher();
                } else {
                    guesser.lower();
                }
                // That's one more guess, bump up the count
                guessCount++;
                System.out.println("target/guess:  " + targetValue + " " + guesser.getCurrentGuess());
            }
            System.out.println("Hah! I got it!");
            // Keep track of the total number of guesses in all the simulated games
            totalGuessCount += guessCount;
            // Return the guesser is in its initial state
            guesser.reset();
        }
        // Calculate and display the average
        double averageGuessCount = totalGuessCount / (double) GAME_COUNT;
        System.out.println("Average number of guesses: " + averageGuessCount);
    }
}
