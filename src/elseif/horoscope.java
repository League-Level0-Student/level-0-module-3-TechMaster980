package elseif;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String starSign = JOptionPane.showInputDialog("what is your star sign");
		if(starSign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "The man who carries the pitcher of water is the symbol for this sign. This is because Aquarians are often generous with their time and resources. For this reason this sign often find themselves in occupations where they are helping on some humanitarian level. They are interested and have a deep concern for the welfare of others. They never know a stranger and are generally loved by all around them. Aquarians never meet a stranger and often will go out of their way to meet with people that they’ve not heard from for years. Connection is at the core of this sign.");
	}
		if(starSign.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone. Gemini are never happier than when they are sharing ideas and concepts with someone else. Communication is a key element for this sign, so many of this sign go into occupations that include some communication in some large capacity. Curiosity is a key characteristic of this sign, and they are people persons. Gemini are great at parties because they can find almost anything to talk about with anyone. Gemini are adventurous by nature and so engage in traveling as often as they can as it affords them the opportunity to meet new people, experience new ideas, and to learn new concepts.");
		}
		if(starSign.equals("leo")) {
			JOptionPane.showMessageDialog(null,"Leo signs tend to like relaxation, preferably someplace warm and comfortable. Leo likes the big picture, not the small details and fine print. Things that are too complicated, involved, or boring, they have no patience for. They are natural leaders and don’t often do well in situations where they have to take orders from others.");
		}
		if(starSign.equals("cancer")) {
			JOptionPane.showMessageDialog(null,"The crab symbolizes this sign for good reason. Just as the crab carries its own shell on its back, so too, does the typical cancerian…so to speak. The typical cancer person is all about home and family and is very dedicated and loyal to friends and family. Crabs often move sideways instead of moving in a straight line, and so will the person of this sign. Often, if it will avoid a fight, or achieve the goal, then moving in alternative directions to arrive at the destination is typical. They tend to grasp and hold tightly those things that make them happy, and never let go. The key characteristic of this sign is that Cancer people need to be needed. They need to know that they matter to someone and that they are secure in that love. Brave, courageous, protective, all describe the best possible traits of this sign. Shy, reserved, brooding, and moody, do not serve the cancer person well, but may surface if their needs are not being met");
		}
		else{
			JOptionPane.showMessageDialog(null, "that not a star sign!");
		}
				
			

	}

}
