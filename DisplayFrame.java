import java.util.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import javax.swing.table.DefaultTableModel;

public class DisplayFrame extends JFrame implements KeyListener {
	
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel;
	private String name;
	private JTextField text;
	private JLabel searchLabel,imgLabel;
	private JButton searchButton;
	private ImageIcon image;
	private JButton backButton,closeButton;
	
	public DisplayFrame(String name){
		this.name = name;
		this.initializeComponents();
	}
	
	private void initializeComponents() {
		
		this.panel = new JPanel();
		this.panel.setLayout(null);

		//Football++ Image
		this.image = new ImageIcon(getClass().getResource("FootballImage.png"));
		
		this.imgLabel = new JLabel (image);
		this.imgLabel.setBounds(140,0,300,300);
		this.panel.add(this.imgLabel);		
		
		
//EPL Table,Goals,Assists - Start
		
		//EPL Table 2013-'14
		if(name == "13-'14 EPL Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getTable1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};		
		}
		
		
		//EPL Table 2014-'15
		else if(name == "14-'15 EPL Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getTable1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
		}
		
		//EPL Goals 2013-'14
		else if(name == "13-'14 EPL Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getGoals1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
			
		}
		
		//EPL Goals 2014-'15
		else if(name == "14-'15 EPL Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getGoals1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};	
		}
		
		//EPL Assists 2013-'14
		else if(name == "13-'14 EPL Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getAssists1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
			
		}
		
		//EPL Assists 2014-'15
		else if(name == "14-'15 EPL Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getAssists1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
			
		}
	
//EPL Table,Goals,Assists - End
		
		
//La Liga Table,Goals,Assists - Start	
		
		//La Liga Table 2013-'14
		else if(name == "13-'14 La Liga Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
					
			DataAccess data = new DataAccess();
					
			this.tableModel = new DefaultTableModel(data.getLigaTable1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};		
		}
					
				
		//La Liga Table 2014-'15
		else if(name == "14-'15 La Liga Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
					
			DataAccess data = new DataAccess();
					
			this.tableModel = new DefaultTableModel(data.getLigaTable1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
		}
				
		//La Liga Goals 2013-'14
		else if(name == "13-'14 La Liga Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
					
			DataAccess data = new DataAccess();
					
			this.tableModel = new DefaultTableModel(data.getLigaGoals1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};			
		}
					
		//La Liga Goals 2014-'15
		else if(name == "14-'15 La Liga Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
				
			DataAccess data = new DataAccess();
				
			this.tableModel = new DefaultTableModel(data.getLigaGoals1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};	
		}
					
		//La Liga Assists 2013-'14
		else if(name == "13-'14 La Liga Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
						
			DataAccess data = new DataAccess();
					
			this.tableModel = new DefaultTableModel(data.getLigaAssists1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};						
		}
					
		//La Liga Assists 2014-'15
		else if(name == "14-'15 La Liga Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
				
			DataAccess data = new DataAccess();
				
			this.tableModel = new DefaultTableModel(data.getLigaAssists1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};	
		}
					
//La Liga Table,Goals,Assists - End
		

//Bundesliga Table,Goals,Assists - Start	
		
		//Bundesliga Table 2013-'14
		else if(name == "13-'14 bundesliga Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
							
			DataAccess data = new DataAccess();
							
			this.tableModel = new DefaultTableModel(data.getBundesligaTable1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};		
		}
							
						
		//Bundesliga Table 2014-'15
		else if(name == "14-'15 bundesliga Table")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Club Name");
			columns.add("Played");
			columns.add("Points");
			columns.add("GD");
							
			DataAccess data = new DataAccess();
							
			this.tableModel = new DefaultTableModel(data.getBundesligaTable1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
		}
						
		//Bundesliga Goals 2013-'14
		else if(name == "13-'14 bundesliga Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
							
			DataAccess data = new DataAccess();
							
			this.tableModel = new DefaultTableModel(data.getBundesligaGoals1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};			
		}
							
		//Bundesliga Goals 2014-'15
		else if(name == "14-'15 bundesliga Goals")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Goals");
						
			DataAccess data = new DataAccess();
						
			this.tableModel = new DefaultTableModel(data.getBundesligaGoals1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};	
		}
							
		//Bundesliga Assists 2013-'14
		else if(name == "13-'14 bundesliga Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
								
			DataAccess data = new DataAccess();
							
			this.tableModel = new DefaultTableModel(data.getBundesligaAssists1314(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};						
		}
							
		//Bundesliga Assists 2014-'15
		else if(name == "14-'15 bundesliga Assists")
		{
			Vector<String> columns = new Vector<String>();
			columns.add("Position");
			columns.add("Name");
			columns.add("Assists");
						
			DataAccess data = new DataAccess();
						
			this.tableModel = new DefaultTableModel(data.getBundesligaAssists1415(), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};	
		}
							
//Bundesliga Table,Goals,Assists - End		

		
		//Player Info - JTable
		else
		{
			Vector<String> columns = new Vector<String>();
			columns.add("First Name");
			columns.add("Last Name");
			columns.add("Jersey");
			columns.add("Goals");
			columns.add("Club");
			columns.add("League");
			
			DataAccess data = new DataAccess();
			
			this.tableModel = new DefaultTableModel(data.getAllPlayers(name), columns);
			this.table = new JTable(this.tableModel)
			{
				public boolean isCellEditable(int row, int column)
				{
					return false;
				}
			};
		}
		
		
		//Player Search - Label
		this.searchLabel = new JLabel("Search Another Player");
		this.searchLabel.setBounds(60,380,250,100);
		this.searchLabel.setFont(new Font("Serif", Font.BOLD, 22));
		this.panel.add(this.searchLabel);
		
		
		//Player Search - TextField
		this.text = new JTextField();
		this.text.setBounds(330,420,180,30);
		this.panel.add(this.text);
		this.text.addKeyListener(this);
		
		//Scrollpane for Table
		this.scrollPane = new JScrollPane(this.table);
		this.scrollPane.setBounds(0, 300, 590, 100);
		this.panel.add(this.scrollPane);
		
		//Back Button
		this.backButton = new JButton("Back");
		this.backButton.setBounds(170,510,80,20);
		this.panel.add(this.backButton);
		
		this.backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				DisplayFrame.this.setVisible(false);
				Welcome wc = new Welcome();
				wc.setVisible(true);
			}			
		});
		
		//Close Button
		this.closeButton = new JButton("Close");
		this.closeButton.setBounds(310,510,80,20);
		this.panel.add(this.closeButton);
		
		this.closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				DisplayFrame.this.setVisible(false);
			}			
		});
		
		this.add(this.panel);
		this.setSize(600, 600);
		this.setTitle("Football++");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	@Override
	public void keyPressed(KeyEvent evt) {
		// TODO Auto-generated method stub
		Vector<String> columns = new Vector<String>();
		columns.add("First Name");
		columns.add("Last Name");
		columns.add("Jersey");
		columns.add("Goals");
		columns.add("Club");
		columns.add("League");
		String name = this.text.getText();
		DataAccess data = new DataAccess();
		DisplayFrame.this.tableModel.setDataVector(data.getAllPlayers(name), columns);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	
}