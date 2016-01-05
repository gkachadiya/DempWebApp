/* Created by: Ghanshyam Kachhadiya
   Create Date: 28.12.2015
*/
package com.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.demo.bean.User;
import com.demo.utility.DatabaseConnection;

public class LoginDao {

	public boolean isValidUser(User user) {
		try {
			Connection conn = DatabaseConnection.getConnection();
			Statement statement = (Statement) conn.createStatement();

			ResultSet resultset = statement
					.executeQuery("select count(*) as totalCount from users where email = '"
							+ user.getEmail()
							+ "' and password = '"
							+ user.getPassword() + "'");
			while (resultset.next()) {
				return resultset.getInt("totalCount") > 0 ? true : false;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
