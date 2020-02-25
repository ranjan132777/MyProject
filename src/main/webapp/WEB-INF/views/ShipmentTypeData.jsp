<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<H3>WELCOME TO SHIPMENT TYPE DATA PAGE</H3>
	<a href="pdf">Pdf Export</a>
	<a href="excel">Excel Export</a>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>GRADE</th>
					<th>MODE</th>
					<th>ENABLE</th>
					<th>NOTE</th>
					<th colspan="4">OPERATION</th>
				<tr>
					<c:forEach items="${list}" var="obj">

						<tr>
							<td>${obj.shipId}</td>
							<td>${obj.shipMode}</td>
							<td>${obj.shipCode}</td>
							<td>${obj.enbShip}</td>
							<td>${obj.shipGrade}</td>
							<td>${obj.shipDesc}</td>
							<td><a href="delete?sid=${obj.shipId}">DELETE</a></td>
							<td><a href="view?sid=${obj.shipId}">View</a></td>
							<td><a href="edit?sid=${obj.shipId}">Edit</a></td>
						  
						</tr>
						
						
					</c:forEach>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<H4>NO DATA FOUND</H4>
		</c:otherwise>
	</c:choose>
</body>
</html>

