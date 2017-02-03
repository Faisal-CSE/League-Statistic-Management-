import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class laliga extends JFrame {
	private JPanel panel;
	private JComboBox statCombo,seasonCombo;
	private JButton confirmButton,closeButton,backButton;
	private JLabel welcomeLabel,statLabel,seasonLabel,imgLabel;
	private ImageIcon image;
	
	public laliga()
	{
		//Setting the Panel
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//La Liga Image
		this.image = new ImageIcon(getClass().getResource("laliga.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(140,0,300,300);
		this.panel.add(this.imgLabel);
		
		
		//Welcome Label
		this.welcomeLabel = new JLabel("Welcome!");
		this.welcomeLabel.setBounds(190,190,300,200);
		this.welcomeLabel.setFont(new Font("Serif", Font.BOLD, 50));
		this.panel.add(this.welcomeLabel);
		
		
		//Season Select - Label
		this.seasonLabel = new JLabel("Select Desired Season");
		this.seasonLabel.setBounds(30,320,250,100);
		this.seasonLabel.setFont(new Font("Serif", Font.BOLD, 20));
		this.panel.add(this.seasonLabel);
		
		
		//Stats Select - Combo Box
		String season[] = new String[]{"Select a Season", "2013-'14", "2014-'15"};
				
		this.seasonCombo = new JComboBox(season);
		this.seasonCombo.setBounds(320,360,200,30);
		this.panel.add(this.seasonCombo);
		
		
		//Stats Select - Label
		this.statLabel = new JLabel("Select Your Desired Stats");
		this.statLabel.setBounds(30,370,250,100);
		this.statLabel.setFont(new Font("Serif", Font.BOLD, 20));
		this.panel.add(this.statLabel);
		
		
		//Stats Select - Combo Box
		String stats[] = new String[]{"Select a Stat", "League Table", "Most Goals", "Most Assists"};
		
		this.statCombo = new JComboBox(stats);
		this.statCombo.setBounds(320,410,200,30);
		this.panel.add(this.statCombo);
		
		
		
		//Back Button
		this.backButton = new JButton("Back");
		this.backButton.setBounds(160,510,80,20);
		this.panel.add(this.backButton);
		
		this.backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				laliga.this.setVisible(false);
				Welcome wc = new Welcome();
				wc.setVisible(true);
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
		
		
		//Confirm Button
		this.confirmButton = new JButton("Confirm");
		this.confirmButton.setBounds(260,510,80,20);
		this.panel.add(this.confirmButton);
		this.confirmButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String stat = statCombo.getSelectedItem().toString();
				String season = seasonCombo.getSelectedItem().toString();
				
				if(stat == "League Table" && season == "2013-'14"){
					laliga.this.setVisible(false);
					String seasonStat = "13-'14 La Liga Table";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);
					
				}
				
				else if(stat == "Most Goals" && season == "2013-'14"){
					laliga.this.setVisible(false);
					String seasonStat = "13-'14 La Liga Goals";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);
					
				}
				
				else if(stat == "Most Assists" && season == "2013-'14"){
					laliga.this.setVisible(false);
					String seasonStat = "13-'14 La Liga Assists";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);
				}
				
				else if(stat == "League Table" && season == "2014-'15"){
					laliga.this.setVisible(false);
					String seasonStat = "14-'15 La Liga Table";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);					
				}
				
				else if(stat == "Most Goals" && season == "2014-'15"){
					laliga.this.setVisible(false);
					String seasonStat = "14-'15 La Liga Goals";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);
				}
				
				else if(stat == "Most Assists" && season == "2014-'15"){
					laliga.this.setVisible(false);	
					String seasonStat = "14-'15 La Liga Assists";
					DisplayFrame disf = new DisplayFrame(seasonStat);
					disf.setVisible(true);					
				}

				else if((stat == "Select a Stat" && season == "Select a Season") || season == "Select a Season" || stat == "Select a Stat"){
					JOptionPane.showMessageDialog(laliga.this, "Please! Select league & stat before pressing 'Confirm'.");	
				}
			}
		});
		
		
		//Setting Size,Title and Close Operation
		this.setTitle("Football++");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
