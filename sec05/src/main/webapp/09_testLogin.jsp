<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id="keduit";
String pwd="12345";
String name="한정교";

if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
	session.setAttribute("loginUser", name); // 세션정보 세팅
	response.sendRedirect("10_main.jsp");
} else {
	response.sendRedirect("08_loginForm.jsp");
}

%>
</body>
</html>