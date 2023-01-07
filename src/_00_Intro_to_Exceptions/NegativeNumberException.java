package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {

	public static void main(String[] args) {

		try {
			testPositive(0);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			scaryPopup();
		}
	finally {
		
		JOptionPane.showMessageDialog(null, "Your computer is okay.");
		
	}
	
	
	
	}

	static void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer.");

	}

	static void testPositive(int x) throws NegativeNumberException {

		if(x<0) {
			throw new NegativeNumberException();
			
		}
		
	}

}