package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello world");
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Nice to meet you "+name);
	}
}
