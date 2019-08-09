<%@ page language="java" contentType="text/html; charset=ISO-8859-1"



    pageEncoding="ISO-8859-1"%>



    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>



<!DOCTYPE html>



<html>



<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 


<meta charset="ISO-8859-1">



<title>User's Options</title>

<style>
body {
background-color:  #b3ffcb;
padding: 40px;
 }
 
 div { background-color:  #ccffdc;}

h2{color : blue; }
</style>

</head>



<body>






<center>
<h2 >Welcome ${uname}!</h2>
<img src="http://blog.raynatours.com/wp-content/uploads/2016/07/booking-flight.jpg">
<br><br>
<div>
<a href="/search" class="btn btn-info" role="button"  >Search Flights</a><br><br><br>
  <a href="/bookings" class="btn btn-info" role="button" >Display bookings</a>

</div>

</center>


</body>



</html>