<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Welcome to our Page</title>
</head>

<body>
	<h2>Hello - Yoohoo!!</h2>
	<hr>
	<p>
		I am byeori!
	</p>
	
	<form:form action="${pageContext.request.contextPath }/logout" 
					method="POST">
					
		<input type="submit" value="Logout" />
	
	</form:form>
</body>

</html>