<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<H3>WELCOME PURCHASEORDER REGISTER PAGE</H3>
	<form:form action="save" method="POST" modelAttribute="purchaseorder">
		<pre>
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
    <input type="submit" value="place order" />
</pre>
	</form:form>
	${message}

</body>
</html>