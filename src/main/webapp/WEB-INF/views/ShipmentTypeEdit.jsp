<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>

	<h3>Welcome to ShipmentType Edit Page</h3>

	<form:form action="update" method="POST" modelAttribute="shipmentType">
		<pre>
Ship Id:<form:input path="shipId" readOnly="true"/>
Shipment Mode:
<form:select path="shipMode">
<form:option value="">SELECT</form:option>
<form:option value="AIR">AIR</form:option>
<form:option value="TRUCK">TRUCK</form:option>
<form:option value="SHIP">SHIP</form:option>
<form:option value="TRAIN">TRAIN</form:option>
</form:select>
Shipment Code:
<input type="text" name="shipCode"/>
Enable Shipment:
<form:select path="enbShip">
<form:option value="">-SELECT-</form:option>
<form:option value="YES">YES</form:option>
<form:option value="NO">NO</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="shipGrade" value="A"/>A
<form:radiobutton path="shipGrade" value="B"/>B
<form:radiobutton path="shipGrade" value="C"/>C
Description:
<form:textarea path="shipDesc"/>
<input type="submit" value="update"/>
</pre>
	</form:form>
	${message}
</body>
</html>