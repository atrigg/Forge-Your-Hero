<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page import="com.ForgeYourHero.entity.CardGame" %>

<!--  <%

//CardGame minimum = new CardGame(0);

//CardGame maximum = new CardGame(12);

//CardGame target = new CardGame();
//target.setRandom(minimum.getValue(), maximum.getValue());




//%>-->

<html>
<head>
<meta charset="utf-8">
<title>Forge Your Hero</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/5.1/dist/css/bootstrap.min.css"
	rel="stylesheet">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<!--  <link href="cover.css" rel="stylesheet"> -->
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h1 class="masthead-brand">Forge Your Hero!</h1>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active" href="/">Home</a> <a class="nav-link"
						href="/sign-up">Sign Up</a> <a class="nav-link" href="/log-in">Log
						In</a>
						<a class="nav-link active" href="/card-game">Game</a>
				</nav>
			</div>
		</header>
<P>
<h2>Forge Your Hero is a card battle game putting multiple classes against each other.</h2>
</P>

		<main role="main" class="inner cover">
			<table class="table">
				<thead>
					<tr>
						<th>
						<th></th>
						
					</tr>
				<tbody>
					<c:forEach var="item" items="${cardGame}">
						<tr>
							
							<td></td>
							
							<td></td>
					</c:forEach>
				</tbody>
			</table>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>,
					by <a href="https://twitter.com/mdo">@mdo</a>.
				</p>
			</div>
		</footer>
	</div>


</body>


</body>

</html>
