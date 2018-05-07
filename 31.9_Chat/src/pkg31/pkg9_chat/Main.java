/*
 * Ty McMurry
 * 31.9 Chat assigment
 * copyright May 2018
 */
package pkg31.pkg9_chat;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class Main extends JFrame {
private static final long serialVersionUID = 1L;
private JTextArea jta1 = new JTextArea();
private JTextArea jta2 = new JTextArea();
private PrintWriter toClient;

public ChatView() {
    setLayout(new GridLayout(2, 1, 5, 5));
    jta1.setWrapStyleWord(true);
    jta1.setWrapStyleWord(true);
      jta2.setLineWrap(true);
      jta2.setLineWrap(true); 
      jta2.setEditable(false);
      JScrollPane jsp1 = new JScrollPane(jta1);
      JScrollPane jsp2 = new JScrollPane(jta2);
      jsp1.setBorder(new TitledBorder("Client"));
      jsp2.setBorder(new TitledBorder("Server"));
      add(jsp2);
      add(jsp1);
    setTitle("Assigment 31.9");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800,500);
    SetLocationRelativeTo(null);
    setVisible(true);
    
    jta1.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                toClient.print(jta1.getText().split("\n")[jta1.getLineCount()
                toClient.flush(); 
            } catch (ArrayIndexOutOfBoundsException e2) {
            }
        }
        }
    )}
            
  try {
      @SuppressWarnings("resource")
      serverSocket serverSocket = new ServerSocket(8000);
      Socket socket = ServerSocket.accept();
      toClient = new PrintWriter(serverSocket.getOutputStream());
      new ReceiveMessage(socket);
  }cath (IOException e) {
    e.printStackTrace();
}
  )
class ReceiveMessage implements Runnable {
    private Socket socket;
    
public ReceiveMessage(Socket socket) {
    this.socket = socket;
    Thread thread = new Thread(this);
    thread.start();
}
public void run(){
    try {
        @SuppressWarnings("resource")
        Scanner fromClient = new Scanner(socket.getInputStream());
        While(true) {
        string text = fromClient.nextLine();
        jta2.append(text + "\n");
    }
    }
}
}  
}

    public static void main(String[] args) {
        
    }
    
}
