<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hello World Page</title>
	<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>	
</head>
	<body>
		<!--  Include img  from resources -->
	<img src="${pageContext.request.contextPath}/resources/images/spring.JPG" />
		
	 <h2>Spring MVC main menu page</h2>
	 <a href="hello/showForm">Hello World </a>
	 <br><br>
	  <a href="student/showForm">Student form </a>
	</body>
</html>