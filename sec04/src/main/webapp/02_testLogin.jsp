<%@page import="java.net.URLEncoder" %>
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

// sendRedirect 의 활용 

String id = "keduit";
String pwd = "12345";
String name = "한정교";

request.setCharacterEncoding("UTF-8");
if(id.equals(request.getParameter("id")) &&
		pwd.equals(request.getParameter("pwd"))) {
	// 한글처리해서 넣어주는 부분
	// URLEncoder은 내장객체가 아니므로 import 해야함 1	번 라인 참고 @page import="java.net.URLEncoder"
	response.sendRedirect("03_main.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
} else {
	response.sendRedirect("01_loginForm.jsp");
}
%>
</body>
</html>