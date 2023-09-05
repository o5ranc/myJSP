package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.keduit.dao.MemberDAO;
import com.keduit.dto.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do") // login.jsp 에서 여기로 진입하기위한 경로명
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 주소는 위에 @WebServlet("/login.do") 부분의 login.do가 보여지고 실제 내용은 아래 member/login.jsp 보여짐
		RequestDispatcher dispatcher =request.getRequestDispatcher("member/login.jsp"); // 연결
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO mDAO = MemberDAO.getInstance();
		
		int result = mDAO.userCheck(userid, pwd);
		
		if(result == 1) {
			MemberVO memberVO = mDAO.getMember(userid);
			HttpSession session = request.getSession();
			request.setAttribute("loginUser", memberVO);
			request.setAttribute("message", "회원 로그인 성공");
			url = "main.jsp";
		} else if(result == 0) {
			request.setAttribute("message", "비밀번호가 맞지 않아요.");
		} else {
			request.setAttribute("message", "id를 확인해주세요.");
		}
		
		// url로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
