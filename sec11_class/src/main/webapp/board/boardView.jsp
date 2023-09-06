<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내용보기</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>게시글 등록</h1>
		<form name="frm" method="post" action="BoardServlet">
			<input type="hidden" name="command" value="board_update">
			<table>
				<tr>
					<th>작성자</th>
					<td>${board.name}<!-- <input id="iname" type="text" name="name" readonly="readonly"> --></td>
					<th>이메일</th>
					<td>${board.email}<!-- <input type="email" name="email" readonly="readonly">--></td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td><fmt:formatDate>${board.writedate}</fmt:formatDate></td>
					<th>조회수</th>
					<td>${board.readcount}<!-- <input type="text" name="readcount" readonly="readonly"> --></td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="3">${board.title} <!-- <input type="text" name="title" size="70" required="required" readonly="readonly">* 필수 --></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="3">${board.content} <!-- <textarea name="content" rows="15" cols="70" readonly="readonly"></textarea> --></td>
				</tr>
			</table>
			<br> <br> <input type="button" value="게시글 수정"
				onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')">
			<input type="button" value="게시글 삭제"
				onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')">
			<input type="button" value="게시글 리스트"
				onclick="location.href='BoardServlet?command=board_list'"> <input
				type="button" value="게시글 등록"
				onclick="location.href='BoardServlet?command=board_write_form'">
		</form>
	</div>
</body>
</html>