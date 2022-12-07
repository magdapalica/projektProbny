<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Coupon</title>
</head>
<body>

<h4>List of Coupons</h4>
	<form action="/add" method="post">
		<input type="text" name="value" placeholder="Number Of Uses"/>
		<input type="text" name="number" placeholder="Value"/>
		<input type="submit" value="Add Coupon"/>
	</form>
	<table>
		<tr>
			<td>Coupon ID</td>
			<th>Number of Uses</th>
			<th>Value</th>
		</tr>
		<c:forEach items="${coupons}" var="coupon">
			<tr>
				<td>${coupon.id}</td>
				<td>${coupon.numberOfUses}</td>
				<td>${coupon.valuePln}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html> 