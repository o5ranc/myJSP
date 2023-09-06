package com.keduit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.BoardListAction;
import com.keduit.dao.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.deleteBoard(num);
		new BoardListAction().execute(request, response);
	}
}
