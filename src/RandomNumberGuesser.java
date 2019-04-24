import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {
    private boolean guessed;

    protected RandomNumberGuesser() {
        lowerBound = 1;
        startingLowerBound = 1;
        upperBound = 100;
        startingUpperBound = 100;
        guessed = true;
        currentGuess = getCurrentGuess();
    }

    protected RandomNumberGuesser(int lower, int upper) {
        lowerBound = lower;
        startingLowerBound = lower;
        upperBound = upper;
        startingUpperBound = upper;
        guessed = true;
        currentGuess = getCurrentGuess();
    }

    public void higher() {
        lowerBound = currentGuess;
        if (lowerBound == (upperBound - 1))
            lowerBound++;
        guessed = true;
        currentGuess = getCurrentGuess();
    }

    public void lower() {
        upperBound = currentGuess - 1;
        guessed = true;
        currentGuess = getCurrentGuess();
    }

    public int getCurrentGuess() {
        if (guessed) {
            Random r = new Random();
            currentGuess = r.nextInt((upperBound - lowerBound) + 1) + lowerBound;
            guessed = false;
            return currentGuess;
        } else {
            return currentGuess;
        }
    }

    public void reset() {
        lowerBound = startingLowerBound;
        upperBound = startingUpperBound;
        guessed = true;
        currentGuess = getCurrentGuess();
    }


}
