<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<html><body>
<H3> WELCOME PART REGISTER PAGE</H3>
<form:form action="save" method="POST" modelAttribute="part">
<pre>
 Code:
<form:input path="partCode"/>
Dimentions:
<form:radiobutton path="partLen" value="W"/>W
<form:radiobutton path="partWid" value="L"/>L
<form:radiobutton path="partHgt" value="H"/>H
 Base Cost:
<form:input path="basecost"/>
Base Currency:
<form:select path="uomOb.id" Class="form-control">
<form:option value="">--Select--</form:option>
<form option items="${uomMap }"/>
</form:select>
<form:select path="omSaleOb.orderId" class="form-control">
<form:option value="">--Select--</form:option>
<form option items="${omSaleMap }"/>
</form:select>

<form:select path="omPurchaseOb.orderId" class="form-control">
<form:option value="">--Select--</form:option>
<form option items="${omPurchaseMap }"/>
</form:select>
<form:select path="BaseCurrency"/>
<form:option value="">--Select--</form:option>
<form:option value="INR">INR</form:option>
<form:option value="USD">USD</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="ERU">ERU</form:option>
Uom:
 <form:select path="uomOb.id">
<form:option value="">-SELECT-</form:option>
<form:option value="${uomList}"  itemValue="id" itemLabel="UomModel"/>
 </form:select>
Note:
<form:textarea path="Note"/>
<input type="submit" value="Create"/>
</pre>
</form:form>
${message}
</body></html>










