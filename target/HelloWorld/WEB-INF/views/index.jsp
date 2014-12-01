<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
	<center>
		<h2>Hello World</h2>
		<h3>
			<a href="hello?name=Eric">Click Here</a>
		</h3>
		<form:form id="form" method="GET" modelAttribute="inputForm" action="hello">
			Name:
			<form:input path="name"/>
			Address:
			<form:input path="address" />
			<input name="" type="submit" value="Save">
		</form:form>
	</center>
</body>
</html>