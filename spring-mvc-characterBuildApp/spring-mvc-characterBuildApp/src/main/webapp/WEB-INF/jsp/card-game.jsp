<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Droppable - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
#draggable {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable1 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable2 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable3 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable4 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable5 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable6 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable7 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable8 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable9 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable10 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable11 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable12 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable13 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable14 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable15 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable16 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable17 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable18 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable19 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable20 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable21 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable22 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#draggable23 {
	width: 175px;
	height: 295px;
	padding: 0.5em;
	float: left;
	margin: 10px 10px 10px 0;
	border: 1px solid black;
}

#droppable {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}

#droppable1 {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}

#droppable2 {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}

#droppable3 {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}

#droppable4 {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}

#droppable5 {
	width: 200px;
	height: 300px;
	padding: 0.5em;
	float: Right;
	margin: 10px;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.0/jquery-ui.js"></script>
<script>
	$(function() {
		$("#draggable").draggable();
		$("#draggable1").draggable();
		$("#draggable2").draggable();
		$("#draggable3").draggable();
		$("#draggable4").draggable();
		$("#draggable5").draggable();
		$("#draggable6").draggable();
		$("#draggable7").draggable();
		$("#draggable8").draggable();
		$("#draggable9").draggable();
		$("#draggable10").draggable();
		$("#draggable11").draggable();
		$("#draggable12").draggable();
		$("#draggable13").draggable();
		$("#draggable14").draggable();
		$("#draggable15").draggable();
		$("#draggable16").draggable();
		$("#draggable17").draggable();
		$("#draggable18").draggable();
		$("#draggable19").draggable();
		$("#draggable20").draggable();
		$("#draggable21").draggable();
		$("#draggable22").draggable();
		$("#draggable23").draggable();

		$("#droppable").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});

		$("#droppable1").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});
		$("#droppable2").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});

		$("#droppable3").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});
		$("#droppable4").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});
		$("#droppable5").droppable(
				{

					drop : function(event, ui) {
						$(this).addClass("ui-state-highlight").find("p").html(
								"Dropped!");
					}
				});
	});
</script>

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
<meta charset="UTF-8">
<title>Forge Your Hero</title>
</head>






<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h1 class="masthead-brand">Let The Battle Begin!</h1>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active" href="/">Home</a>
				</nav>
			</div>
		</header>

		<main role="main" class="inner cover">

			<p>
			<h3>Player One</h3>
			</p>

			<div id="draggable" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:10</p>
				<img src="assets/img/Knight-Card.jpg" />
				<p>Knight</p>
			</div>


			<div id="draggable1" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:9</p>
				<img src="assets/img/Barbarian-CArd.jpg" />
				<p>Barbarian</p>
			</div>

			<div id="draggable2" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Bard-Card.jpg" />
				<p>Bard</p>
			</div>

			<div id="draggable3" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:10</p>
				<img src="assets/img/Cleric-Card.jpg" />
				<p>Cleric</p>
			</div>

			<div id="draggable4" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:8 hp:9</p>
				<img src="assets/img/Druid-Card.jpg" />
				<p>Druid</p>
			</div>

			<div id="draggable5" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:7</p>
				<img src="assets/img/Monk-Card.jpg" />
				<p>Monk</p>
			</div>

			<div id="draggable6" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Ranger-Card.jpg" />
				<p>Ranger</p>
			</div>


			<div id="draggable7" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:11</p>
				<img src="assets/img/Paladin-Card.jpg" />
				<p>Paladin</p>
			</div>

			<div id="draggable8" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:8 hp:7</p>
				<img src="assets/img/Rogue-Card.jpg" />
				<p>Rogue</p>
			</div>

			<div id="draggable9" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Sorcerer-Card.jpg" />
				<p>Sorcerer</p>
			</div>

			<div id="draggable10" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:8</p>
				<img src="assets/img/Warlock-Card.jpg" />
				<p>Warlock</p>
			</div>

			<div id="draggable11" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:10</p>
				<img src="assets/img/Wizard-Card.jpg" />
				<p>Wizard</p>
			</div>





			<div id="droppable" class="ui-widget-header">
				<p>Battlefield 3</p>
			</div>

			<div id="droppable1" class="ui-widget-header">
				<p>Battlefield 1</p>
			</div>

			<div id="droppable2" class="ui-widget-header">
				<p>Battlefield 2</p>
			</div>




			<form:form method="post" action="/game" modelAttribute="user">


				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputUserId"></label>
						<form:input type="text" path="userName" class="form-control"
							id="inputUserId" />
					</div>
				</div>
			</form:form>

			<p>
			<h3>Player Two</h3>
			</p>

			<div id="droppable3" class="ui-widget-header">
				<p>Battlefield</p>
			</div>


			<div id="droppable4" class="ui-widget-header">
				<p>Battlefield 4</p>
			</div>


			<div id="droppable5" class="ui-widget-header">
				<p>Battlefield 5</p>
			</div>


			<div id="draggable12" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:10</p>
				<img src="assets/img/Knight-Card.jpg" />
				<p>Knight</p>
			</div>


			<div id="draggable13" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:9</p>
				<img src="assets/img/Barbarian-CArd.jpg" />
				<p>Barbarian</p>
			</div>

			<div id="draggable14" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Bard-Card.jpg" />
				<p>Bard</p>
			</div>

			<div id="draggable15" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:10</p>
				<img src="assets/img/Cleric-Card.jpg" />
				<p>Cleric</p>
			</div>

			<div id="draggable16" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:8 hp:9</p>
				<img src="assets/img/Druid-Card.jpg" />
				<p>Druid</p>
			</div>

			<div id="draggable17" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:7</p>
				<img src="assets/img/Monk-Card.jpg" />
				<p>Monk</p>
			</div>

			<div id="draggable18" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Ranger-Card.jpg" />
				<p>Ranger</p>
			</div>


			<div id="draggable19" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:12 hp:11</p>
				<img src="assets/img/Paladin-Card.jpg" />
				<p>Paladin</p>
			</div>

			<div id="draggable20" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:8 hp:7</p>
				<img src="assets/img/Rogue-Card.jpg" />
				<p>Rogue</p>
			</div>

			<div id="draggable21" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:9 hp:7</p>
				<img src="assets/img/Sorcerer-Card.jpg" />
				<p>Sorcerer</p>
			</div>

			<div id="draggable22" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:8</p>
				<img src="assets/img/Warlock-Card.jpg" />
				<p>Warlock</p>
			</div>

			<div id="draggable23" class="ui-widget-content" width="50px"
				height="100px">
				<p>dmg:11 hp:10</p>
				<img src="assets/img/Wizard-Card.jpg" />
				<p>Wizard</p>
			</div>

		</main>
	</div>
</body>



<footer class="mastfoot mt-auto">
	<div class="inner">
		<!--  <p>
					Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>,
					by <a href="https://twitter.com/mdo">@mdo</a>.
				</p>-->
	</div>
</footer>



</html>
