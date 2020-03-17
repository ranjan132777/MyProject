<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>
<H3> WELCOME SHIPMENTTYPE REGISTER PAGE</H3>
<form:form action="save" method="POST" modelAttribute="shipmentType">
<pre>
Shipment Mode:
<form:select path="shipMode">
<form:option value="">--Select--</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Truck">Truck</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
</form:select>
Shipment Code:
<form:input path="shipCode"/>
Enable Shipment:
<form:select path="enbShip">
<form:option value="">--Select--</form:option>
<form:option value="Yes">Yes</form:option>
<form:option value="No">No</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="shipGrade" value="A"/>A
<form:radiobutton path="shipGrade" value="B"/>B
<form:radiobutton path="shipGrade" value="C"/>C
Description:
<form:textarea path="shipDesc"/>
<input type="submit" value="Create"/>
</pre>
</form:form>
${message}
</body></html>









