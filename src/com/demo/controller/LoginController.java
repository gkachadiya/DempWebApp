/* Created by: Ghanshyam Kachhadiya
   Create Date: 28.12.2015
*/
package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.demo.bean.User;
import com.demo.constant.CommonConstant;
import com.demo.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String email = request.getParameter(CommonConstant.email);
		String password = request.getParameter(CommonConstant.password);
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		LoginService loginService = new LoginService();
		if (loginService.isValidUser(user)) {
			HttpSession session = request.getSession();
			session.setAttribute(CommonConstant.user, user);
			response.sendRedirect("pages/home.jsp");
		} else {
			response.sendRedirect("pages/login.jsp?msg="+CommonConstant.inValidUser);
		}
	}

}
