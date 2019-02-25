// 02/03/2019
// Jesse E Rodarte
// CS111B
// Assignment 7: OOP Number Guesser

public class NumberGuesser {
    private int lowerBound;
    private int startingLowerBound;
    private int upperBound;
    private int startingUpperBound;
    private int currentGuess;

    public NumberGuesser(int lower, int upper) {
        lowerBound = lower;
        startingLowerBound = lower;
        upperBound = upper;
        startingUpperBound = upper;
        currentGuess = ((lower + upper) / 2);
    }

    public NumberGuesser() {
        lowerBound = 1;
        startingLowerBound = 1;
        upperBound = 100;
        startingUpperBound = 100;
        currentGuess = 50;
    }

    public void higher() {
        lowerBound = getCurrentGuess();
        if (lowerBound == 99)
            lowerBound++;
        currentGuess = ((lowerBound + upperBound) / 2);
    }

    public void lower() {
        upperBound = getCurrentGuess();
        currentGuess = ((lowerBound + upperBound) / 2);
    }

    public int getCurrentGuess() {
        return currentGuess;
    }

    public void reset() {
        lowerBound = startingLowerBound;
        upperBound = startingUpperBound;
        currentGuess = ((lowerBound + upperBound) / 2);
    }
}
