<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상품 정보 관리</h1>
<h2>정보 입력 폼</h2>
<form name="pform" id="req_pform" method="get" action="02_inputProduct.jsp">
	<table border="1px solid black">
		<tr>
			<th>상품명</th>
			<td><input type="text" width="300px" name="pname"></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="text" width="300px" name="price"></td>
		</tr>
		<tr>
			<th>설명</th>
			<td width="600px">
			<textarea name="explain"></textarea>
			</td>
		</tr>
	</table>
	<input type="submit" value="전송" />
	<input type="reset" value="취소" />
</form>
</body>
</html>