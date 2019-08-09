
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
<style>
td {align: center;}
body {
background-color: #ccffdc;
 }
</style>

<meta charset="ISO-8859-1">

<title>Search Flights</title>

</head>

<body>


<center>
<form:form action = "/flightfilter" modelAttribute="flight">

<h2>Search flights by your choice!!</h2>

Source<form:input type = "textbox" path="source" name="source" /><br/>

Dest:<form:input type = "textbox" path="destination" name="destination" /><br/>

Date:<form:input type = "textbox" path="date" name="date" /><br/>


<input type="submit" class="btn btn-info" value="Search">
</form:form>
<a href="/back">Go to Dashboard</a>
</center>
</body>

</html>