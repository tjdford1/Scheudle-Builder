package schedule;

import java.sql.SQLException;

public class CourseCatalog extends Catalog {
	
	public CourseCatalog(){
		super();
	}
	
	public CourseCatalog(String statement){
		super(statement);
	}
	
	public String getItems() throws SQLException{
		return getRs().getString("course") + " " + getRs().getString("title") ;
	}
}
