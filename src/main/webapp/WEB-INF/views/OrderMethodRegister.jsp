<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H3>WELCOME TO ORDER METHOD REGISTER PAGE</H3>
<form:form action="save" method="POST" modelAttribute="orderMethod">
<pre>
OrderMode:
<form:radiobutton path="orderMode" value="SALE"/>SALE
<form:radiobutton path="orderMode" value="PURCHASE"/>PURCHASE
 OrderCode:
 <form:input path="ordeCode"/>
OrderType:
<form:select path="orderType">
<form:option value="">-SELECT-</form:option>
<form:option value="">FIFO</form:option>
<form:option value="">LIFO</form:option>
<form:option value="">FCFO</form:option>
<form:option value="">FEFO</form:option>
</form:select>
OrderAccept:
<form:checkbox path="orderAccept" value="Multi-Model"/>Multi-Model
<form:checkbox path="orderAccept" value="Accept-Return"/>Accept-Return
Description:

<form:textarea path="description"/>
<input type="submit" value="Create"/>
</pre>
</form:form>
</body>
</html>