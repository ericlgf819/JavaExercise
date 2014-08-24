package test;

import java.sql.Date;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;

public class ORMLitePlay implements IExample {

	@DatabaseTable(tableName = "testtb")
	public static class MyDTO {
		@DatabaseField(id = true, columnName = "id", canBeNull = false)
		private int idnum;
		
		@DatabaseField(columnName = "value")
		private String val;
		
		@DatabaseField(columnName = "name")
		private String name;
		
		@DatabaseField(columnName = "time")
		private Date time;
		
		public int getIdnum() {
			return idnum;
		}

		public void setIdnum(int idnum) {
			this.idnum = idnum;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getTime() {
			return time;
		}

		public void setTime(Date time) {
			this.time = time;
		}
	}
	
	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.JDBC");
		ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:sqlite:bin/res/mydb.db");
		Dao<MyDTO, Integer> mydtoDao = DaoManager.createDao(connectionSource, MyDTO.class);
		MyDTO ret = mydtoDao.queryForId(2);
	}

}
