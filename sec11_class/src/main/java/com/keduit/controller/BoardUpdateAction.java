package com.keduit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String url = "board/boardList.jsp";
		String url = "BoardServlet?command=board_list";
		
		BoardDAO bDAO = BoardDAO.getInstance();
		BoardVO bVO = new BoardVO();
		bVO.setNum(Integer.parseInt(request.getParameter("num")));
		bVO.setName(request.getParameter("name"));
		bVO.setTitle(request.getParameter("title"));
		bVO.setPass(request.getParameter("pass"));
		bVO.setEmail(request.getParameter("email"));
		bVO.setContent(request.getParameter("content"));
		
		bDAO.updateBoard(bVO);
		
		/* 리스트 정보 넘기기? 
		List<BoardVO> boardList = bDAO.selectAllBoards();
		request.setAttribute("boardList", boardList); */
				
		response.sendRedirect(url);
	}
}
