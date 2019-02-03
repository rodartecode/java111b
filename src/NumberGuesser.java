public class NumberGuesser {
    public static void main(String[] args)
    {
        do {
            playOneGame();
        } while (shouldPlayAgain());
    }

    public static void playOneGame()
    {
        int low = 0;
        int high = 100;
        int guess;
        System.out.println("Guess a number between 1 and 100.");
        guess = getMidpoint(low, high);
        
    }

    public static boolean shouldPlayAgain()
    {
        return true;
    }

    public char getUserResponseToGuess()
    {
        return 'h';
    }

    public static int getMidpoint(int low, int high)
    {
        return (high + low) / 2;
    }
}
