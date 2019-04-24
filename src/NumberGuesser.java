// 02/03/2019
// Jesse E Rodarte
// CS111B
// Assignment 7: OOP Number Guesser

public class NumberGuesser {
    protected int lowerBound;
    protected int startingLowerBound;
    protected int upperBound;
    protected int startingUpperBound;
    protected int currentGuess;

    protected NumberGuesser(int lower, int upper) {
        lowerBound = lower;
        startingLowerBound = lower;
        upperBound = upper;
        startingUpperBound = upper;
        currentGuess = ((lower + upper) / 2);
    }

    protected NumberGuesser() {
        lowerBound = 1;
        startingLowerBound = 1;
        upperBound = 100;
        startingUpperBound = 100;
        currentGuess = 50;
    }

    protected void higher() {
        lowerBound = getCurrentGuess();
        if (lowerBound == 99)
            lowerBound++;
        currentGuess = ((lowerBound + upperBound) / 2);
    }

    protected void lower() {
        upperBound = getCurrentGuess();
        currentGuess = ((lowerBound + upperBound) / 2);
    }

    protected int getCurrentGuess() {
        return currentGuess;
    }

    protected void reset() {
        lowerBound = startingLowerBound;
        upperBound = startingUpperBound;
        currentGuess = ((lowerBound + upperBound) / 2);
    }
}
