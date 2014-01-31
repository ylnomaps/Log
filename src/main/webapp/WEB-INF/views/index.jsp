<%@ include file="/WEB-INF/views/includes.jsp"%>
<html>
<body>
	<h2>Registration form</h2>
	<form action="home" method="POST" commandName="user">
		username: <input type="text" name="id"/> <br>
		password: <input type="password" name="password"/><br>
		
		<input type="submit" value="submit"/>
	</form>
	<form:form action="hi" commandName="message">
    Name: <input type="text" name="name"> <input type="submit" value="Submit">
  
 
	</form:form> <br> <h6>message: <c:out value="${message}" ></c:out>
	<br> <h6>name: <c:out value="${name}" ></c:out>
	<table border="1">
		<th>ID</th>
		<th>User</th>
	
		<c:forEach items="${user}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.pasword}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
