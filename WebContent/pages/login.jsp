<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<!-- Load jQuery and jQuery-Validate scripts -->
<script src="js/jquery.js"></script>

<script
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script src="js/jquery-validate.js"></script>
<script src="js/login.js"></script>
<!-- Bootstrap CSS used for styling the demo pages-->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<!-- basic validation of a login form -->
	<form class="form" id="login" action="LoginController" method="post">
		<div class="form-group">
			<label>Basic login form example</label>
			<%
				if (request.getParameter("msg") != null) {
			%>
			<label style="color: red">Invalid User Detail...</label>
			<%
				}
			%>
		</div>
		<div class="form-group">
			<label for="login-email">Email address</label> <input type="email"
				class="form-control" id="login-email" name="login-email"
				placeholder="Enter email">
		</div>
		<div class="form-group">
			<label for="login-password">Password</label> <input type="password"
				class="form-control" id="login-password" name="login-password"
				placeholder="Password">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>


</body>
</html>
