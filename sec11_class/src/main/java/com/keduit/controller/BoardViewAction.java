package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 상세조회화면으로
		String url = "board/boardView.jsp";
		
		String num = request.getParameter("num");
		
		// db 접근 준비
		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.updateReadCount(num); // 게시글수 1 증가 시키기
		BoardVO bVO = bDAO.selectOne(num); // 해당 게시글 상세 정보 가져오기
		
		System.out.println("상세 결과 확인 : " + bVO);
		request.setAttribute("board", bVO);
		
		//response.sendRedirect(url);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
