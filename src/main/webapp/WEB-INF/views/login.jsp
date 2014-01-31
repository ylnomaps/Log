  
  <%@ include file="/WEB-INF/views/includes.jsp"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form action="user.do" method="POST" commandName="user">
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="user1.id" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="user1.password" /></td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td>
        	<form:radiobutton  path="user2.gender" value="M" label="M" /> 
            <form:radiobutton  path="user2.gender" value="F" label="F" />
        </td>
    </tr>
    <tr>
        <td>Country :</td>
        <td>
        <form:select path="country">
            <form:option value="0" label="Select" />
            <form:option value="1" label="India" />
            <form:option value="2" label="USA" />
            <form:option value="3" label="UK" />
        </form:select></td>
    </tr>
    <tr>
        <td>About you :</td>
        <td><form:textarea path="aboutYou" /></td>
    </tr>
    <tr>
        <td>Community :</td>
        <td>
        	<form:checkbox path="community" value="Spring" label="Spring" /> 
        	<form:checkbox path="community" value="Hibernate" abel="Hibernate" /> 
            <form:checkbox path="community" value="Struts" label="Struts" />
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
        <form:checkbox path="mailingList" label="Would you like to join our mailinglist?" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit"></td>
    </tr>
</table>
</form:form>

</body>
</html>