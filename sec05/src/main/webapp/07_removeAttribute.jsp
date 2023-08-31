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
<h1>세션에 저장된 특정 객체 삭제하기</h1>
<%
session.setAttribute("s_name1", "저는 세션에 저장된 첫번째 값이어요.");
session.setAttribute("s_name2", "저는 세션에 저장된 두번째 값이어요.");
session.setAttribute("s_name3", "저는 세션에 저장된 세번째 값이어요.");
%>
<h3>세션값 삭제하기</h3>
<%
Enumeration names = session.getAttributeNames();
while(names.hasMoreElements()) {
	String name = names.nextElement().toString();
	String value = session.getAttribute(name).toString();
	out.println(name + " : " + value + "<br>");
}

// 삭제 시작
session.removeAttribute("s_name2");
out.println("<h3>세션값을 삭제한 후</h3>");
names = session.getAttributeNames();
while(names.hasMoreElements()) {
	String name = names.nextElement().toString();
	String value = session.getAttribute(name).toString();
	out.println(name + " : " + value + "<br>");
}
out.print("<h3>세션값을 모두 삭제한 후</h3>");
out.println(request.isRequestedSessionIdValid());
session.invalidate();
out.println(request.isRequestedSessionIdValid());

%>
</body>
</html>