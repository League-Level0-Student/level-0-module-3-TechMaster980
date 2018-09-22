package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("are you happy");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing what your doing");
		}
		if (answer.equals("no")) {
			String answer1 = JOptionPane.showInputDialog("do you want to be happy?");
			if (answer1.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else {
				JOptionPane.showMessageDialog(null, "keep doing what your doing");
			}
		}
	}
}
