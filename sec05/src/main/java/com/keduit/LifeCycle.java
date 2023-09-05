package com.keduit;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

    int initCount = 1;
    int doGetCount = 1;
    int destoryCount = 1;
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init메소드는 첫 요청만 호출됨 : " + initCount++);
	}

	public void destroy() {
		System.out.println("destroy 메소드는 톰켓이 종료될 때 호출됨 : " + destoryCount++);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드가 호출됨 : " + doGetCount++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
