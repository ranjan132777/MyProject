<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Part Edit Page</h3>
<form:form action="update" method="POST" modelAttribute="part">
<pre>
Part Id:<form:input path="Id" readOnly="true" />
Code:
<input type="text" name="partCode" />
Dimentions:
<form:radiobutton path="partLen" value="W"/>W
<form:radiobutton path="partWid" value="L"/>L
<form:radiobutton path="partHgt" value="H"/>H
Base Cost:
<input type="text" name="basecost"/>
Base Currency:
<form:select path="BaseCurrency"/>
<form:option value="">--Select--</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ERU</form:option>
Uom:
<input type="text" name="uomOb"/>
Note:
<form:textarea path="Note"/>
<input type="submit" value="Update"/>
</pre>
</form:form>
${message}
</body></html>
















