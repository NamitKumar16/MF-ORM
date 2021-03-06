<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Registration Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

<form:form action="processForm" modelAttribute="customer">

First name: <form:input path="firstName" />
<br><br>
Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		Password (*):
		<form:password path="password"/>
		<form:errors path="password" cssClass="error" />
		
		Free passes  (*): <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		
		<br><br>

		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		
		<br><br>

		Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		
		<br><br>

		<input type="submit" value="Submit" />
</form:form>
	
</body>

</html>