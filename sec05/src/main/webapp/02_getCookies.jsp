<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>클라이언트로 부터 얻어온 Cookies</h1>
<%
Cookie[] cookies = request.getCookies(); // 쿠키정보들을 갖고 옴
for(Cookie c : cookies) {
	out.println(c.getName() + " : " + c.getValue() + "<br>");
}
%>
</body>
</html>