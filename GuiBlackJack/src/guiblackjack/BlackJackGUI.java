/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiblackjack;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author tmcmurry
 */

@SuppressWarnings("serial")
public class BlackJackGUI extends JFrame{
  private GameText gameText;
	private VisualDisplay visualDisplay;
	private ButtonPanel buttonPanel;  
}
public BlackJackGUI()
	{
		// Make new game button in File... like other windows app the dropdown
	// spinner like thing in Android
	// save new game button for later, most likely won't be a button
	// refer to notes: using JMenu, JMenuBar, JMenuItem
	
	private GameText gameText;
	private VisualDisplay visualDisplay;
	private ButtonPanel buttonPanel;
	
	/* 
	 * When this class becomes instantiated the default
	 * constructor needs to initialize components that are necessary
	 * for this game to work.
	 */
	public BlackJackGUI()
	{
		this.setTitle("Jon's Awesome Casino!!");
		this.setSize(700, 640);
		this.setDefaultCloseOperation(BlackJackGUI.EXIT_ON_CLOSE);	
		
		// Create components for this game
		gameText = new GameText();
		buttonPanel = new ButtonPanel();
		visualDisplay = new VisualDisplay();
		
		// Add components to game
		this.add(this.gameText, BorderLayout.EAST);
		this.add(this.buttonPanel, BorderLayout.SOUTH);
		this.add(this.visualDisplay, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	}
