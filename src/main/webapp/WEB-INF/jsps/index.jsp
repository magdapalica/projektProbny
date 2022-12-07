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
 <a href="/add">Add</a>
 
	<h3>Coupon Verification</h3>
	<form action="/" method="post">
		<input type="text" name="userId" placeholder="User Id"/>
		<input type="text" name="couponID" placeholder="Coupon Id"/>
		<input type="submit" value="Redeem Coupon"/>
	</form>
	<table>
		<tr>
			<td>User ID</td>
			<th>Coupon ID</th>
		</tr>
		
		<c:forEach items="${redeems}" var="redeem">
			<tr>
				<td>${redeem.user.id}</td>
				<td>${redeem.coupon.id}</td>
		</tr>
		</c:forEach>
	</table>
	<h4>List of Coupons</h4>
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
	<h4>List of Persons</h4>
	<table>
		<tr>
			<td>User ID</td>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Total Price</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.totalPrice}</td>
		</tr>
		</c:forEach>
	</table>			
</body>
</html>