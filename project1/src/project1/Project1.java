//sources
//http://stackoverflow.com/questions/16934225/actionlistener-disabling-buttons
//http://stackoverflow.com/questions/2077216/java-thread-currentthread-sleepx-vs-thread-sleepx
//http://stackoverflow.com/questions/20842915/memory-gamechange-image-of-imagebutton-dynamically-for-the-second-card-without
//http://www.java-forums.org/awt-swing/19997-help-make-memory-game.html
//http://stackoverflow.com/questions/13949092/declaring-button-variables-as-an-array-with-a-for-loop-android
//http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array

package project1;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Project1 
{
	public static int clickCount = 0;
	//variables for methods
		static String secondButton; 
		static JButton secondButton2; 
		static JButton previousButton;
		static String previousButtonName;
		static int disableCounter = 0;
		
		static JButton[] buttons = new JButton[12]; 
	
	public void multipanel()
	{
		buttons = new JButton[12];
	}
	
	//the main of the program 
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Welcome! We are going to play a memory game."
				+ " Select two cards. \nIf they match, they will stay faceup. If they don't, "
				+ "they will flip back over. \n When you have found all of the matches, you have "
				+ "beat the game!");
		JFrameBoard();
	}
	
	//method JFrameBoard
	private static void JFrameBoard()
	{		
			//creates JFrame 
			JFrame board = new JFrame("Grid Layout"); 
			board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the default close operation
			board.setSize(500, 500); //sets the size of the JFrame
			board.setLocationRelativeTo(null); //centers JFrame on screen 
			JPanel boardLayout = new JPanel(); //creates a new JPanel
			boardLayout.setLayout(new GridLayout(3, 4, 5, 10)); //sets the layout of the JPanel	
			
			buttons[0] = new JButton(); 
			buttons[1] = new JButton(); 
			buttons[2] = new JButton(); 
			buttons[3] = new JButton(); 
			buttons[4] = new JButton(); 
			buttons[5] = new JButton(); 
			buttons[6] = new JButton(); 
			buttons[7] = new JButton();
			buttons[8] = new JButton(); 
			buttons[9] = new JButton(); 
			buttons[10] = new JButton(); 
			buttons[11] = new JButton(); 
			
			
			
					
			//creates button 1, creates action listener and sets image
			buttons[0].addActionListener(new ActionListener() //adds the action listener to the button
					{
						public void actionPerformed(ActionEvent e) //if there is an action performed on the button, it enters here
						{
							//calls the image from the source folder
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage(); //takes the picture and gets it for the program
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH); //changes the size of image
							picture1pic = new ImageIcon(newimgPic1); //take the scaled image and creates an image icon
							buttons[0].setIcon(picture1pic); //sets the icon of the button and places it inside 
							clickCount++; //adds one to the click count
							jbuttonParameter(buttons[0], "clownFish"); //calls the method jbuttonParameter and sets a name for the icon
						}
					});
			
			//creates button 2, creates action listener and sets image
			buttons[1].addActionListener(new ActionListener() //creates an action listener for the second button
					{
						public void actionPerformed(ActionEvent e) //tests to see if an action is performed on this button
						{	
							//calls the image from the source folder
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage();
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH); //sizes the image
							picture1pic = new ImageIcon(newimgPic1); //puts the image in an icon
							buttons[1].setIcon(picture1pic); //sets the image of the button 
							clickCount++; //adds one to the count
							buttons[1].setEnabled(true);
							buttons[1].setVisible(true);
							buttons[1].repaint();
							jbuttonParameter(buttons[1], "clownFish"); //calls the method and names the icon
						}
					});
						
			
			
			
			//creates button 3, adds action listener and sets image
			buttons[2].addActionListener(new ActionListener() //adds an action listener to the third button
					{
						public void actionPerformed(ActionEvent e) //tests to see when the action is performed on the button
						{
							//gets the image from the source folder 
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); //sets size of image
							dogs = new ImageIcon(newDog); //puts the image in an icon
							buttons[2].setIcon(dogs); //sets the icon of the button to the image 
							clickCount++; //adds one to the count
							/*try {Thread.sleep(1000);} 
							catch (InterruptedException f) 
							{
								f.printStackTrace();
							}*/
							
							jbuttonParameter(buttons[2], "dogs"); //calls method and sets the name of the icon
							/*try {Thread.sleep(1000);} 
							catch (InterruptedException f) 
							{
								f.printStackTrace();
							}*/
							
						}
					});
			
			//creates button 4, adds action listener and sets image
			buttons[3].addActionListener(new ActionListener() //adds an action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); //sets the size of the image
							dogs = new ImageIcon(newDog); //puts image in an icon
							buttons[3].setIcon(dogs); //puts icon in button 
							clickCount++; //adds one to the count
							jbuttonParameter(buttons[3], "dogs"); //calls method and sets name of icon
						}
					});
			
			//creates button 5, adds action listener and sets image
			buttons[4].addActionListener(new ActionListener() //adds an action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); //sets size of image
							image = new ImageIcon(newImage);  //puts image in an icon
							buttons[4].setIcon(image); //puts icon in button
							clickCount++; //adds one to the count
							jbuttonParameter(buttons[4], "image"); //calls method and sets name of icon
						}
					});
			
			//creates button 6, adds action listener and sets image
			buttons[5].addActionListener(new ActionListener() //adds action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked
						{
							//calls image from source folder
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); //sets size of image
							image = new ImageIcon(newImage); //puts image in an icon
							buttons[5].setIcon(image); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(buttons[5], "image"); //calls method and sets the name of the icon
						}
					});
					
			//creates button 7, adds action listener and sets image 
			buttons[6].addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked
						{
							//calls image from source folder
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage();  
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snow = new ImageIcon(newSnow);  //puts image in icon
							buttons[6].setIcon(snow); //puts icon in button
							clickCount++; //add one to count
							jbuttonParameter(buttons[6], "snow"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 8, adds action listener and sets image
			buttons[7].addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if clicked
						{
							//calls image from source folder
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage(); 
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snow = new ImageIcon(newSnow); //puts image in icon
							buttons[7].setIcon(snow); //puts icon in button 
							clickCount++; //adds one to count
							jbuttonParameter(buttons[7], "snow"); //calls method and sets name of icon
						}
					});
								
			//creates button 9, adds action listener and sets image
			buttons[8].addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked 
						{
							//calls image from source folder
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snowCat = new ImageIcon(newSnowCat); //puts image in icon
							buttons[8].setIcon(snowCat); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(buttons[8], "snowCat"); //calls method and sets the name of icon
						}
					});
			
			//creates button 10, adds action listener and sets image
			buttons[9].addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snowCat = new ImageIcon(newSnowCat); //puts image in icon
							buttons[9].setIcon(snowCat); //puts icon in button 
							clickCount++; //adds one to count
							jbuttonParameter(buttons[9], "snowCat"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 11, adds action listener and sets image
			buttons[10].addActionListener(new ActionListener() //creates action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							sunset = new ImageIcon(newSunset); //puts image in icon
							buttons[10].setIcon(sunset); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(buttons[10], "sunset"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 12, adds action listener and sets image
			buttons[11].addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							sunset = new ImageIcon(newSunset); //puts image in icon
							buttons[11].setIcon(sunset); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(buttons[11], "sunset"); //calls method and sets name of icon
						}
					});
			
				
			//add buttons to panel boardLayout
			boardLayout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			for (JButton button : buttons) 
			{
				boardLayout.add(button);
		    }
			  /*
			boardLayout.add(buttons[0]);
			boardLayout.add(buttons[1]); 
			boardLayout.add(buttons[2]); 
			boardLayout.add(buttons[3]); 
			boardLayout.add(buttons[4]); 
			boardLayout.add(buttons[5]); 
			boardLayout.add(buttons[6]); 
			boardLayout.add(buttons[7]); 
			boardLayout.add(buttons[8]); 
			boardLayout.add(buttons[9]); 
			boardLayout.add(buttons[10]); 
			boardLayout.add(buttons[11]); 
			*/
			//add panel to board
			board.add(boardLayout); 
					
			//set visible
			board.setVisible(true); //sets the JFrame so that it can be seen 
			shuffle(); 
	}	
	
	//variables for methods
	//static JButton previousButton;
	//static String previousButtonName;
	//static int disableCounter = 0;
	
	//creates the method that will check to see whether or not the buttons
	//are the same as the last one that was clicked and the re-enables them or disables them
	//Subin helped me with a lot of the following code (I needed help putting my logic into code)
	private static void checkButtons()
	{
		disableCounter = 0; //sets the value of counter to 0 
		for(int i = 0; i < 12; i++)
		{
			if(!(buttons[i].isEnabled())) //if the buttons are not enabled, disableCounter++ 
			{
				disableCounter++; //adds increments of one to disableCounter
			}
		}
		
		if(disableCounter == 12) //tests for when the disableCounter is equal to 12
		{
			JOptionPane.showMessageDialog(null, "Yay, you won!"); //tells user that they won the game
			if(JOptionPane.showConfirmDialog(null, "Do you want to play again?") == 0) //asks user if 
				//they want to play again and tests to see if return value is equal to 0, which is yes
			{
				JFrameBoard(); //calls the method again that contains the game
			} 
			else
			{
				System.exit(0); //exits the game if the answer is any other value than 0 (yes)
			}
		}
	}
	
	//method that tests to see if the buttons selected are equal to each other or not
	private static void jbuttonParameter(JButton halo, String buttonName)
	{
		 try
         {
                Thread.sleep(1000);
         }
         catch (InterruptedException e)
         {
                e.printStackTrace();
         }
		if(clickCount == 1) //when only one button has been selected
		{
			previousButtonName = buttonName; //sets the icon name of first button selected 
			previousButton = halo; 
		} 
		else if(clickCount == 2) //when two buttons have been selected
		{
			secondButton = buttonName; 		
			secondButton2 = halo; 
			if(secondButton.equalsIgnoreCase(previousButtonName)) //if buttons are the same
			{
				halo.setEnabled(false); //disables first button 
				previousButton.setEnabled(false); //disables second button 
				clickCount = 0; //resets the clickCount 
				checkButtons(); //calls the method that will check buttons to see if all are disabled yet
			}
		}	
		else if(clickCount == 3)
		{
			if(secondButton.equalsIgnoreCase(previousButtonName)) //if buttons are the same
			{
				halo.setEnabled(false); //disables first button 
				previousButton.setEnabled(false); //disables second button 
				clickCount = 0; //resets the clickCount 
				checkButtons(); //calls the method that will check buttons to see if all are disabled yet
			}
			else //if button icon names aren't the same
			{
				
				//System.out.println("enable previous");
				//previousButton.setEnabled(false);
				previousButton.setEnabled(true); //re-enables first button
				previousButton.setIcon(null); //gets rid of image (icon) of first image 
				//secondButton2.setEnabled(false); 
				secondButton2.setEnabled(true); 
				secondButton2.setIcon(null); 
				//halo.setEnabled(false); 
				//halo.setEnabled(true); //re-enables second button
				clickCount = 1; 
				previousButton = halo; 
				previousButtonName = buttonName; 
			}
		}
	}	
	
	private static void shuffle()
	{
		Collections.shuffle(Arrays.asList(buttons)); 
	}
 }


