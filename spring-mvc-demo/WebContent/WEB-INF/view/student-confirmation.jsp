<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Confirmation</title>
</head>
<body>

The student is confirmed: <b> ${student.firstName} ${student.lastName}</b> from <b>${student.country}</b>
<br>
Favorite language : ${student.favoriteLanguage}
<br><br>

OS selected:


<ul>
	<c:forEach var="SO" items="${student.operatingSystems}">
		<li>${SO}</li>
	</c:forEach>
</ul>



</body>
</html>