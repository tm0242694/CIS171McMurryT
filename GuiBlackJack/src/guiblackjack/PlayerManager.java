/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import java.util.ListIterator;

public class PlayerManager {
    private static int bankroll;
	private static String choice;
	
	private static boolean playerTurn(ListIterator<Card> deckIterator,
									  CardHand playerHand)
	{
		// logic
		// need to access CardHand
	}
	
	private static int getBet(int bankroll)
	{
		int bet;
		// loop logic
		return bet;
	}
	
	private static boolean keepOnGoing(int bankroll)
	{
		if(bankroll == 0)
		{
			// end game
		}
		else
		{
			System.out.println("stuff");
			// ask if want to continue
		}
		return false;
	}
	
	private static void setBankroll(int bankroll) 
	{ 
		PlayerManager.bankroll = bankroll; 
	}
	
	private static int getBankroll() { return bankroll; }
    
}
