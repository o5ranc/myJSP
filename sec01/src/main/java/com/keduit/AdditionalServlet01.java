package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionalServlet01
 */
//@WebServlet("/AdditionalServlet01") // 주소가 왼쪽 처럼 들어올때, 현재 페이지 띄우게 정의
@WebServlet("/add") 
public class AdditionalServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L; // 통신할때 필요
   
// 현재 불필요
//    public AdditionalServlet01() {
//        super();
//    }
    
	// Get 방식 요청이오면 여기가 호출되며 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); // 타입을 적어줘야함
		
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>addtion</title></head>");
		out.println("<body>");
		// 톰캣은 문자를 1byte 처리 해서 웹페이지에서 깨지게 됨
		// 위에 response.setContentType("text/html;charset=UTF-8"); 추가 해야함
		out.println("<h1>계에사안기add</h1>");
		out.println(num1 + " + " + num2 + " = " + add);
		out.println("</body></html>");
	}

	// Post 방식 요청이오면 여기가 호출되며 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
