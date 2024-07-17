<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%//@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
	<H2>로그인 결과</H2>
	아이디 : ${userID}<br>
	비밀번호 : ${password}<br>
	이름 : ${name}<br>
	<hr>
	아이디 : ${info.userID}<br>
	비밀번호 : ${info.password}<br>
	이름 : ${info.name}<br>
</body>
</html>