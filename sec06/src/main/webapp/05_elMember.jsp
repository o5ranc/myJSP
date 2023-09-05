<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="com.keduit.MemberBean" />
<jsp:setProperty property="*" name="member" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
이름 : ${member.name}<br>
아이디 : ${member.id}<br>
비번 : ${member.pwd}<br>
닉네임 : ${member.nickname}<br>

<!-- 
bean를 쓰면 setProperty의 name을 useBean의 id와 맞춰주고, 그 name.변수 로 읽는다.
아니면 param에서 읽으면 
이름 : ${param.name}<br>
아이디 : ${param.id}<br>
비번 : ${param.pwd}<br>
닉네임 : ${param.nickname}<br>
-->
</body>
</html>