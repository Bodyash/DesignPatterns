package com;

import java.awt.Font;

import javax.swing.JButton;

public class LblDisplay extends JButton{
	
	Mediator med;
	
	public LblDisplay(Mediator m){
		
		super("Just start...");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
	
}
