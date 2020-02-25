<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<H3>WELCOME TO Uom TYPE DATA PAGE</H3>
	<c:choose>
		<c:when test="${!Empty list}">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Type</th>
					<th>Model</th>
					<th>Desc</th>
				<tr>


					<td><a href="delete?uomid=${obj.uomid}">DELETE</a></td>
				<tr>
					<td>${obj.uomid}</td>
					<td>${obj.uomType}</td>
                     <td>${obj.uomModel}</td>
					<td>${obj.uomDesc}</td>
                    </tr>
                </table>
		</c:when>
		<H4>NO DATA FOUND</H4>
	</c:choose>
</body>
</html>
