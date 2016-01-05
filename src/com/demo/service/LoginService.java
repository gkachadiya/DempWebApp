/* Created by: Ghanshyam Kachhadiya
   Create Date: 28.12.2015
*/
package com.demo.service;

import com.demo.bean.User;
import com.demo.dao.LoginDao;

public class LoginService {

	public boolean isValidUser(User user) {
		LoginDao dao = new LoginDao();
		return dao.isValidUser(user);
	}
}
