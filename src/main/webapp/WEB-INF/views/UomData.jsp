<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@include file="UserMenu.jsp" %>
</head>
<body><%-- 
	<H3>WELCOME TO Uom TYPE DATA PAGE</H3>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Type</th>
					<th>Model</th>
					<th>Desc</th>
					<th colspan="2">Operation</th>
				</tr>
				</thead>
				
				
               <tbody>
               <c:forEach items="${list}" var="uo">
				<tr>
					<td>$uo.uomid}</td>
					<td>${uo.uomType}</td>
                     <td>${uo.uomModel}</td>
					<td>${uo.uomDesc}</td>
					<td><a href="delete?uomid=${uo.uomid}">DELETE</a></td>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
		</c:when>
		<H4>NO DATA FOUND</H4>
	</c:choose>
 --%>
 
 <div class="container-fluid">
 
 <div class="card">
 <div class="header-card bg-primary text-white text-center"><h1>WELCOME TO UOM LIST FORM!</h1></div>
 <div class="body-card">
<c:choose>
<c:when test="${!empty list}">
<table class="table table-hover table-striped table-borderless">
<thead class="table-dark">
<tr>
<th>ID</th>
<th>UOM CODE</th>
<th>UOM MODEL</th>
<th>Description</th>
<th colspan="2">Operation</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="uoms">
<tr>
<td><c:out value="${uoms.uomid}"></c:out></td>
<td><c:out value="${uoms.uomType}"></c:out></td>
<td><c:out value="${uoms.uomModel}"></c:out></td>
<td><c:out value="${uoms.uomDesc}"></c:out></td>
<td><a href="delete?id=${uoms.uomid}">DELETE</a></td>
<td><a href="edit?id=${uoms.uomid}"></a>Edit</td>
 </tr>

</c:forEach>

</tbody>

</table>


</c:when>


</c:choose>
 
 
 
 </div>
 
 </div>
 
 </div>
 
 
 
 
 
 </body>
</html>
