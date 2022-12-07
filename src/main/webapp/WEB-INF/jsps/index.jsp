<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verification</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", Arial, Helvetica, sans-serif}
</style>
<body>
 <a href="/personal">Personal</a>
	<h3>Coupon Verification</h3>
	<form action="/" method="post">
		<input type="text" name="userId" placeholder="User id"/>
		<input type="text" name="couponID" placeholder="Coupon id"/>
		<input type="submit" value="Redeem Coupon"/>
	</form>
	
	<h4>List of Coupons</h4>

	<table>
		<tr>
			<td>Coupon ID</td>
			<th>Value</th>
			<th>Number of Uses</th>
		</tr>
		<c:forEach items="${coupons}" var="coupon">
			<tr>
				<td>${coupon.id}</td>
				<td>${coupon.valuePln}</td>
				<td>${coupon.numberOfUses}</td>
	
				<td>
					<form action="Redeem Coupon" method="post">
						<input type="hidden" name="id" value="${user.id}"/>
						<input type="hidden" name="id" value="${coupon.id}"/>
						<input type="submit" value="Redeem Coupon"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>