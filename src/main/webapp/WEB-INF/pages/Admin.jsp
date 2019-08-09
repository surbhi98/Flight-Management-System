	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body bgcolor="black" text="white">
<center>
<h1>Admin access for flight management</h1>
<c:url var="addAction" value="/flight/add" ></c:url>

<f:form action="${addAction}" modelAttribute="flight">


<table>
	<tr>
		<td>
			<f:label path="flightId">
				<spring:message text="Flight Id"/>
			</f:label>
		</td>
		<td>
			<f:input path="flightId" size="8"   />
			
		</td> 
	</tr>
	<%-- </c:if> --%>
	<tr>
		<td>
			<f:label path="source">
				<spring:message text="Source"/>
			</f:label>
		</td>
		<td>
			<f:input path="source" />
		</td> 
	</tr>
	<tr>
		<td>
			<f:label path="destination">
				<spring:message text="Destination"/>
			</f:label>
		</td>
		<td>
			<f:input path="destination" />
		</td>
	</tr>
	<tr>
		<td>
			<f:label path="date">
				<spring:message text="Date"/>
			</f:label>
		</td>
		<td>
			<f:input path="date" />
		</td>
	</tr>
	<tr>
		<td>
			<f:label path="price">
				<spring:message text="Price"/>
			</f:label>
		</td>
		<td>
			<f:input path="price" />
		</td>
	</tr>
	<tr>
		<td>
			<f:label path="depTime">
				<spring:message text="Departure Time"/>
			</f:label>
		</td>
		<td>
			<f:input path="depTime" />
		</td>
	</tr>
	<tr>
		<td>
			<f:label path="arrTime">
				<spring:message text="Arrival Time"/>
			</f:label>
		</td>
		<td>
			<f:input path="arrTime" />
		</td>
	</tr>
	<tr>
		
		<td colspan="2">
				<input type="submit"
					value="<spring:message text="Add Flight"/>" />
			</td>
		
	</tr>
</table>
</f:form>

<br>
<h3>Flight List</h3>
<c:if test="${!empty listflights}">
	<table class="tg">
	<tr>
		<th width="80">Flight Id</th>
		<th width="120">Source</th>
		<th width="120">Destination</th>
		<th width="120">Date</th>
		<th width="60">Price</th>
		<th width="60">Departure Time</th>
		<th width="60">Arrival Time</th>
		
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listflights}" var="flight">
		<tr>
			<td>${flight.flightId}</td>

			<td>${flight.source}</td>

			<td>${flight.destination}</td>

			<td>${flight.date}</td>

			<td>${flight.price}</td>

			<td>${flight.depTime}</td>

			<td>${flight.arrTime}</td>

			
			<td><a href="<c:url value='/removeflightbyadmin/${flight.flightId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</center>
</body>
</html>