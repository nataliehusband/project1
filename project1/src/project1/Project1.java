package project1;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Collections; 
//import java.util.ArrayList; 
//import java.awt.Container;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import javax.imageio.ImageIO;
//import javax.swing.Icon;
//import javax.swing.JLabel;
//import java.util.List;


public class Project1 
{
	
	public static void main(String[] args)
	{
		//calls the method that has the JFrame and all of its components in it
		JFrameBoard(); 
	}
	
	private static void JFrameBoard()
	{
		//creates JFrame 
		JFrame board = new JFrame("Grid Layout"); 
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the default close operation
		board.setSize(500, 500); //sets the size of the JFrame
		board.setLocationRelativeTo(null); //centers JFrame on screen 
		JPanel boardLayout = new JPanel(); //creates a new JPanel
		boardLayout.setLayout(new GridLayout(3, 4, 5, 10)); //sets the layout of the JPanel						
				
		//creates button 1 & 2 and puts the same image in it 
		ImageIcon picture1pic = new ImageIcon("/Users/nataliehusband/Documents"
				+ "/workspace/project1/images/clownFish.jpg");
		Image imgPicture1 = picture1pic.getImage();
		Image newimgPic1 = imgPicture1.getScaledInstance(100, 80,  java.awt.Image.SCALE_SMOOTH);
		picture1pic = new ImageIcon(newimgPic1);
				
		JButton picture1 = new JButton(picture1pic); 
		JButton picture2 = new JButton(picture1pic); 
				
		//creates button 3 & 4 and puts the same image in them 
		ImageIcon dogs = new ImageIcon("/Users/nataliehusband/Documents" 
				+ "/workspace/project1/images/dogs1.jpg");
		Image imgDogs = dogs.getImage(); 
		Image newDog = imgDogs.getScaledInstance(100, 80, java.awt.Image.SCALE_SMOOTH); 
		dogs = new ImageIcon(newDog); 
				
		JButton picture3 = new JButton(dogs);
		JButton picture4 = new JButton(dogs); 
				
		//creates button 5 & 6 and puts the same image in them 
		ImageIcon image = new ImageIcon("/Users/nataliehusband/Documents"
				+ "/workspace/project1/images/images.jpg");
		Image imgImage = image.getImage(); 
		Image newImage = imgImage.getScaledInstance(100, 90 , java.awt.Image.SCALE_SMOOTH); 
		image = new ImageIcon(newImage); 
				
		JButton picture5 = new JButton(image);
		JButton picture6 = new JButton(image); 
				
		//creates button 7 & 8 and puts the same image in them 
		ImageIcon snow = new ImageIcon("/Users/nataliehusband/Documents"
				+ "/workspace/project1/images/snow.jpg");
		Image imgSnow = snow.getImage(); 
		Image newSnow = imgSnow.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH); 
		snow = new ImageIcon(newSnow); 
				
		JButton picture7 = new JButton(snow); 				
		JButton picture8 = new JButton(snow); 
				
		//creates button 9 & 10 and puts the same image in them 
		ImageIcon snowCat = new ImageIcon("/Users/nataliehusband/Documents"
				+ "/workspace/project1/images/snowCat.jpg"); 
		Image imgSnowCat = snowCat.getImage(); 
		Image newSnowCat = imgSnowCat.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
		snowCat = new ImageIcon(newSnowCat); 
				
		JButton picture9 = new JButton(snowCat);
		JButton picture10 = new JButton(snowCat); 
				
		//creates button 11 & 12 and puts the same image in them 
		ImageIcon sunset = new ImageIcon("/Users/nataliehusband/Documents"
				+ "/workspace/project1/images/sunset.jpg");
		Image imgSunset = sunset.getImage(); 
		Image newSunset = imgSunset.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
		sunset = new ImageIcon(newSunset); 
				
		JButton picture11 = new JButton(sunset); 
		JButton picture12 = new JButton(sunset); 
				
				
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
	
}
