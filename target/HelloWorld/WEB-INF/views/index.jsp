<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<!-- Latest compiled and minified JavaScript -->
<title>Spring 4 MVC - HelloWorld Index Page</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>


<!-- Custom style -->
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>Welcome to Barood's blog</h1>
			<p class="lead">
				Made with hard-work not with love! <span
					class="glyphicon glyphicon-heart"></span>
			</p>
			<p class="lead">
				<a href="hello?name=Aniruddha">Click Here</a>
			</p>
		</div>
		<div class="container">
		<c:if test="${not empty error}">
			<div class="alert alert-danger fade in" role="alert">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				<strong>${error}</strong> Please try again.
			</div>
		</c:if>	
			<form:form cssClass="form-signin" role="form" id="form" method="POST"
				modelAttribute="inputForm" action="login">
				<h2 class="form-signin-heading">Please log in</h2>

				<div class="input-group input-group-lg">
					<span class="input-group-addon"> <span
						class="glyphicon glyphicon-user"></span>
					</span>
					<form:input path="username" class="form-control"
						placeholder="Username" />
				</div>
				<div class="input-group input-group-lg">
					<span class="input-group-addon"> <span
						class="glyphicon glyphicon-lock"></span>
					</span>
					<form:input path="password" class="form-control"
						placeholder="Password" />
				</div>
				<button class="btn btn-lg btn-primary btn-block" name=""
					type="submit">
					Log in <span class="glyphicon glyphicon-log-in"></span>
				</button>
			</form:form>
		</div>
	</div>
</body>
</html>