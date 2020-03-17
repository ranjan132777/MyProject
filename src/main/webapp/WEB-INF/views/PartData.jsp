<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><body>
 <H3>WELCOME TO Part DATA</H3>
 <c:choose>
<c:when test="${!empty list}">
<table border="1">
<tr>
<th>Id</th>
<th>Code</th>
<th>Length</th>
<th>Weight</th>
<th>Height</th>
<th>Cost</th>
<th>Currency</th>
<th>Note</th>


</tr>
<c:forEach items="${list}" var="ob">
<td>${ob.uomOb.uomModel}</td>
<td>${ob.uomOb.Code}</td>
<td>
<c:out value="${ob.omSaleOb.orderCode }"></c:out>
</td>
<td>${ob.omPurchaseOb.orderorCode}</td>
<tr>
<td>${obj.Id}</td>
<td>${obj.partCode}</td>
<td>${obj.partLen}</td>
<td>${obj.partWid}</td>
<td>${obj.partHgt}</td>
<td>${obj.basecost}</td>
<td>${obj.BaseCurrency}</td>
<td>${obj.Note}</td>
<td>
<a href="delete?sid=${obj.Id}">Delete</a>
<a href="edit?sid=${obj.Id}">Edit</a>
<a href="view?sid=${obj.Id}">View</a>
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
