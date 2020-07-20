package cis401_team1;
import javax.swing.*;

public class ClientDriver {
	
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		JPanel loginPanel = new Login(new Client()).getPanel();
		mainFrame.add(loginPanel);
		mainFrame.setTitle("Generic Messenger System");
		mainFrame.setSize(400, 400);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}




