/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import java.util.ArrayList;
import java.util.List;
import deck.Card;
import deck.CardHand;
/**
 *
 * @author tmcmurry
 */
public class CardHandManager {
  @SuppressWarnings("unused")
	private static CardHand cardHandFactory()
	{
		return new CardHand();
	}  
}
