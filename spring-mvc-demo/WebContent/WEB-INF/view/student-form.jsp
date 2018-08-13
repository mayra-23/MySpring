<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name:  <form:input path="firstName"/>
		<br/><br/>
		Last Name: <form:input path="lastName"/>
		<br><br>
		Country:		 
		 
		 <!-- From properties file -->
		 <form:select path="country">
			<form:options items="${countryOptions}"/>
		</form:select>		
		<br><br>
		
		Favorite Language:
		<!-- On Submit, Spring will call student.setFavoriteLanguage  -->
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
		
		<br><br>
		OS Experience:
		<form:checkbox path="operatingSystems" value="Linux" /> Linux
		<form:checkbox path="operatingSystems" value="Windows" /> Windows
		<form:checkbox path="operatingSystems" value="Mac OS" /> Mac Os
				
		<input type ="submit" value="Submit"/>		
	</form:form>

</body>
</html>