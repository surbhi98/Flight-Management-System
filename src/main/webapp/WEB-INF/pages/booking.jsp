<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Booking details</title>

<style>
td {align: center;}
table, th, td {
  border: 1px solid black;
} 
body {
background-color: #ccffdc;
 }
</style>

</head>

<body>
<center>

<h2>Your upcoming Bookings List</h2>

<c:if test="${!empty getAllBookings}">

	<table class="tg">

	<tr>

		<th width="80">Booking Id</th>

		<th width="120">User Id</th>

		<th width="120">Flight Id</th>

		<th width="120">PAX</th>

		<th width="60">Price</th>

	

	</tr>

	<c:forEach items="${getAllBookings}" var="booking">

		<tr>

			<td>${booking.bookingId}</td>

			<td>${booking.userId}</td>

			<td>${booking.flightId}</td>

			<td>${booking.nop}</td>

			<td>${booking.totalprice}</td>
			
	
<td><a href="<c:url value='/removebooking/${booking.bookingId}' />" >Remove Flight</a></td>
		</tr>

	</c:forEach>

	</table>

</c:if>
<a href="/back">Go to Dashboard</a>
</center>

</body>

</html>