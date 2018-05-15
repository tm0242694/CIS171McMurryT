/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author tmcmurry
 */

@SuppressWarnings("serial")
public class GameText extends JScrollPane{
    private final static JTextArea JTA = new JTextArea(0, 20);
	
	/* Default constructor calls overloaded constructor */
	public GameText()
	{
		this(JTA);
	}
	
	/* Get an object back with JTextArea as its view port */
	public GameText(JTextArea jta)
	{
		super(jta);
	}
    
}
