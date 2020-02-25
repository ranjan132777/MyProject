<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<H3>WELCOME TO OrderMethod DATA PAGE</H3>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
					<th>Mode</th>
					<th>CODE</th>
					<th>Type</th>
					<th>Accept</th>
					<th>ENABLE</th>
					<th>Description</th>
					<th colspan="4">OPERATION</th>
				<tr>
					<c:forEach items="${list}" var="obj">

						<tr>
							<td>${obj.ordermethodId}</td>
							<td>${obj.orderMode}</td>
							<td>${obj.orderCode}</td>
							<td>${obj.orderType}</td>
							<td>${obj.orderAccept}</td>
							<td>${obj.orderDesc}</td>
							<td><a href="delete?omid=${obj.ordermethodId}">DELETE</a></td>
							<td><a href="view?omid=${ob.ordermethodId}">View</a></td>
							<td><a href="edit?omid=${ob.ordermethodId}">Edit</a></td>
						   <td><a href="update?omid=${ob.ordermethodId}">Update</a></td>
						
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

