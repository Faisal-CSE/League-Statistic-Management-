import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class deletePlayer extends JFrame {

	private JPanel panel;
	private JLabel textLabel,imgLabel;
	private JTextField text;
	private ImageIcon image;
	private JButton deleteButton,backButton,closeButton;
	
	public deletePlayer(){
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(150,0,300,300);
		this.panel.add(this.imgLabel);
		
		this.textLabel = new JLabel("Enter Player Last Name to Delete");
		this.textLabel.setBounds(20,330,350,30);
		this.textLabel.setFont(new Font("Serif", Font.BOLD, 20));
		this.panel.add(this.textLabel);
		
		this.text = new JTextField();
		this.text.setBounds(350,330,200,30);
		this.panel.add(this.text);
		
		this.deleteButton = new JButton("Delete");
		this.deleteButton.setBounds(250,410,100,40);
		this.panel.add(this.deleteButton);
		this.deleteButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(text.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Enter Player's Name for Deleting");
				}
				
				else
				{
					String lastName = text.getText();
					DataAccess das = new DataAccess();
					das.deletePlayer(lastName);
					
					deletePlayer.this.setVisible(false);
					AdminPage apg = new AdminPage();
					apg.setVisible(true);
					
				}
					
				}
		});
		
		
		//Back Button
		this.backButton = new JButton("Back");
		this.backButton.setBounds(160,510,80,20);
		this.panel.add(this.backButton);
		this.backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				deletePlayer.this.setVisible(false);
				AdminPage adpg = new AdminPage();
				adpg.setVisible(true);
			}
		});

		//Close Button
		this.closeButton = new JButton("Close");
		this.closeButton.setBounds(360,510,80,20);
		this.panel.add(this.closeButton);
		this.closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}			
		});
		
		this.setSize(600,600);
		this.setTitle("Football++");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
