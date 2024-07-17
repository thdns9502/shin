<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" /> <!-- header 불러오기 -->
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
	로그인 품 : ${test}
	<br>
	<form action="${contextPath}/login/login4" method="post">
	아이디 : <input type="text" name="userID"><br>
	이름 : <input type="text" name="name"><br>
	비밀번호 : <input type="text" name="password"><br>
	<input type="submit" value="로그인"> 
	</form>
</body>
</html>