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
			JButton picture1 = new JButton(); 
			picture1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage();
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH);
							picture1pic = new ImageIcon(newimgPic1);
							picture1.setIcon(picture1pic); 
							clickCount++;
							jbuttonParameter(picture1, "clownFish"); 
						}
					});
			
			//creates button 2, creates action listener and sets image
			JButton picture2 = new JButton(); 
			picture2.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{	
							ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/clownFish.jpg");
							Image imgPicture1 = picture1pic.getImage();
							Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH);
							picture1pic = new ImageIcon(newimgPic1);
							picture2.setIcon(picture1pic);
							clickCount++;
							jbuttonParameter(picture2, "clownFish"); 

						}
					}); 
			
			
			
			//creates button 3, adds action listener and sets image
			JButton picture3 = new JButton();
			picture3.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); 
							dogs = new ImageIcon(newDog); 
							picture3.setIcon(dogs);
							clickCount++; 
							jbuttonParameter(picture3, "dogs");
						}
					});
			
			//creates button 4, adds action listener and sets image
			JButton picture4 = new JButton(); 
			picture4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon dogs = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/dogs1.jpg");
							Image imgDogs = dogs.getImage(); 
							Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); 
							dogs = new ImageIcon(newDog); 
							picture4.setIcon(dogs);
							clickCount++; 
							jbuttonParameter(picture4, "dogs");
						}
					});
			
			//creates button 5, adds action listener and sets image
			JButton picture5 = new JButton();
			picture5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); 
							image = new ImageIcon(newImage); 
							picture5.setIcon(image);
							clickCount++; 
							jbuttonParameter(picture5, "image");
						}
					});
			
			//creates button 6, adds action listener and sets image
			JButton picture6 = new JButton(); 
			picture6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon image = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/images.jpg");
							Image imgImage = image.getImage(); 
							Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); 
							image = new ImageIcon(newImage); 
							picture6.setIcon(image);
							clickCount++; 
							jbuttonParameter(picture6, "image");
						}
					});
					
			//creates button 7, adds action listener and sets image 
			JButton picture7 = new JButton(); 
			picture7.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage(); 
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); 
							snow = new ImageIcon(newSnow); 
							picture7.setIcon(snow);
							clickCount++; 
							jbuttonParameter(picture7, "snow");
						}
					});
			
			//creates button 8, adds action listener and sets image
			JButton picture8 = new JButton(); 
			picture8.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon snow = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snow.jpg");
							Image imgSnow = snow.getImage(); 
							Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); 
							snow = new ImageIcon(newSnow); 
							picture8.setIcon(snow);
							clickCount++; 
							jbuttonParameter(picture8, "snow");
						}
					});
								
			//creates button 9, adds action listener and sets image
			JButton picture9 = new JButton();
			picture9.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
							snowCat = new ImageIcon(newSnowCat); 
							picture9.setIcon(snowCat);
							clickCount++; 
							jbuttonParameter(picture9, "snowCat");
						}
					});
			
			//creates button 10, adds action listener and sets image
			JButton picture10 = new JButton(); 
			picture10.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/snowCat.jpg"); 
							Image imgSnowCat = snowCat.getImage(); 
							Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
							snowCat = new ImageIcon(newSnowCat); 
							picture10.setIcon(snowCat);
							clickCount++; 
							jbuttonParameter(picture10, "snowCat");
						}
					});
			
			//creates button 11, adds action listener and sets image
			JButton picture11 = new JButton();
			picture11.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
							sunset = new ImageIcon(newSunset); 
							picture11.setIcon(sunset);
							clickCount++; 
							jbuttonParameter(picture11, "sunset");
						}
					});
			
			//creates button 12, adds action listener and sets image
			JButton picture12 = new JButton(); 
			picture12.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ImageIcon sunset = new ImageIcon("/Users/nataliehusband/git/project1/project1/images/sunset.jpg");
							Image imgSunset = sunset.getImage(); 
							Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
							sunset = new ImageIcon(newSunset); 
							picture12.setIcon(sunset);
							clickCount++; 
							jbuttonParameter(picture12, "sunset");
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
	static JButton previousButton;
	static String previousButtonName;
	static int disableCounter = 0;
	
	private static void checkButtons()
	{
		disableCounter = 0;
		for(int i = 0; i < 12; i++)
		{
			if(!(buttons[i].isEnabled()))
			{
				disableCounter++;
			}
		}
		
		if(disableCounter == 12)
		{
			JOptionPane.showMessageDialog(null, "Yay, you won!");
			if(JOptionPane.showConfirmDialog(null, "Do you want to play again?") == 0)
			{
				JFrameBoard();
			} 
			else
			{
				System.exit(0);
			}
		}
	}
	
	private static void jbuttonParameter(JButton halo, String buttonName)
	{
		if(clickCount == 1)
		{
			previousButtonName = buttonName;
			System.out.println(halo.getIcon());
			previousButton = halo;
		} 
		else if(clickCount == 2)
		{
			if(buttonName.equalsIgnoreCase(previousButtonName))
			{
				halo.setEnabled(false);
				previousButton.setEnabled(false);
				clickCount = 0;
				checkButtons();
			}
			else
			{
				previousButton.setEnabled(true);
				previousButton.setIcon(null);
				halo.setEnabled(true);
				halo.setIcon(null);
				clickCount = 0;

			}
		}	
	}
}
