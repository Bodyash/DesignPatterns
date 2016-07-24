package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener{

	Mediator med = new ParticipantMediator();
	
	public Main(){
		
		JPanel p = new JPanel();
		p.add(new BtnView(this, med));
		p.add(new BtnBook(this, med));
		p.add(new BtnSearch(this, med));
		
		this.getContentPane().add(new LblDisplay(med), "North");
		this.getContentPane().add(p, "South");;
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Command comd = (Command) e.getSource();
		comd.execute();
	}
	
	public static void main(String[] args) {
		
		new Main();
	}
	
}
