<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save" method="post"></form>
	<h3>Welcome to WHUserType Register Page</h3>
	<pre>
	User Type:<input type="radio" name="userType" value="A">
<input type="radio" name="orderMode" value="vendor">
<input type="radio" name="orderMode" value="customer">


	user Id Type:<select name="whusertype ">
<option>--select--</option>
<option>PANCARD</option>
<option>AADHARCARD</option>
<option>VOTER ID</option>
<option>OTHER</option>

</select>
User For AutoFill:
<option>sale </option>
<option>purchase</option>


<input type="submit" value="CREATE WHUserType" />
</pre>
	${message}
</body>
</html>

