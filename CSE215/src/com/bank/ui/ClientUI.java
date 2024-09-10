package com.bank.ui;

import java.awt.Color;
import com.bank.database.CustomerData;
import javax.swing.*;

public class ClientUI {
	
	
	
	public ClientUI() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // BoxLayout with y axis helps set the labels in a row horizontally or vertically
		
		// Text boxes
		JTextField fieldName = new JTextField(10); // 10 colums wide
		JTextField fieldPass = new JTextField(10);
		
		panel.add(new JLabel("Enter Name:"));
		panel.add(fieldName);
		panel.add(Box.createVerticalStrut(15)); // Adds space between the inputs
		panel.add(new JLabel("Enter Password:"));
		panel.add(fieldPass);
		
		int output = JOptionPane.showConfirmDialog(null, panel, "LOGIN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (output == JOptionPane.OK_OPTION) {
	            String input1 = fieldName.getText();
	            String input2 = fieldPass.getText();
	            if(CustomerData.infoCheck(input1)) {
	            	JOptionPane.showMessageDialog(null, "Your Are In!!", "Success", JOptionPane.INFORMATION_MESSAGE);
	            }else {
	            	JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.WARNING_MESSAGE);
	            }
	            
	    } 
		
		
	}

}
