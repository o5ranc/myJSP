package com.keduit.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/board/boardList.jsp";
		String url_test = "BoardServlet?command=board_list";

		BoardDAO bDAO = BoardDAO.getInstance();
		BoardVO bVO = new BoardVO();
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("pass"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		
		bVO.setName(request.getParameter("name"));
		bVO.setEmail(request.getParameter("email"));
		bVO.setPass(request.getParameter("pass"));
		bVO.setTitle(request.getParameter("title"));
		bVO.setContent(request.getParameter("content"));
	
		
		bDAO.insertBoard(bVO);
		List<BoardVO> boardList = bDAO.selectAllBoards();
	
		request.setAttribute("boardList", boardList);
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
//		dispatcher.forward(request, response);
		response.sendRedirect(url_test);
	}
}
