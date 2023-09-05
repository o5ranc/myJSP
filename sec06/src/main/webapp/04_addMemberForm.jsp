<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
<link href="./css/join.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./js/join.js"></script>
</head>
<body>
<h3>회원 정보 입력</h3>
<%-- MemberServlet 으로 가는걸로 --%>
<form name="frm" id="reg_frm" method="POST" action="MemberServlet">
	<label for="name">이름</label><span> * </span> 
	<input type="text"
		name="name" id="name" value="김정보" required><br>
	<label for="id"> 아이디 </label><span> * </span>
	<input type="text" id="id" name="id" value="pinksung" required><br>
	<label for="pwd"> 비밀번호 </label><span> * </span>
	<input type="password" id="pwd" name="pwd" value="1234" required><br> 
	<label for="nickname">닉네임 </label> &nbsp; 
	<input type="text" name="nickname" value="pinksung">
	<input type="submit" value="등록"/>
	<input type="reset" value="취소"/>
	<%-- @ include file="./05_footer.jsp"--%>
</form>
</body>
</html>