package com.shyam.designpattern.singleton;

//import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {

	// static member holds only one instance of JDBCSingleton class
	private static JDBCSingleton jdbcSingleton = null;

	// creating private constructor to prevent instance creation outside the scope
	// of this class
	private JDBCSingleton() {
	}

	// method to provide global point of access
	public static JDBCSingleton getInstance() {

		if (jdbcSingleton == null) {
			synchronized (JDBCSingleton.class) {
				jdbcSingleton = new JDBCSingleton();
			}
		}
		return jdbcSingleton;
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "shyam@MYSQL@100");

		return con;
	}

	public int insert(String fname, String lname) throws SQLException {
		Connection c = null;
		java.sql.PreparedStatement ps = null;
		int recordCounter = 0;

		try {
			c = JDBCSingleton.getConnection();
			ps = c.prepareStatement("insert into user(firstName, lastName, userId) values(?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, "166");

			recordCounter = ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	public int delete(int id) {
		Connection con = null;
		java.sql.PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			con = jdbcSingleton.getConnection();
			ps = con.prepareStatement("delete from user where userId = " + id);
			recordCounter = ps.executeUpdate();
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	public void view(String name) {

		Connection con = null;
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select*from user where firstName like '%" + name + "'");
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.print("UserId:" + rs.getString(1) + "\n");
				System.out.print("FirstName:" + rs.getString(3) + "\n");
				System.out.print("LastName:" + rs.getString(4) + "\n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}