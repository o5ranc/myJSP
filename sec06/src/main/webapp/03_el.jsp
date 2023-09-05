<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${"안녕하세요"}
<%= "안녕하세요" %>
<p>
EL에서의 null표현 : ${null}
</p>
<% String input=null; %>
<p> 표현식에서의 null : <%= input %>
<p> EL에서의 empty : ${ empty input }
</body>
</html>