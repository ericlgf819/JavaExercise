package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class SQLiteTest implements IExample {

	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.JDBC");
		try (Connection con = DriverManager.getConnection("jdbc:sqlite:bin/res/mydb.db")) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from testtb");
			
			ResultSetMetaData schema = rs.getMetaData();
			int iColumnCount = schema.getColumnCount();
			for (int i = 1; i <= iColumnCount; ++i) {
				System.out.print(String.format("%s\t", schema.getColumnName(i)));
			}
			System.out.println();
			
			while (rs.next()) {
				for (int i = 1; i <= iColumnCount; ++i) {
					System.out.print(String.format("%s\t", rs.getString(i)));
				}
				System.out.println();
			}	
		}
	}

}
