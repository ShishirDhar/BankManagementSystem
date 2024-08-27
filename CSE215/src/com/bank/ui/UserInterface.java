package com.bank.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class UserInterface extends JFrame implements ActionListener{

	// Action Listener listens for any button press
	
	JButton butEmp;// declared outside for global variable issues
	JButton butUser;

    public UserInterface() {
    	JPanel panelTop = new JPanel(); // The one with the logo
    	JPanel panelBot = new JPanel(); // The one with another panel for buttons and the login logo
    	JLabel label = new JLabel(); // Create a label
    	JLabel labeln = new JLabel(); // The logo and Login info in the bottom panel
    	JLabel copyRight = new JLabel();
    	JPanel panelCent = new JPanel(); // The panel in the center for the poem
    	JLabel poemLabel = new JLabel(); // The poem label
    	JPanel panelBotin = new JPanel(); // The panel that is inside the bottom panel that includes the login buttons
    	
    	//Button
    	butEmp= new JButton("Employee Login");
    	butEmp.setBounds(170, 0, 100,50 );
    	butEmp.setBackground(Color.yellow);
    	butEmp.addActionListener(this);// ActionListener added 
    	butEmp.setFocusable(false);
    	
    	butUser= new JButton("Client Login");
    	butUser.setBounds(170, 20, 100,50 );
    	butUser.setBackground(Color.yellow);
    	butUser.addActionListener(this);
    	butUser.setFocusable(false); // Removes that annoying highlighting of buttons

    	
        // Setting up the frame
        this.setSize(700, 600);
        this.setTitle("Gringotts Portal #69");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        // Set up the panel
        panelTop.setBackground(new Color(232, 226, 49));
        panelBot.setBackground(new Color(240, 48, 48));
        panelCent.setBackground(new Color(232, 226, 49));
        panelBotin.setBackground(new Color(232, 226, 49)); 
        
        
        panelTop.setPreferredSize(new Dimension(280,200));
        panelBot.setPreferredSize(new Dimension(220,250));
        panelBot.setLayout(new BorderLayout());
        panelCent.setPreferredSize(new Dimension(100, 100));
        panelBotin.setPreferredSize(new Dimension(50, 50));
        
        // Setting the frame's icon
        ImageIcon image = new ImageIcon("D:\\Java\\wizard.png");
        ImageIcon logo = new ImageIcon("D:\\Java\\Banklogo.png");
        ImageIcon wizard = new ImageIcon("D:\\Java\\wizard (1).png");
        this.setIconImage(image.getImage());
        
        
        // Configure the label
        label.setIcon(logo);
        label.setText("Welcome to the Bank of Gringotts Login Portal");
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image
    	label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM OF IMAGE 
    	label.setForeground(new Color(240, 48, 48));//Sets font color
    	label.setFont(new Font("Arial",Font.BOLD, 25)); // sets font of text
    	label.setIconTextGap(20); // set gap of text to image
    	label.setVerticalAlignment(JLabel.TOP); // Vertical position of icon and text 
    	label.setHorizontalAlignment(JLabel.CENTER); // Horizontal position of icon and text
    	panelTop.add(label);
       
        // Configuring the new label
    	labeln.setIcon(wizard);
        labeln.setText("LOGIN....");
        labeln.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, CENTER, RIGHT of image
    	labeln.setVerticalTextPosition(JLabel.CENTER); // set text TOP, CENTER, BOTTOM OF IMAGE 
    	labeln.setForeground(Color.black);//Sets font color
    	labeln.setFont(new Font("Arial",Font.BOLD, 15)); // sets font of text
    	labeln.setIconTextGap(10); // set gap of text to image
    	labeln.setVerticalAlignment(JLabel.TOP); // Vertical position of icon and text 
    	labeln.setHorizontalAlignment(JLabel.CENTER); // Horizontal position of icon and text
    	panelBot.add(labeln, BorderLayout.NORTH);
    	
    	// Configuring the poem label
    	poemLabel.setText("For those who take, but do not earn ... Must pay most dearly in their turn!");
    	poemLabel.setHorizontalTextPosition(JLabel.CENTER);
    	poemLabel.setFont(new Font("Palatino",Font.ITALIC, 14));
    	poemLabel.setForeground(Color.black);
    	panelCent.add(poemLabel);
    	panelBot.add(panelBotin, BorderLayout.CENTER); // Added the panel for buttons to bottom panel
    	
    	//Configuring the copyright label
    	copyRight.setText("Copyright © 1405 Gringotts Bank PLC. All rights reserved.");
    	
    	
    	//Button add
    	panelBotin.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
    	panelBotin.add(butEmp); // Adding the button to the bottom inside panel
    	panelBotin.add(butUser);
    	panelBotin.add(copyRight);
    	
        // Using a layout manager
        this.add(panelTop,BorderLayout.NORTH);
        this.add(panelBot,BorderLayout.SOUTH);
        this.add(panelCent,BorderLayout.CENTER);
        this.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==butEmp) {
			EmployeeUI me = new EmployeeUI();
		}
	}

    
}
