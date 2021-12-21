<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Log In Page</title>
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/5.1/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h3 class="masthead-brand">Forge Your Hero Log In</h3>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active" href="/">Home</a> <a class="nav-link"
						href="/sign-up">Sign Up</a> <a class="nav-link" href="/log-in">Log In</a>
				</nav>
			</div>
		</header>

		<main role="main" class="inner cover">

			<form:form method="post" modelAttribute="user" action="/log-in">

				<div class="form-row">

					<div class="form-group col-md-6">
						<label for="inputEmail">Email</label>
						<form:input type="text" path="email" class="form-control"
							id="inputEmail" />
					</div>



					<div class="form-group col-md-6">
						<label for="password">Password</label>
						<form:input type="password" path="password" class="form-control"
							id="inputPassword" />
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Log In</button>
			</form:form>


		</main>
	</div>
	<footer class="mastfoot mt-auto">
		<div class="inner">
			<p>
				Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>,
				by <a href="https://twitter.com/mdo">@mdo</a>.
			</p>
		</div>
	</footer>
</body>


</html>