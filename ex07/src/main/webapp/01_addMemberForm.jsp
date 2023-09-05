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
	<form name="frm" id="reg_frm" method="GET" action="02_addMember.jsp">
		<label for="name">이름</label><span> * </span> 
		<input type="text" name="name" id="name" required><br> 
		
		<label for="userid"> 아이디 </label><span> * </span> 
		<input type="text" id="userid" name="userid" required><br> 
	
		<label for="pwd"> 비밀번호 </label><span> * </span>
		<input type="password" id="pwd" name="pwd" required><br>
		
		<label for="email">이메일 </label> &nbsp; 
		<input type="email" name="email" required>
		
		<label for="phone">전화번호 </label> &nbsp; 
		<input type="tel" name="phone" required>
		
		<label for="admin">권한 </label> &nbsp; 
		<input type="radio" name="admin" value="1">관리자
		<input type="radio" name="admin" value="0">일반회원
		
		<input type="submit" value="등록" /> 
		<input type="reset" value="취소" />
	</form>
</body>
</html>