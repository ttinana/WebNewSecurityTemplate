<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page session="true"%>
<html>
<body>
	<h1>${title}</h1>
	<h1>${msg}</h1>
	<p>
	<a href="/WebNewSecurityTemplate/admin/form?language=en">English</a> | <a href="/WebNewSecurityTemplate/admin/form?language=sr">Serbian</a>
	
	</p>

	<form:errors path="user.*" />
	<form action="submission" method="post">
		<fieldset>
			<spring:message code="label.name" /><br> 
			<input type="text" name="firstname" value="Tijana"><br>
			<spring:message code="label.lastname" /><br> 
			<input type="text" name="lastname" value="Pavicic"><br>
				
			<spring:message code="label.telephone" /><br> 
			<input 	type="text" name="telNumber" value="563799"><br>

			<input type="submit" value="Submit">
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