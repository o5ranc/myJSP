<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set Cookies</title>
</head>
<body>
<%
Cookie c = new Cookie("id", "keduit");
c.setMaxAge(365 * 24 * 60 * 60); // 기한 설정, 365일
response.addCookie(c);
response.addCookie(new Cookie("pwd", "test1234"));
response.addCookie(new Cookie("age", "20"));
%>
<h1>쿠키 설정</h1>
</body>
</html>