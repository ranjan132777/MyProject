<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<H3>WELCOME TO PURCHASEORDER DATA</H3>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>SHIPCODE</th>

					<th>REFNO</th>
					<th>QTYCHECK</th>
					<th>DEFSTATUS</th>
					<th>DESC</th>

				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${obj.Id}</td>
						<td>${obj.orderCode}</td>
						<td>${obj.shipmentCode}</td>

						<td>${obj.referenceNumber}</td>
						<td>${obj.qualityCheck}</td>
						<td>${obj.defaultStatus}</td>
						<td>${obj.Description}</td>


						<td><a href="delete?id=${obj.Id}">Delete</a> <a
							href="edit?id=${obj.Id}">Edit</a> <a href="view?id=${obj.Id}">View</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<H4>NO DATA FOUND</H4>
		</c:otherwise>
	</c:choose>
</body>
</html>



