<%@page import="java.util.Enumeration"%>
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
String id = (String)session.getAttribute("id");
String pwd = (String)session.getAttribute("pwd");
Integer age = (Integer)session.getAttribute("age");
%>
id : <%=id%>
pwd : <%=pwd%>
age : <%=age%>

<h1>이름과 세션값 가져오기</h1>
<%
Enumeration names = session.getAttributeNames();

while(names.hasMoreElements()) {
	String name = names.nextElement().toString(); // element의 이름으로 
	String value = session.getAttribute(name).toString(); // 여기의 value 값을 알아내기
	out.println(name + " : " + value + "<br>");
}
%>
</body>
</html>