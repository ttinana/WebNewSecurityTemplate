<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${msg}</h1>

	<form action="admin**submittet">
		<fieldset>
			<legend>Personal information:</legend>
			First name:<br> <input type="text" name="firstname"
				value="Mickey"><br> Last name:<br> <input
				type="text" name="lastname" value=""><br>
			<br> <input type="submit" value="Submit">
		</fieldset>
	</form>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="<c:url value="/j_spring_security_logout" />"> Logout</a>
		</h2>
	</c:if>
</body>
</html>