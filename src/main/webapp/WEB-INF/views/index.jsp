<%@ include file="/WEB-INF/views/includes.jsp"%>
<html>
<body>
	<h2>Registration form</h2>
	<form action="/login" method="POST">
		username: <input type="text" name="identifier"/> <br>
		password: <input type="password" name="password"/><br>
		
		<input type="submit" value="submit"/>
	</form>
</body>
</html>
