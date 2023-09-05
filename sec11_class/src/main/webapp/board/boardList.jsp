<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
</head>
<body>
<div id="wrap" align="center">
  <h1>게시판 목록</h1>
  <table class="list">
    <tr>
      <td colspan="5" style="border:white; text-align:right">
        <a href="BoardServlet?command=board_write_form" > 게시글 등록 </a> 
      </td>
    </tr>
    <tr>
      <th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
    </tr>
  
  
  </table>
</div>
</body>
</html>