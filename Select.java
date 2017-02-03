import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Select extends JFrame {
	private JPanel panel;
	private JButton loginButton,guestButton;
	private JLabel labelImg,choiceLabel;
	private ImageIcon image;
	
	public Select()
	{
		//Setting the Panel
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.labelImg = new JLabel (image);
		this.labelImg.setBounds(150,20,300,300);
		this.panel.add(this.labelImg);
		
		
		//Login Button
		this.loginButton = new JButton("Admin Login");
		this.loginButton.setBounds(70,400,210,70);
		this.loginButton.setFont(new Font("Serif", Font.BOLD, 30));
		this.panel.add(this.loginButton);
		
		//Admin Login Action Listener
		this.loginButton.addActionListener(new ActionListener(){
			@Override					
			public void actionPerformed(ActionEvent e){
				Select.this.setVisible(false);
				LoginFrame lf = new LoginFrame();
				lf.setVisible(true);
			}			
		});
		
		
		//Choice Label
		this.choiceLabel = new JLabel("Choose Entry Method:");
		this.choiceLabel.setBounds(160,300,300,100);
		this.choiceLabel.setFont(new Font("Serif", Font.BOLD, 30));
		this.panel.add(this.choiceLabel);
		
		
		
		//Guest Button
		this.guestButton = new JButton("Guest User");
		this.guestButton.setBounds(320,400,210,70);
		this.guestButton.setFont(new Font("Serif", Font.BOLD, 30));
		this.panel.add(this.guestButton);
		
		//Guest User Action Listener
		this.guestButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
					Select.this.setVisible(false);
					Welcome wlc = new Welcome();
					wlc.setVisible(true);
			}
		});
		
		
		//Setting Size,Title and Close Operation
		this.setTitle("Football++");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
