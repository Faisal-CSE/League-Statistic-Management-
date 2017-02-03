import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addPlayer extends JFrame {
	private JPanel panel;
	private JLabel firstNameLabel, lastNameLabel, positionLabel, jerseyLabel, goalsLabel, clubLabel, countryLabel, leagueLabel,imgLabel;
	private JTextField firstNameText, lastNameText, positionText, jerseyText, goalsText, clubText, countryText, leagueText;
	private JButton addButton,backButton,closeButton;
	private ImageIcon image;
	
	public addPlayer()
	{
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//Player Details Label
		this.firstNameLabel = new JLabel("Enter Player's First Name");
		this.firstNameLabel.setBounds(50,280,300,30);
		this.firstNameLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.firstNameLabel);
		
		this.lastNameLabel = new JLabel("Enter Player's Last Name");
		this.lastNameLabel.setBounds(50,320,300,30);
		this.lastNameLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.lastNameLabel);
		
		this.positionLabel = new JLabel("Enter Player's Position");
		this.positionLabel.setBounds(50,360,300,30);
		this.positionLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.positionLabel);
		
		this.jerseyLabel = new JLabel("Enter Player's Jersey No.");
		this.jerseyLabel.setBounds(50,400,300,30);
		this.jerseyLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.jerseyLabel);
		
		this.goalsLabel = new JLabel("Enter Player's Goals");
		this.goalsLabel.setBounds(50,440,300,30);
		this.goalsLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.goalsLabel);
		
		this.clubLabel = new JLabel("Enter Player's Club");
		this.clubLabel.setBounds(50,480,300,30);
		this.clubLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.clubLabel);
		
		this.countryLabel = new JLabel("Enter Player's Country");
		this.countryLabel.setBounds(50,520,300,30);
		this.countryLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.countryLabel);
		
		this.leagueLabel = new JLabel("Enter Player's League");
		this.leagueLabel.setBounds(50,560,300,30);
		this.leagueLabel.setFont(new Font("Serif", Font.BOLD, 17));
		this.panel.add(this.leagueLabel);
		
		
		//Player Add TextField
		this.firstNameText = new JTextField();
		this.firstNameText.setBounds(310,280,250,30);
		this.panel.add(this.firstNameText);
		
		this.lastNameText = new JTextField();
		this.lastNameText.setBounds(310,320,250,30);
		this.panel.add(this.lastNameText);
		
		this.positionText = new JTextField();
		this.positionText.setBounds(310,360,250,30);
		this.panel.add(this.positionText);
		
		this.jerseyText = new JTextField();
		this.jerseyText.setBounds(310,400,250,30);
		this.panel.add(this.jerseyText);
		
		this.goalsText = new JTextField();
		this.goalsText.setBounds(310,440,250,30);
		this.panel.add(this.goalsText);
		
		this.clubText = new JTextField();
		this.clubText.setBounds(310,480,250,30);
		this.panel.add(this.clubText);
		
		this.countryText = new JTextField();
		this.countryText.setBounds(310,520,250,30);
		this.panel.add(this.countryText);
		
		this.leagueText = new JTextField();
		this.leagueText.setBounds(310,560,250,30);
		this.panel.add(this.leagueText);
		
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(150,0,300,280);
		this.panel.add(this.imgLabel);
		
		//Back Button
		this.backButton = new JButton("Back");
		this.backButton.setBounds(160,610,80,20);
		this.panel.add(this.backButton);
		
		this.backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				addPlayer.this.setVisible(false);
				AdminPage adp = new AdminPage();
				adp.setVisible(true);
			}			
		});
		
		
		//Close Button
		this.closeButton = new JButton("Close");
		this.closeButton.setBounds(360,610,80,20);
		this.panel.add(this.closeButton);
		
		this.closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}			
		});
		
		
		//ADD Button
		this.addButton = new JButton("ADD");
		this.addButton.setBounds(260,610,80,20);
		this.panel.add(this.addButton);
		this.addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				if(firstNameText.getText().equals("")||lastNameText.getText().equals("")||positionText.getText().equals("")||jerseyText.getText().equals("")||goalsText.getText().equals("")||clubText.getText().equals("")||countryText.getText().equals("")||leagueText.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Can't Leave any field empty!");
				}
				
				else
				{
					String fname = firstNameText.getText().toString();
					String lname = lastNameText.getText().toString();
					String position = positionText.getText().toString();
					String sJersey = jerseyText.getText();
					int jersey = Integer.parseInt(sJersey);
					String sGoals = goalsText.getText();
					int goals = Integer.parseInt(sGoals);
					String club = clubText.getText().toString();
					String country = countryText.getText().toString();
					String league = leagueText.getText().toString();

					
					DataAccess das = new DataAccess();
					das.setNewPlayer(fname,lname,position,jersey,goals,club,country,league);
				
					JOptionPane.showMessageDialog(null,"Player Add Successful");
				
					addPlayer.this.setVisible(false);
					AdminPage apg = new AdminPage();
					apg.setVisible(true);
				}
			}
		});
		
		this.setSize(600,700);
		this.setTitle("Football++");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
