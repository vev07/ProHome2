package Theory.Game;
import java.util.Arrays;
import java.util.Scanner;

import static Theory.Game.Methods.*;

/*
Домашнее задание:
сделать рефактор кода, разнести логику в отдельные классы, enums, методы.
 */

public class Deal {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        final String[] suits = new String[Suits.values().length];
        final String[] rank = new String[Suits.values().length];
        final int numberOfCards = Suits.values().length * Rank.values().length; // number of cards
        String[] deck = new String[numberOfCards];
        int players = howMuchPlayers(numberOfCards,cardsForPlayer);
        deck = deckInitialization(suits,rank, numberOfCards);

        deckShuffling(numberOfCards,deck);
        theShuffledDeckIsDisplayed(players, cardsForPlayer, deck);
    }
    public enum Suits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    public enum Rank {
        TWO,
        TREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

}
