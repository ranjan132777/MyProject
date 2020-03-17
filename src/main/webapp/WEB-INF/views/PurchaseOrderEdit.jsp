<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<h3>Welcome to PurchaseOrder Edit Page</h3>
<form:form action="update" method="POST" modelAttribute="purchaseorder">
<pre>
 Id:<form:input path="Id" readOnly="true" />
 Order Code:
 <form:input path="orderCode" />   
 Shipment Code:
 <form:input path="shipCode" />  
 Vendor:
 <form:input path="" /> 
 Ref Number:
 <form:input path="referenceNumber" /> 
 Quality Check:
 <form:radiobutton path="Required" />Required
 <form:radiobutton path="Not Required" />Not Required
 Def Status:
 <form:textarea path="Description" />
    <input type="submit" value="update" />
</pre>
	</form:form>
	${message}
 
</body>
</html>