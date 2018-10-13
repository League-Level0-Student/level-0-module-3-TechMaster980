import javax.swing.JOptionPane;

public class checkpoint2module2 {
	public static void main(String[] args) {

		// 1. Ask the user how many cups of flour they have. If they have less than 2
		// cups, tell them to go to the store to buy more.

		String cup = JOptionPane.showInputDialog("how many cups of flour do you have");
		if (cup.equals("2")) {
			JOptionPane.showMessageDialog(null, "buy more flour!!!!!");
		}

		// 2. Now ask them how many people they are going to give cookies to. If they
		// are going to give cookies to more than 30 people, tell them they are going to
		// have tobake two batches of cookies!

		String people = JOptionPane.showInputDialog("how many people are you going to give cookies");
		int Ememe = Integer.parseInt(people);
		if (Ememe > 30) {
			JOptionPane.showMessageDialog(null, "you have to bake two batches of cookies!");

		}

		// 3. Finally, ask them how many batches of cookies they baked. If they baked 2
		// batches of cookies, tell them they are lucky to have so many friends.
		String batches = JOptionPane.showInputDialog("how many batches will you bake");
		if (batches.equals("2")) {
			JOptionPane.showMessageDialog(null, "you are lucky to have so many friends");
		}
	}

}
