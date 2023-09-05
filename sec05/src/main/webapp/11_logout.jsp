<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
<%
session.invalidate(); // 세션을 모두 지우기
%>
<script>
	alert("로그아웃 되었습니다.");
	location.href="08_login.jsp"
</script>
</body>
</html>