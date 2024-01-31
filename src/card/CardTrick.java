/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(/*insert call to random number generator here*/);
            c.setSuit(/*Card.SUITS[insert call to random number between 0-3 here]*/);
            magicHand[i]=c;
        }
        
        //Ask user for card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value(1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.print("Enter your card suit(Diomonds, Hearts, Spades, Clubs): ");
        String userSuit = scanner.next();
        
        //Create user card
        Card  userCard = new Card();
        userCard.setValue(userValue);
        userCard.setValue(userSuit);
        
        //Search magicHand for the users card 
        boolean found= false;
        for (Card card:magicHand ){
            if (card.equals(userCard)){
                found = true;
            }
        }  
        
        //Report the result
        if (found){
            System.out.println("Congratulations! your card is in Magic Hand!");   
        }else{
            System.out.println("Sorry, your card is not in MAGIC Hand ");
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
