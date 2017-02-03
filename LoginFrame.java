import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

class LoginFrame extends JFrame
{
	private JPanel panel;
	private JLabel labelUsername, labelPassword;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton buttonLogin, buttonBack;
	private JLabel labelImg;
	private ImageIcon image;
	
	
	public LoginFrame()
	{
		//Setting the Panel
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.add(this.panel);
		
		
		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.labelImg = new JLabel (image);
		this.labelImg.setBounds(100,0,400,400);
		this.panel.add(this.labelImg);
		
		
		//Username Label
		this.labelUsername = new JLabel("USERNAME");
		this.labelUsername.setBounds(80, 400, 150, 30);
		this.labelUsername.setFont(new Font("Serif", Font.BOLD, 25));
		this.panel.add(this.labelUsername);
		
		
		//Username TextField
		this.textUsername = new JTextField();
		this.textUsername.setBounds(300, 400, 210, 30);
		this.panel.add(this.textUsername);
		
		
		//Password Label
		this.labelPassword = new JLabel("PASSWORD");
		this.labelPassword.setBounds(80, 450, 1500, 30);
		this.labelPassword.setFont(new Font("Serif", Font.BOLD, 25));
		this.panel.add(this.labelPassword);
		
		
		//Password PasswordField
		this.textPassword = new JPasswordField();
		this.textPassword.setBounds(300, 450, 210, 30);
		this.panel.add(this.textPassword);
		
		
		//Back Button
		this.buttonBack = new JButton("Back");
		this.buttonBack.setBounds(200,510,80,20);
		this.panel.add(this.buttonBack);
		this.buttonBack.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				LoginFrame.this.setVisible(false);
				Select slct = new Select();
				slct.setVisible(true);
			}
		});
		
		
		//Login Button
		this.buttonLogin = new JButton("Login");
		this.buttonLogin.setBounds(300,510,80,20);
		this.panel.add(this.buttonLogin);
		this.buttonLogin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String username = textUsername.getText();
				String password = textPassword.getText();
				LoginAccess data = new LoginAccess();
				if(data.isUserValid(username, password) == true)
				{
					LoginFrame.this.setVisible(false);
					AdminPage ap = new AdminPage();
					ap.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			}
		});
		
		
		
		//Setting Size,Title and Close Operation
		this.setTitle("Football++");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}