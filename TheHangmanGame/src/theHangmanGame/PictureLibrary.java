package theHangmanGame;

//import hangMan.HangmanPics;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class PictureLibrary extends JFrame
{
	public Graphics getGraphics1()
	{ 															// create method to hold a JFrame containing the little fellow picture - AO
		JPanel GallowsStart = new JPanel(); 					// creates a new JPanel - AO
		PictureLibrary pic = new PictureLibrary();				// show the image - AO
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 	// Closes JFrame without ending program - AO
		pic.setSize(650, 700);									//Creates the size of the JFrame - AO
		
		final JLabel label1; 									// JLabel with text and Icon		
		Icon gallowsStart = new ImageIcon(getClass().getResource("GallowsStart.jpg"));	//Will display the witch picture - AO
		label1 = new JLabel(); 						
		label1.setText("You have six tries to keep the little fellow alive.");			//A method that set the text to display the statement. - AO
		label1.setIcon(gallowsStart); 							// add icon to JLabel - AO
		label1.setHorizontalTextPosition(SwingConstants.CENTER);						//Tells how to position the picture - AO
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		GallowsStart.add(label1);								// add label1 to JFrame	
		pic.add(GallowsStart);									//Adds the picture to the JFrame. - AO
		pic.setVisible(true);									//Makes the picture visible to the user. - AO
		return null;											//Doesn't return anything. - AO
	}
	/*public Graphics getGraphics2()
	 * { 		
		JPanel Gallows2 = new JPanel();
		PictureLibrary pic = new PictureLibrary();
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pic.setSize(650, 700);
		
		final JLabel label2; 									// JLabel with text and Icon -AO
		Icon gallows2 = new ImageIcon(getClass().getResource("Gallows2.jpg"));
		label2 = new JLabel();		 							// JLabel constructor no arguments AO
		label2.setText("Oops! That was not the right letter.");
		label2.setIcon(gallows2);			 					// add icon to JLabel - AO
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		Gallows2.add(label2); 									// add label to JFrame
		pic.add(Gallows2);
		pic.setVisible(true);
		return null;
	}
		
	public Graphics getGraphics3()
	{ 		
		JPanel Gallows3 = new JPanel();
		PictureLibrary pic = new PictureLibrary();
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pic.setSize(650, 700);
		
		final JLabel label3; 									// JLabel with text and Icon - AO
		Icon gallows3 = new ImageIcon(getClass().getResource("Gallows3.jpg"));
		label3 = new JLabel(); 									// JLabel constructor no arguments - AO
		label3.setText("Wrong letter.");
		label3.setIcon(gallows3); 								// add icon to JLabel - AO
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		Gallows3.add(label3); 									// add label to JFrame - AO
		pic.add(Gallows3);
		pic.setVisible(true);
		return null;
	}
	
	public Graphics getGraphics4()
	{ 		
			JPanel Gallows4 = new JPanel();
			PictureLibrary pic = new PictureLibrary();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(650, 700);
				
			final JLabel label4; 							// JLabel with text and Icon - AO
			Icon gallows4 = new ImageIcon(getClass().getResource("Gallows4.jpg"));
			label4 = new JLabel(); 							// JLabel constructor no arguments - AO
			label4.setText("Bad guess.");
			label4.setIcon(gallows4); 						// add icon to JLabel - AO
			label4.setHorizontalTextPosition(SwingConstants.CENTER);
			label4.setVerticalTextPosition(SwingConstants.BOTTOM);
			Gallows4.add(label4); 							// add label to JFrame - AO
			pic.add(Gallows4);
			pic.setVisible(true);
			return null;
		}
			
			public Graphics getGraphics5()
			{ 		
				JPanel Gallows5 = new JPanel();
				PictureLibrary pic = new PictureLibrary();
				pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				pic.setSize(650, 700);
				
				final JLabel label5; 						// JLabel with text and Icon - AO
				Icon gallows5 = new ImageIcon(getClass().getResource("Gallows5.jpg"));
				label5 = new JLabel(); 						// JLabel constructor no arguments - AO
				label5.setText("Careful! You are running out of chances.");
				label5.setIcon(gallows5); 					// add icon to JLabel - AO
				label5.setHorizontalTextPosition(SwingConstants.CENTER);
				label5.setVerticalTextPosition(SwingConstants.BOTTOM);
				Gallows5.add(label5); 						// add label to JFrame - AO
				pic.add(Gallows5);
				pic.setVisible(true);
				return null;
			}
			
			public Graphics getGraphics6()
			{ 		
				JPanel Gallows6 = new JPanel();
				PictureLibrary pic = new PictureLibrary();
				pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				pic.setSize(650, 700);
				
				final JLabel label6; 						// JLabel with text and Icon - AO
				Icon gallows6 = new ImageIcon(getClass().getResource("Gallows6.jpg"));
				label6 = new JLabel(); 						// JLabel constructor no arguments - AO
				label6.setText("You have one last chance!");
				label6.setIcon(gallows6); 					// add icon to JLabel - AO
				label6.setHorizontalTextPosition(SwingConstants.CENTER);
				label6.setVerticalTextPosition(SwingConstants.BOTTOM);
				Gallows6.add(label6); 						// add label to JFrame - AO
				pic.add(Gallows6);
				pic.setVisible(true);
				return null;
			}*/
			
			public Graphics getGraphics7()
			{ 		
				JPanel Gallows7 = new JPanel();
				PictureLibrary pic = new PictureLibrary();
				pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				pic.setSize(650, 700);
				
				final JLabel label7; 						// JLabel with text and Icon - AO
				Icon gallows7 = new ImageIcon(getClass().getResource("Gallows7.jpg"));
				label7 = new JLabel(); 						// JLabel constructor no arguments - AO
				label7.setText("He is dead!");
				label7.setIcon(gallows7); 					// add icon to JLabel - AO
				label7.setHorizontalTextPosition(SwingConstants.CENTER);
				label7.setVerticalTextPosition(SwingConstants.BOTTOM);
				Gallows7.add(label7); 						// add label to JFrame - AO
				pic.add(Gallows7);
				pic.setVisible(true);
				return null;
			}
			

}


