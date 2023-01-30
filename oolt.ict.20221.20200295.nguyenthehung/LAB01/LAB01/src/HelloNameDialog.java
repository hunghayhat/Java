//2.2.3 Write, compile the first input dialog Java application
//Nguyễn Thế Hưng - 20200295

import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name: ");
		JOptionPane.showMessageDialog(null, "Hi "+ result +"!");
		System.exit(0);
	}
}
