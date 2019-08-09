<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Flight Details</title>
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


<h1>Flight List</h1>

<c:if test="${!empty listflights}">

	<table class="tg">

	<tr>

		<th width="80">Flight ID</th>

		<th width="120">Source</th>

		<th width="120">Destination</th>

		<th width="120">Date</th>

		<th width="60">Price</th>

		<th width="60">Departure Time</th>

		<th width="60">Arrival Time</th>

	</tr>

	<c:forEach items="${listflights}" var="flight">

		<tr>

			<td >${flight.flightId}</td>

			<td>${flight.source}</td>

			<td>${flight.destination}</td>

			<td>${flight.date}</td>

			<td>${flight.price}</td>

			<td>${flight.depTime}</td>

			<td>${flight.arrTime}</td>

			

			<td><a href="<c:url value='/bookings/${flight.flightId}/${flight.price}' />" >Book this flight</a></td>

			

		</tr>

	</c:forEach>

	</table>

</c:if>
<c:if test="${empty listflights}">
<h2>No flights found, please modify the search filters</h2>
</c:if>
<a href="/search">Search again</a>
</center>

</body>

</html>