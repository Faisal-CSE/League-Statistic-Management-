import java.sql.*;

class LoginAccess
{
	private Connection con;
	private Statement stm;
	public LoginAccess()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String conStr = "jdbc:mysql://localhost:3306/football++";
			this.con = DriverManager.getConnection(conStr, "root", "");
			this.stm = this.con.createStatement();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public boolean isUserValid(String username, String password)
	{
		String sql = "Select * from admin_login where username='"+username+"' and password='"+password+"'";
		try
		{
			ResultSet rs = this.stm.executeQuery(sql);
			return rs.next();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
}