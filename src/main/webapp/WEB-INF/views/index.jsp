<%@ include file="/WEB-INF/views/includes.jsp"%>
<html>
<body>
	<h2>Registration form</h2>
	<form action="login.do" method="POST" commandName="user">
		username: <input type="text" name="identifier"/> <br>
		password: <input type="password" name="password"/><br>
		
		<input type="submit" value="submit"/>
	</form>
	<table border="1">
		<th>ID</th>
		<th>User</th>
	
		<c:forEach items="${user}" var="user">
			<tr>
				<td>${user.ID}</td>
				<td>${user.pasword}</td>
				>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
