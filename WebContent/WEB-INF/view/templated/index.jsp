<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
	pageEncoding="ISO-8859-2"%>	
<%-- <%@ page language="java" contentType="text/html" pageEncoding="utf-8"%> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Tija @</title>
</head>
<body>
Tijana ${msg}

<p>
if you want to login as admin use this: 
<a href="/WebNewSecurityTemplate/admin/form">I am admin</a>

</p>
</body>
</html>