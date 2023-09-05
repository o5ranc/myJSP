package com.keduit.dao;

public class BoardDAO {
	private static BoardDAO instance = null;
	private BoardDAO() {}
	
	public static BoardDAO getInstance() {
		if(instance != null) {
			
		}
		return instance;
	}
}
