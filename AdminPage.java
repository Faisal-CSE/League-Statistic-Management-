import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class AdminPage extends JFrame {
	private JPanel panel;
	private JButton addButton,updateButton,normalButton;
	private JLabel chooseLabel,imgLabel;
	private ImageIcon image;

	public AdminPage(){
		//Setting the Panel
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(150,20,300,300);
		this.panel.add(this.imgLabel);
		
		//Choose Operation Label
		this.chooseLabel = new JLabel("Choose Desired Operation:");
		this.chooseLabel.setBounds(150,300,300,50);
		this.chooseLabel.setFont(new Font("Serif", Font.BOLD, 25));
		this.panel.add(this.chooseLabel);
		
		
		//Add Player Button
		this.addButton = new JButton("Add Player");
		this.addButton.setBounds(70,370,210,70);
		this.addButton.setFont(new Font("Serif", Font.BOLD, 23));
		this.panel.add(this.addButton);
		
		//Add Player Action Listener
		this.addButton.addActionListener(new ActionListener(){
			@Override					
			public void actionPerformed(ActionEvent e){
				AdminPage.this.setVisible(false);
				addPlayer add = new addPlayer();
				add.setVisible(true);
	
			}			
		});
		
		
		//Update Button
		this.updateButton = new JButton("Delete Player");
		this.updateButton.setBounds(320,370,210,70);
		this.updateButton.setFont(new Font("Serif", Font.BOLD, 23));
		this.panel.add(this.updateButton);
		
		//Update Action Listener
		this.updateButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
					AdminPage.this.setVisible(false);
					deletePlayer del = new deletePlayer();
					del.setVisible(true);
			}
		});
		
		
		//Normal User Button
		this.normalButton = new JButton("Use as Normal User");
		this.normalButton.setBounds(180,450,250,70);
		this.normalButton.setFont(new Font("Serif", Font.BOLD, 23));
		this.panel.add(this.normalButton);
		
		//Delete Player Action Listener
		this.normalButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
					AdminPage.this.setVisible(false);
					Welcome wc = new Welcome();
					wc.setVisible(true);
			}
		});
		
		
		this.setSize(600,600);
		this.setTitle("Football++");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
