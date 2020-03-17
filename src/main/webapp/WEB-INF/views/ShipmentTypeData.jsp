<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><body>
 <H3>WELCOME TO SHIPMENTTYPE DATA</H3>
 <c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
<th>Id</th>
<th>Mode</th>
<th>Code</th>
<th>Enable</th>
<th>Grade</th>
<th>Note</th>
<th>Operations</th>

</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${obj.shipId}</td>
<td>${obj.shipMode}</td>
<td>${obj.shipCode}</td>
<td>${obj.enbShip}</td>
<td>${obj.shipGrade}</td>
<td>${obj.shipDesc}</td>
<td>
<a href="delete?sid=${obj.shipId}">Delete</a>
<a href="edit?sid=${obj.shipId}">Edit</a>
<a href="view?sid=${obj.shipId}">View</a>
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


















































































































































































































































































