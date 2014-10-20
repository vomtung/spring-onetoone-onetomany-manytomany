<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		<h2>University</h2>
		<h1>one-to-many|one-to-one|many-to-many example</h1>
	</head> 
	<body>
	<a href="${pageContext.servletContext.contextPath}/room">Room</a>
	<a href="${pageContext.servletContext.contextPath}/class">Class</a>
	<a href="${pageContext.servletContext.contextPath}/course">Course</a>
	<a href="${pageContext.servletContext.contextPath}/student">Student</a>
	<a href="${pageContext.servletContext.contextPath}/teacher">Teacher</a>
	<a href="${pageContext.servletContext.contextPath}/vehicle">Vehicle</a>
	</body>
</html>
