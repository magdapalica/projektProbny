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
	<h3>My Favorite Places</h3>
	<form action="/" method="post">
		<input type="text" name="userId" placeholder="User id"/>
		<input type="text" name="couponID" placeholder="Coupon id"/>
		<input type="submit" value="Check Coupon"/>
	</form>
	<table>
		<tr>
			<td>User ID</td>
			<th>Coupon ID</th>
		</tr>
		<c:forEach items="${users}" var="verification">
			<tr>
				<td>${verification.user.id}</td>
				<td>${verification.coupon.id}</td>
				<td>
					<form action="checkCoupon" method="post">
						<input type="hidden" name="id" value="${user.id}"/>
						<input type="hidden" name="id" value="${coupon.id}"/>
						<input type="submit" value="Check"/>
					</form>
				</td>
			</tr>
		</c:forEach>
 <a href="/personal" >Personal</a>
	</table>
</body>
</html>