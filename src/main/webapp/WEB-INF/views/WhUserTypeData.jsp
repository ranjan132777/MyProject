<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<body>
	<H3>WELCOME TO WHUserType TYPE DATA PAGE</H3>
	<c:choose>
		<c:when test="${!Empty list}">
			<table border="1">
				<tr>
					<th>UserType</th>
					<th>UserCode</th>
					<th>UserForAutoFill</th>
					<th>UserEmail</th>
					<th>UserContact</th>
					<th>UserIdType</th>
					<th>UserIfOther</th>
					<th>IdNumber</th>
				<tr>

					<td><a href="delete?uid=${obj.userId}">DELETE</a></td>
				<tr>
					<td>${obj.uomid}</td>
					<td>${obj.userType}</td>
					<td>${obj.userCode}</td>
					<td>${obj.userFor}</td>
					<td>${obj.userEmail}</td>
					<td>${obj.userContact}</td>
					<td>${obj.userIdType}</td>
					<td>${obj.ifOther}</td>
                    <td>${obj.idNumber}</td>
				</tr>
             </table>
		</c:when>
		<c:otherwise>
			<H4>NO DATA FOUND</H4>
		</c:otherwise>
	</c:choose>
</body>
</html>

