<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H3>WELCOME TO OrderMethod VIEW PAGE</H3>
	<table border="1">
		<tr>
			<th>ID</th>
			<td>${obj.ordermethodId }</td>
		</tr>
		<tr>
			<td>${obj.orderMode}</td>
			<td>${obj.ordeCode}</td>
			<td>${obj.orderType}</td>
			<td>${obj.orderAccept}</td>
			<td>${obj.orderDesc}</td>
			</tr>
			
	</table>
</body>
</html>