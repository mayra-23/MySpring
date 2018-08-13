<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hello World Form</title>
	
	<!-- Include CSS  and Script from resources -->
	<link rel="stylesheet" type="text/css" 
	       href="${pageContext.request.contextPath}/resources/css/my-test.css" >
	
	<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>


<body>
	<div id="divTest">
		Form using params:
		<form action="processForm" method="GET">
			<input type="text" name="studentName"
				placeholder="What's your name?" />			
			<input type="submit" />	
		</form>
		
		<br>
		Form version 2 (Model info):
		<form action="processFormTwo" method="GET">
			<input type="text" name="studentName"
				placeholder="What's your name?" />			
			<input type="submit" />	
		</form>
		
		
		<br>
		Form version 3 (Request Param):
		<form action="processFormThree" method="GET">
			<input type="text" name="studentName"
				placeholder="What's your name?" />			
			<input type="submit" />	
		</form>
	</div>
</body>
</html>