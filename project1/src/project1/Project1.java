package project1;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import java.util.Collections;
//import java.util.Random; 
//import javax.swing.JLabel;
//import java.util.ArrayList; 
//import java.awt.Container;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import javax.imageio.ImageIO;
//import javax.swing.Icon;
//import java.util.List;
//import javax.swing.JOptionPane;


public class Project1 
{
	public static int clickCount = 0;

	static JButton[] buttons = new JButton[12]; 
	
	public void multipanel()
	{
		buttons = new JButton[12];
	}
	
	//the main of the program 
	public static void main(String[] args)
	{
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
					
			//creates button 1, creates action listener and sets image
			JButton picture1 = new JButton(); //creates button1
			picture1.addActionListener(new ActionListener() //adds the action listener to the button
					{
						public void actionPerformed(ActionEvent e) //if there is an action performed on the button, it enters here
						{
							//calls the image from the source folder
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage(); //takes the picture and gets it for the program
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH); //changes the size of image
							picture1pic = new ImageIcon(newimgPic1); //take the scaled image and creates an image icon
							picture1.setIcon(picture1pic); //sets the icon of the button and places it inside 
							clickCount++; //adds one to the click count
							jbuttonParameter(picture1, "clownFish"); //calls the method jbuttonParameter and sets a name for the icon
						}
					});
			
			//creates button 2, creates action listener and sets image
			JButton picture2 = new JButton(); //creates the second button 
			picture2.addActionListener(new ActionListener() //creates an action listener for the second button
					{
						public void actionPerformed(ActionEvent e) //tests to see if an action is performed on this button
						{	
							//calls the image from the source folder
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage();
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH); //sizes the image
							picture1pic = new ImageIcon(newimgPic1); //puts the image in an icon
							picture2.setIcon(picture1pic); //sets the image of the button 
							clickCount++; //adds one to the count
							jbuttonParameter(picture2, "clownFish"); //calls the method and names the icon

						}
					}); 
			
			
			
			//creates button 3, adds action listener and sets image
			JButton picture3 = new JButton(); //adds the third button
			picture3.addActionListener(new ActionListener() //adds an action listener to the third button
					{
						public void actionPerformed(ActionEvent e) //tests to see when the action is performed on the button
						{
							//gets the image from the source folder 
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); //sets size of image
							dogs = new ImageIcon(newDog); //puts the image in an icon
							picture3.setIcon(dogs); //sets the icon of the button to the image 
							clickCount++; //adds one to the count
							jbuttonParameter(picture3, "dogs"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 4, adds action listener and sets image
			JButton picture4 = new JButton(); //creates button 4
			picture4.addActionListener(new ActionListener() //adds an action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); //sets the size of the image
							dogs = new ImageIcon(newDog); //puts image in an icon
							picture4.setIcon(dogs); //puts icon in button 
							clickCount++; //adds one to the count
							jbuttonParameter(picture4, "dogs"); //calls method and sets name of icon
						}
					});
			
			//creates button 5, adds action listener and sets image
			JButton picture5 = new JButton(); //creates 5th button 
			picture5.addActionListener(new ActionListener() //adds an action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); //sets size of image
							image = new ImageIcon(newImage);  //puts image in an icon
							picture5.setIcon(image); //puts icon in button
							clickCount++; //adds one to the count
							jbuttonParameter(picture5, "image"); //calls method and sets name of icon
						}
					});
			
			//creates button 6, adds action listener and sets image
			JButton picture6 = new JButton(); //creates the 6th button
			picture6.addActionListener(new ActionListener() //adds action listener 
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked
						{
							//calls image from source folder
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); //sets size of image
							image = new ImageIcon(newImage); //puts image in an icon
							picture6.setIcon(image); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(picture6, "image"); //calls method and sets the name of the icon
						}
					});
					
			//creates button 7, adds action listener and sets image 
			JButton picture7 = new JButton(); //creates button number 7 
			picture7.addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked
						{
							//calls image from source folder
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage();  
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snow = new ImageIcon(newSnow);  //puts image in icon
							picture7.setIcon(snow); //puts icon in button
							clickCount++; //add one to count
							jbuttonParameter(picture7, "snow"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 8, adds action listener and sets image
			JButton picture8 = new JButton(); //adds button 8 
			picture8.addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if clicked
						{
							//calls image from source folder
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage(); 
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snow = new ImageIcon(newSnow); //puts image in icon
							picture8.setIcon(snow); //puts icon in button 
							clickCount++; //adds one to count
							jbuttonParameter(picture8, "snow"); //calls method and sets name of icon
						}
					});
								
			//creates button 9, adds action listener and sets image
			JButton picture9 = new JButton(); //creates the 9th button 
			picture9.addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button gets clicked 
						{
							//calls image from source folder
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snowCat = new ImageIcon(newSnowCat); //puts image in icon
							picture9.setIcon(snowCat); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(picture9, "snowCat"); //calls method and sets the name of icon
						}
					});
			
			//creates button 10, adds action listener and sets image
			JButton picture10 = new JButton(); //creates button number 10
			picture10.addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							snowCat = new ImageIcon(newSnowCat); //puts image in icon
							picture10.setIcon(snowCat); //puts icon in button 
							clickCount++; //adds one to count
							jbuttonParameter(picture10, "snowCat"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 11, adds action listener and sets image
			JButton picture11 = new JButton(); //creates button number 11
			picture11.addActionListener(new ActionListener() //creates action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							sunset = new ImageIcon(newSunset); //puts image in icon
							picture11.setIcon(sunset); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(picture11, "sunset"); //calls method and sets the name of the icon
						}
					});
			
			//creates button 12, adds action listener and sets image
			JButton picture12 = new JButton(); //creates button 12
			picture12.addActionListener(new ActionListener() //adds action listener
					{
						public void actionPerformed(ActionEvent e) //tests to see if button is clicked
						{
							//calls image from source folder
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); //sets size of image
							sunset = new ImageIcon(newSunset); //puts image in icon
							picture12.setIcon(sunset); //puts icon in button
							clickCount++; //adds one to count
							jbuttonParameter(picture12, "sunset"); //calls method and sets name of icon
						}
					});
			
			//places buttons in an array
			buttons[0] = picture1; 
			buttons[1] = picture2; 
			buttons[2] = picture3; 
			buttons[3] = picture4; 
			buttons[4] = picture5; 
			buttons[5] = picture6; 
			buttons[6] = picture7; 
			buttons[7] = picture8; 
			buttons[8] = picture9; 
			buttons[9] = picture10; 
			buttons[10] = picture11; 
			buttons[11] = picture12;
					
			//add buttons to panel boardLayout
			boardLayout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			boardLayout.add(picture1);
			boardLayout.add(picture2); 
			boardLayout.add(picture3); 
			boardLayout.add(picture4); 
			boardLayout.add(picture5); 
			boardLayout.add(picture6); 
			boardLayout.add(picture7); 
			boardLayout.add(picture8); 
			boardLayout.add(picture9); 
			boardLayout.add(picture10); 
			boardLayout.add(picture11); 
			boardLayout.add(picture12); 
			
			//add panel to board
			board.add(boardLayout); 
					
			//set visible
			board.setVisible(true); //sets the JFrame so that it can be seen 
			
	}	
	
	//variables for methods
	static JButton previousButton;
	static String previousButtonName;
	static int disableCounter = 0;
	
	//creates the method that will check to see whether or not the buttons
	//are the same as the last one that was clicked and the re-enables them or disables them
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
		if(clickCount == 1) //when only one button has been selected
		{
			previousButtonName = buttonName; //sets the icon name of first button selected 
			previousButton = halo; 
		} 
		else if(clickCount == 2) //when two buttons have been selected
		{
			if(buttonName.equalsIgnoreCase(previousButtonName)) //if button icon names are the same
			{
				halo.setEnabled(false); //disables first button 
				previousButton.setEnabled(false); //disables second button 
				clickCount = 0; //resets the clickCount 
				checkButtons(); //calls the method that will check buttons to see if all are disabled yet
			}
			else //if button icon names aren't the same
			{
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				previousButton.setEnabled(true); //re-enables first button
				previousButton.setIcon(null); //gets rid of image (icon) of first image 
				halo.setEnabled(true); //re-enables second button
				halo.setIcon(null); //gets rid of image (icon) of second image
				clickCount = 0; //resets click count to 0 

			}
		}	
	}
}
