import java.sql.*;
import java.util.*;
public class DataAccess {
	private Connection con;
	private Statement stm;
	
	public DataAccess() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String conStr = "jdbc:mysql://localhost:3306/football++";
			this.con = DriverManager.getConnection(conStr, "root", "");
			this.stm = this.con.createStatement();
		}catch(Exception ex){}
	}
	
	public void setNewPlayer(String fname,String lname,String position,int jersey,int goals,String club,String country,String league)
	{
		String sql = "Insert into playerdb (fname,lname,position,jersey,goals,club,country,league) values ('"+fname+"','"+lname+"','"+position+"',"+jersey+","+goals+",'"+club+"','"+country+"','"+league+"')";
		try
		{
			this.stm.executeUpdate(sql);
			
		}catch(Exception ex){
			ex.printStackTrace(); 
		}
	}
	

	public void deletePlayer(String name)
	{
		String sql = "Delete from playerdb where LNAME = '"+name+"'";
		try
		{
			this.stm.executeUpdate(sql);
			
		}catch(Exception ex){
			ex.printStackTrace(); 
		}
	}
	
	//Player Info
	public Vector<Vector<String>> getAllPlayers(String name)
	{
		String sql = "Select * from playerdb where LNAME like '"+name+"%'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("FNAME"));
				players.add(rs.getString("LNAME"));
				players.add(rs.getString("JERSEY"));
				players.add(rs.getString("GOALS"));
				players.add(rs.getString("CLUB"));
				players.add(rs.getString("LEAGUE"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}
	
	
	//EPL Table,Goals,Assists - Start
	
	//EPL Table 2013-'14
	public Vector<Vector<String>> getTable1314()
	{
		String sql = "Select * from epl_table where season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}
	
	//EPL Table 2014-'15
	public Vector<Vector<String>> getTable1415()
	{
		String sql = "Select * from epl_table where season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//EPL Goals 2013-'14
	public Vector<Vector<String>> getGoals1314()
	{
		String sql = "Select * from epl_goal where g_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//EPL Goals 2014-'15
	public Vector<Vector<String>> getGoals1415()
	{
		String sql = "Select * from epl_goal where g_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//EPL Assists 2013-'14
	public Vector<Vector<String>> getAssists1314()
	{
		String sql = "Select * from epl_assist where a_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//EPL Assists 2014-'15
	public Vector<Vector<String>> getAssists1415()
	{
		String sql = "Select * from epl_assist where a_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//EPL Table,Goals,Assists - End
	
	
	
	//La Liga Table,Goals,Assists - Start
	
	//La Liga Table 2013-'14
	public Vector<Vector<String>> getLigaTable1314()
	{
		String sql = "Select * from laliga_table where season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}
	
	//La Liga Table 2014-'15
	public Vector<Vector<String>> getLigaTable1415()
	{
		String sql = "Select * from laliga_table where season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//La Liga Goals 2013-'14
	public Vector<Vector<String>> getLigaGoals1314()
	{
		String sql = "Select * from laliga_goal where g_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//La Liga Goals 2014-'15
	public Vector<Vector<String>> getLigaGoals1415()
	{
		String sql = "Select * from laliga_goal where g_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//La Liga Assists 2013-'14
	public Vector<Vector<String>> getLigaAssists1314()
	{
		String sql = "Select * from laliga_assist where a_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//La Liga Assists 2014-'15
	public Vector<Vector<String>> getLigaAssists1415()
	{
		String sql = "Select * from laliga_assist where a_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//La Liga Table,Goals,Assists - End
	
	
	//Bundesliga Table,Goals,Assists - Start
	
	//Bundesliga Table 2013-'14
	public Vector<Vector<String>> getBundesligaTable1314()
	{
		String sql = "Select * from bundesliga_table where season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}
	
	//Bundesliga Table 2014-'15
	public Vector<Vector<String>> getBundesligaTable1415()
	{
		String sql = "Select * from bundesliga_table where season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("position"));
				players.add(rs.getString("club"));
				players.add(rs.getString("played"));
				players.add(rs.getString("points"));
				players.add(rs.getString("gd"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//Bundesliga Goals 2013-'14
	public Vector<Vector<String>> getBundesligaGoals1314()
	{
		String sql = "Select * from bundesliga_goal where g_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//Bundesliga Goals 2014-'15
	public Vector<Vector<String>> getBundesligaGoals1415()
	{
		String sql = "Select * from bundesliga_goal where g_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("g_position"));
				players.add(rs.getString("g_name"));
				players.add(rs.getString("g_goals"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//Bundesliga Assists 2013-'14
	public Vector<Vector<String>> getBundesligaAssists1314()
	{
		String sql = "Select * from bundesliga_assist where a_season = '2013-2014'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//Bundesliga Assists 2014-'15
	public Vector<Vector<String>> getBundesligaAssists1415()
	{
		String sql = "Select * from bundesliga_assist where a_season = '2014-2015'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			Vector<Vector<String>> playerlist = new Vector<Vector<String>>();
			rs.last();
			System.out.println(rs.getRow() + "");
			rs.beforeFirst();
			while(rs.next())
			{
				Vector<String> players = new Vector<String>();
				players.add(rs.getString("a_position"));
				players.add(rs.getString("a_name"));
				players.add(rs.getString("a_assists"));
				playerlist.add(players);
			}
			return playerlist;
			
		}catch(Exception ex){
			ex.printStackTrace(); 
			return null;
		}
	}

	//Bundesliga Table,Goals,Assists - End
	
}