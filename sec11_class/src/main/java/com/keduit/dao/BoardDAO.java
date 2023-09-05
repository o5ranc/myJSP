package com.keduit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.keduit.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO(); 
	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {
		
		List<BoardVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql ="select * from board order by num desc"; 
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BoardVO bVO = new BoardVO();
				
				bVO.setNum(rs.getInt("num"));
				bVO.setName(rs.getString("name"));
				bVO.setEmail(rs.getString("email"));
				bVO.setPass(rs.getString("pass"));
				bVO.setTitle(rs.getString("title"));
				bVO.setContent(rs.getString("content"));
				bVO.setReadcount(rs.getInt("readcount"));
				bVO.setWritedate(rs.getTimestamp("writedate"));
				
				list.add(bVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		
		return list;
	}
	//insert into board values(board_seq.nextval,
	//'1234', '홍자바', 'hong@abc.com', '게시글1번입니다.','게시글1번 홍길동이 남김', 0, default);
	public void insertBoard(BoardVO bVO) {
		String sql = "insert into board("
				+ "num, name, email, pass, title, content) "
				+ "values(board_seq.nextval, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bVO.getName());
			pstmt.setString(2, bVO.getEmail());
			pstmt.setString(3, bVO.getPass());
			pstmt.setString(4, bVO.getTitle());
			pstmt.setString(5, bVO.getContent());
			
			pstmt.executeUpdate();
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
}



