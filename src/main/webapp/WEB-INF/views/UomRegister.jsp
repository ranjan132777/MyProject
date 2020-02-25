<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<H3>WELCOME TO Uom Register REGISTER PAGE</H3>
	<form:form action="save" method="POST" modelAttribute="uom">
		<pre>
Uom Type:
<form:select path="uom">
<form:option value="">-SELECT-</form:option>
<form:option value="">Packing</form:option>
<form:option value="">No Packing</form:option>
<form:option value="">NA</form:option>
</form:select>
Uom Model:
 <form:input path="uomModel" />
Description:
<form:textarea path="description" />
<input type="submit" value="Create" />
</pre>
</form:form>
</body>
</html>
