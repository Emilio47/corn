package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer = JOptionPane.showInputDialog("Do you know how to code?");
if(answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You will rule the world");
} else {
	JOptionPane.showMessageDialog(null, "kill yourself then");
}
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

