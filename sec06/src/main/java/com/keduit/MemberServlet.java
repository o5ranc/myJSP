package com.keduit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = new MemberBean();
		// 1. 한글처리
		request.setCharacterEncoding("UTF-8");
		// 2. 이름 및 정보 받아서 MemberBean(member) 객체에 담기
		member.setName(request.getParameter("name"));
		member.setId(request.getParameter("id"));
		member.setPwd(request.getParameter("pwd"));
		member.setNickname(request.getParameter("nickname"));
		
		// forward 방식의 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("05_elMember.jsp");
		dispatcher.forward(request, response);
	}

}
