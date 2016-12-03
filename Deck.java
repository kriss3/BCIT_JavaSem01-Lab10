import java.util.*;
/**
 * Class to model a deck of cards.

 * Lab 10 For Gary Tong
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Deck
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    
    public ArrayList<Card> deck = new ArrayList<Card>();

    public void loadDeck()
    {
        for(int i = 0; i < DESCRIPTIONS.length; i++)
        {
            for(int j = 0; j < SUITS.length; j++)
            {
                Card c = new Card();
                c.setSuit(SUITS[j]);
                c.setDescription(DESCRIPTIONS[i]);
                deck.add(c);
            }
        }
    }
    
    public void printDeck()
    {
        if(deck.size() == 0)
        {
            System.out.println("ERROR: Load Deck first !!!");
        }
        else
        {
            System.out.println("Elements in the ArrayList: " + deck.size());
            for(Card c : deck)
            {
                System.out.println(c.getDescription() + " of " + c.getSuit() + ".");
            }
        }
    }
    
    public void removeCard(int i)
    {
        if(i >= 0 && i < deck.size())
        {
            deck.remove(i);
        }
        else
        {
            System.out.println("Error: Index out of bound of Deck ArrayList.");
        }
    }
}
