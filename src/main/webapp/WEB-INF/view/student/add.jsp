<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new product</title>
<style>
    .error { color: red; font-weight: bold; }
</style>
</head>
<body>

	<p>
		<a href="${pageContext.servletContext.contextPath}/room">Room</a>
		<a href="${pageContext.servletContext.contextPath}/class">Class</a>
		<a href="${pageContext.servletContext.contextPath}/course">Course</a>
		<a href="${pageContext.servletContext.contextPath}/student">Student</a>
		<a href="${pageContext.servletContext.contextPath}/teacher">Teacher</a>
		<a href="${pageContext.servletContext.contextPath}/vehicle">Vehicle</a>
	</p>
	<h5>Add new Student</h5>
	<form:form method="post" commandName="student" action="addnew">
	<table>
		<tr>
			<td>
				Student name 
			</td>
			<td>
				<form:input path="studentName"/>
			</td>
		</tr>
		<tr>
			<td>
				sex    
			</td>
			<td>
				<form:input   path="sex"/>
			</td>
		</tr>
		<tr>
			<td>
				birthday    
			</td>
			<td>
				<form:input   path="birthday"/>
			</td>
		</tr>
		 <tr>
			<td>
				class    
			</td>
			<td>
				<form:checkboxes items="${classList}" itemLabel="className" itemValue="id" path="classes" />
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Save"/>
			</td>
		</tr>
	</table>
	</form:form>

</body>
</html>