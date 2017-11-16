
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	public static void main(String[] args) {

		// 0. Make a main method and put steps 1-5 inside it

		// 1. Set a password in a String variable
		String password = "6/22/17";
		// 2. Using a pop-up, ask the first person for a secret message and store it in
		// a variable
		String Secret = JOptionPane.showInputDialog(null, "whats your secret?");
		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret
		// message
		// if they can guess the passcode
		String password2 = JOptionPane.showInputDialog(null, "if you would like to know a secret, Guess the password");
		// 4. If their guess matches the password, show them the secret message
		if (password2.equals(password)) {
			JOptionPane.showMessageDialog(null, " theres a secret " + Secret);	
		}
		else {
		JOptionPane.showMessageDialog(null, "INTRUDER!!");	
		}
		
		

		// 5. If the password does not match, pop-up "INTRUDER!!"

		
	}
}