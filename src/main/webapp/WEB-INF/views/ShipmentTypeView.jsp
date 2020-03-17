<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <H3>WELCOME TO SHIPMENT TYPE VIEW PAGE</H3>
	<a href="excel?id=${obj.shipId }">Download Excel
	<img src="../resources/images/excel.png" width="30" height="30"/></a>
	<a href="Pdf?id=${obj.shipId }">Download
	 <img src="../resources/images/Pdf.png" width="30" height="30"/></a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>MODE</th>
			<th>CODE</th>
			<th>SHIP</th>
			<th>GRADE</th>
			<th>DESC</th>
			
			<td>${obj.shipId }</td>
		</tr>
		<tr>
			<td>${obj.shipMode}</td>
			<td>${obj.shipCode}</td>
			<td>${obj.enbShip}</td>
			<td>${obj.shipGrade}</td>
			<td>${obj.shipDesc}</td>
			</tr>
			
	</table>
</body>
</html>

 
