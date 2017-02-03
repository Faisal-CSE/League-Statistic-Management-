import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Welcome extends JFrame {
	private JPanel panel;
	private JComboBox combo;
	private JButton backButton,closeButton,goButton;
	private JLabel welcomeLabel,leagueLabel,imgLabel,textLabel;
	private ImageIcon image;
	private JTextField text;
	
	public Welcome()
	{
		//Setting the Panel
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(150,0,300,300);
		this.panel.add(this.imgLabel);
		
		
		//Welcome - Label
		this.welcomeLabel = new JLabel("Welcome!");
		this.welcomeLabel.setBounds(190,200,300,200);
		this.welcomeLabel.setFont(new Font("Serif", Font.BOLD, 50));
		this.panel.add(this.welcomeLabel);
		
		
		//Player Search - Label
		this.textLabel = new JLabel("Search Desired Player");
		this.textLabel.setBounds(30,350,250,100);
		this.textLabel.setFont(new Font("Serif", Font.BOLD, 22));
		this.panel.add(this.textLabel);
		
		
		//Player Search - TextField
		this.text = new JTextField();
		this.text.setBounds(310,390,150,30);
		this.panel.add(this.text);
		
		
		//Player Search - Go Button
		this.goButton = new JButton("Go!");
		this.goButton.setBounds(470,390,70,30);
		this.panel.add(this.goButton);
		this.goButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String name = text.getText();
				Welcome.this.setVisible(false);
				DisplayFrame df = new DisplayFrame(text.getText());
				df.setVisible(true);
			}
		});
		
		
		//League Select - Label
		this.leagueLabel = new JLabel("Select Desired League");
		this.leagueLabel.setBounds(30,410,280,100);
		this.leagueLabel.setFont(new Font("Serif", Font.BOLD, 22));
		this.panel.add(this.leagueLabel);
		
		//League Select - Combo Box
		String league[] = new String[]{"Select a League","English Premier League", "Spanish La Liga", "German Bundesliga"};
		
		this.combo = new JComboBox(league);
		this.combo.setBounds(310,450,230,30);
		this.panel.add(this.combo);
		
		this.combo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Welcome.this.combo.getSelectedItem().equals("English Premier League")){
					epl ep = new epl();
					ep.setVisible(true);
					Welcome.this.setVisible(false);	
				}
				
				else if(Welcome.this.combo.getSelectedItem().equals("Spanish La Liga")){
					laliga l = new laliga();
					l.setVisible(true);
					Welcome.this.setVisible(false);	
				}
				
				else if(Welcome.this.combo.getSelectedItem().equals("German Bundesliga")){
					bundesliga b = new bundesliga();
					b.setVisible(true);
					Welcome.this.setVisible(false);	
				}
				
				else if(Welcome.this.combo.getSelectedItem().equals("Select a League")){
					JOptionPane.showMessageDialog(Welcome.this, "Please! Select a league from below.");	
				}
			}
		});

		
		//Close Button
		this.closeButton = new JButton("Close");
		this.closeButton.setBounds(320,510,80,20);
		this.panel.add(this.closeButton);
		
		this.closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}			
		});
		
		
		//Back Button
		this.backButton = new JButton("Back");
		this.backButton.setBounds(170,510,80,20);
		this.panel.add(this.backButton);
		this.backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Welcome.this.setVisible(false);
				Select slct = new Select();
				slct.setVisible(true);
			}
		});
		

		
		//Setting Size,Title and Close Operation
		this.setTitle("Football++");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
