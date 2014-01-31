
    <%@ include file="/WEB-INF/views/includes.jsp"%>
<!-- <%@ page session="false" %>   -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>message page</title>
</head>
<body>
   <h2><c:out value="${message}"></c:out></h2>
   
    <form action="back">
    Name: <input type="text" name="name" value="${message}"> <input type="submit" name="back" value="${message}">
  
 
	</form> 
</body>

</html>