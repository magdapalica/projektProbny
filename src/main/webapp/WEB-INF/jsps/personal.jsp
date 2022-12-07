<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Personal</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Raleway", Arial, Helvetica, sans-serif
}
</style>
</head>
<body>

<div class="w3-bar w3-white w3-large">
</div>
	
		<div class="w3-bar w3-white w3-large">
			<h2 >Welcome ${user.getId()}</h2>
			<h3 >Your Personal Information</h3>
			<div >
				<p>User ID: ${user.getId()}</p>
				<p>First Name: ${user.getFirstName()}</p>
				<p>Last Name: ${user.getLastName()}</p>
				<p>Total Price: ${user.getTotalPrice()}</p>
				<p>List of coupons : ${user.getCoupons()}</p>
				
	<table>
			<td>Coupon ID</td>
			<th>Value</th>
			<th>Number of Uses</th>
		</tr>
	</div>
		<c:forEach items="${coupons}" var="coupon">
			<tr>
				<td>${coupon.id}</td>
				<td>${coupon.valuePln}</td>
				<td>${coupon.numberOfUses}</td>
	
			</tr>
		</c:forEach>
	
	</table>

			</div>
		</div>
	</div>
	
	<h4>List of Persons</h4>
	<form action="/personal" method="post">
		<input type="text" name="name" placeholder="First Name"/>
		<input type="text" name="lastName" placeholder="Last Name"/>
		<input type="text" name="price" placeholder="Total Price"/>
		<input type="submit" value="Add Person"/>
	</form>
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
	
<a href="/" > </i>Back</a>

</body>
</html>