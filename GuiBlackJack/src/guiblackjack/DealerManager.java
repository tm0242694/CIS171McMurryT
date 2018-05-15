/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import java.util.ListIterator;
import deck.Card;
import deck.CardHand;

public class DealerManager {
  private static Card temp = null;
	
	// Returns value of card dealt
	@SuppressWarnings("unused")
	private static Card dealCard(ListIterator<Card> deckIterator)
	{
		temp = deckIterator.next();
		//display card
		return temp;
	}
	
	private static boolean dealerTurn(ListIterator<Card> deckIterator,
									  CardHand dealerHand)
	{
		return false;
		// dealer logic
	}  
}
