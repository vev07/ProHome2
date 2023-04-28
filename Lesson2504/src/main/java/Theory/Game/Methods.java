package Theory.Game;

import java.util.Random;
import java.util.Scanner;

public class Methods {

    public static int howMuchPlayers(int numberOfCards, int cardsForPlayer) {
        Scanner sc = new Scanner(System.in);
        int players = 0;
        boolean isPlayer = false;
        while (!isPlayer) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players > 0 && cardsForPlayer * players <= numberOfCards) {
                    isPlayer = true;

                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        isPlayer = false;

                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                        isPlayer = false;
                    } else {
                        System.out.println("Too many players!");
                        isPlayer = false;
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }

        }
        return players;
    }
    public static String[] deckInitialization(String[]suits, String[]rank, int numberOfCards) {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < Deal.Rank.values().length; i++) {
            for (int j = 0; j < Deal.Suits.values().length; j++) {
                deck[Deal.Suits.values().length * i + j] = Deal.Rank.values()[i] + " " + Deal.Suits.values()[j];
            }
        }
        return deck;
    }
    public static void deckShuffling(int numberOfCards, String[] deck) {
        final Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
    public static void theShuffledDeckIsDisplayed(int players, int cardsForPlayer, String[] deck) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
