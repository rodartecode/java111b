import java.util.Scanner;

public class PokerHands {
    public static void main(String[] args) {
        do {
            judgeHand();
        } while (shouldPlayAgain());
    }

    public static void judgeHand() {
        int[] hand;
        hand = getHand();

        if (containsFourOfaKind(hand)) {
            System.out.println("Four of a kind!");
        }
        else if (containsFullHouse(hand)) {
            System.out.println("Full house!");
        }
        else if (containsStraight()) {
            System.out.println("A straight!");
        }
        else if (containsThreeOfaKind(hand)) {
            System.out.println("Three of a kind!");
        }
        else if (containsTwoPair(hand)) {
            System.out.println("Two pair!");
        }
        else if (containsPair(hand)) {
            System.out.println("A Pair!");
        }
        else {
            System.out.println("High card!");
        }
    }

    public static int[] getHand() {
        int[] hand = new int[5];
        int card;
        for (int i = 0; i < 5; i++) {
            System.out.print("");
            card = getCard();
        }
        return hand;
    }

    public static int getCard() {

        return 2;
    }

    public static boolean shouldPlayAgain() {
        char response;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to try another hand? (y/n): ");
        response = input.next().charAt(0);
        return (response == 'y');
    }

    public static boolean containsFourOfaKind(int[] hand) {
        boolean result = false;
        return result;
    }

    public static boolean containsFullHouse(int[] hand) {
        boolean result = false;
        return result;
    }

    public static boolean containsStraight(int[] hand) {
        boolean result = false;
        return result;
    }

    public static boolean containsThreeOfaKind(int[] hand) {
        boolean result = false;
        return result;
    }

    public static boolean containsTwoPair(int[] hand) {
        boolean result = false;
        return result;
    }

    public static boolean containsPair(int[] hand) {
        boolean result = false;
        return result;
    }
}
