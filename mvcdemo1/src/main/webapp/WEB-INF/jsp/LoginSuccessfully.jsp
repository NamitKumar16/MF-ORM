<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
        #center {    
            text-align: center;  
 } 
 body {
  background-color: lightblue;
}
    </style>
</head>
<div id = "center">
        <img src="resources/images/2.png" alt ="furniture" height = "500px" width = "100%">
    </div>
<body>
<h2>Hello ${msg }</h2>

<form:form action="saved" method="post" modelAttribute="userModel">
First Name &nbsp
<form:input path="fname" />
</br>
Last Name  &nbsp
<form:input path="lname"  />
</br>
Age &nbsp
<form:input path = "age" />
<br>
Male:<form:radiobutton path="gender" value="Male"/>
Female: <form:radiobutton path="gender" value="Female"/><br>
Cart:
Chair: <form:checkbox path="cart" value="Chair"/>
Table: <form:checkbox path="cart" value="Table"/>
Bed: <form:checkbox   path="cart" value="Bed"/>
<form:button>Submit</form:button>
</form:form>


</form>
</body>
</html>