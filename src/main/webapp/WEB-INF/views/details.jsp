<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${donut.name }</h1>
<p>Calories: ${donut.calories }</p>
<p>Extras</p>
<ul>
<c:forEach var="extra" items="${donut.extras }">
	<li>${extra }</li>
</c:forEach>
</ul>
<a href="/">Back to List</a>
</body>
</html>