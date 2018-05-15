/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import java.awt.Dialog;
import java.util.ListIterator;
import deck.Card;
import deck.CardHand;
import gui.BlackJackGUI;
/**
 *
 * @author tmcmurry
 */
public class BlackJackDriver {
  // Handles beginning of the round
	private static void beginRound(ListIterator<Card> deckIterator,
								   CardHand playerHand,
								   CardHand dealerHand)
	{
		// logic
	}
	
	// Handles the end of the round
	private static void endRound(CardHand playerHand, CardHand dealerHand,
							     int bankroll, int bet)
	{
		if(playerHand.handValue() == dealerHand.handValue())
			// push
		else if(playerHand.handValue() > dealerHand.handValue())
			// player win
		else
			// player lose
			
		// print current bankroll
	}
	
	// Program driven from here
	public static void main(String[] args)
	{
		new BlackJackGUI();
	}  
}
