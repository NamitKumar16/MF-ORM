<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-color: lightblue;
  
}
</style>
</head>
<body>
<span style="font-family:Arial">
First Name : ${msg}</br>
Last Name : ${msg1}</br>
Age : ${msg2}</br>
Gender : ${msg3}</br>
Cart:
<ul>
<c:forEach var="temp" items="${userModel.cart}">
<li> ${temp}</li>
</c:forEach>

</ul>

</span>

</body>
</html>