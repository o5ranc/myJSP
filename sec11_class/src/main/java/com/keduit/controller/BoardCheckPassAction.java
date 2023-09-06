package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		BoardDAO bDAO = BoardDAO.getInstance();
		BoardVO bVO = bDAO.selectOne(num);
		
		if(pass.equals(bVO.getPass())) { // 비밀번호 일치
			url = "board/checkSuccess.jsp";
		} else { // 비밀번호 불일치
			url = "board/boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
