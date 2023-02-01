package com.sombee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("page");
		switch(page) {
		case "home":
			request.setAttribute("title", "Home");
			request.setAttribute("body", "home.jsp");
			request.getRequestDispatcher("template.jsp").forward(request, response);
			break;
		case "dashboard":
			request.setAttribute("title", "Dashboard");
			request.setAttribute("body", "dashboard.jsp");
			request.getRequestDispatcher("template.jsp").forward(request, response);
			break;
			
		case "login":
			request.setAttribute("title", "Login");
			request.setAttribute("body", "login.jsp");
			request.getRequestDispatcher("template.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
