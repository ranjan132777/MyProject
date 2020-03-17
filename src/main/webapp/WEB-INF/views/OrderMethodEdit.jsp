<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <html>
<body>

	<h3>Welcome to OrderMethod Edit Page</h3>

	<form:form action="update" method="POST" modelAttribute="ordermethod">
		<pre>
		OrderMethod Id:<form:input path="ordermethodId" readOnly="true"/>
		
		
		Order Mode:
<form:radiobutton path="orderMode" value="SALE"/>
<form:radiobutton path="orderMode" value="PURCHASE"/>
Order Code:
<form:input path="ordeCode"/>
order Type:		
<form:input path="ordeType"/>
OrderAccept:
<form:checkbox path="orderAccept" value="Multi-Model"/>Multi-Model
<form:checkbox path="orderAccept" value="Accept-Return"/>Accept-Return
Description:
<form:textarea path="orderDesc" />
<input type="submit" value="UPDATE" />
</pre>
	</form:form>

	${message}
</body>
</html> --%>