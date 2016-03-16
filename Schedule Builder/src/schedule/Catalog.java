package schedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Catalog {
	
	private static String dbUrl = "jdbc:mysql://localhost:3306/Catalog?autoReconnect=true&useSSL=false";
	private static String user = "cpsc224";		
	private static String pass = "password";
	private ArrayList<String> list;
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public Catalog(){
		this.conn = null;
		this.stmt = null;
		this.rs = null;
	}
	
	public Catalog(String statement){
		this();
		try {
			executeStmt(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void executeStmt(String statement) throws SQLException{
		
		try{
			
			conn = DriverManager.getConnection(dbUrl, user, pass);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(statement);
			
			list = new ArrayList<>();
			while(rs.next()){
				list.add(getItems());
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(rs != null)
				rs.close();
			
			if(stmt != null)
				stmt.close();
			
			if(conn != null)
				conn.close();
		}
	}
	
	public Object[] getList() {
		return list.toArray();
	}

	public String getItems() throws SQLException{
		return rs.getString("subject");
	}
	
	public ResultSet getRs() {
		return rs;
	}
	
	public static void main(String[] args){
		Catalog mySQL = new Catalog();
		try {
			mySQL.executeStmt("select distinct subject, title from Catalog");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Object str : mySQL.getList())
			System.out.println(str);
	}
}
