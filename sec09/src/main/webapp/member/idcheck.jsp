<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/member.js"></script>
<title>회원 관리</title>
</head>
<body>
	<h2>아이디 중복확인</h2>
	<form action="idCheck.do" method="get" name="frm">
		아이디 <input type="text" name="userid" value="${userid}" /> <input
			type="submit" value="중복 체크" /> <br>
		<c:if test="${result == -1}">
		${userid}는 사용가능한 아이디 입니다.
		<input type="button" value="사용" onClick="idok()">
		</c:if>
		<c:if test="${result == 1}">
			<script type="text/javascript">
				opener.document.frm.userid.value = ""; // 다시 입력하도록 내용 삭제 해주는 부분
			</script>
		${userid}는 이미 사용중인 아이디 입니다.
		<input type="button" value="확인" onClcik="">
		</c:if>
		<c:if test="${result == 0}">
		${userid}는 사용가능한 아이디 입니다.
	</c:if>
	</form>
</body>
</html>