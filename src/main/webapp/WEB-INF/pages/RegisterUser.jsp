<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix ="form" %>

 <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %> 

 <%@taglib uri = "http://www.springframework.org/tags" prefix ="t" %>

<!DOCTYPE html>

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 

<meta charset="ISO-8859-1">

<title>Registration form</title>

<script>



function validateForm()

{	//alert("welcome");
	document.getElementById("wname").innerHTML = "";
	document.getElementById("wphone").innerHTML = "";
	document.getElementById("wpass").innerHTML = "";

	var name = document.forms["registerForm"]["userName"].value;

	var x = document.forms["registerForm"]["phone"].value;

	var p = document.forms["registerForm"]["password"].value;

	//var cp = document.forms["registerForm"]["cpassword"].value;

	

	if(name.length==0){

		document.getElementById("wname").innerHTML = "Name must not be empty!!";

		return false;

	}

	if(x.length!=10)

		{document.getElementById("wphone").innerHTML = "Contact number must be 10 digits!!";

			return false;

		}

	 if(p.length<8) {

		document.getElementById("wpass").innerHTML = "Password must be atleast 8 digits!!";

		return false;

		

	}

	 return true;

	

	}



</script>

<style>

#wphone { color: red; }

#wname {color: red;}

#wpass { color: red; }

body {
background-color:  #b3ffcb;
padding: 40px;
 }
 
 div { background-color:  #ccffdc;}



</style>



</head>

<body>

<h2 align ="center">User Registration</h2>

<br><br><br>

<center>
<a href="/home">HOME</a>
<div>
<form:form action = "/addUser" modelAttribute="user"  onsubmit = "return validateForm()" name ="registerForm">

<table>

<tr>
<td>User id:</td><td> <form:input path = "userId" name = "userId" placeholder="Enter User ID"/></td><td></td>
</tr>
<tr>
<td>User Name: </td>
<td><form:input path = "userName" name = "userName" placeholder="Enter UserName here"/></td>
<td><span  id ="wname"></span></td>
</tr>
<tr>
<td>Password: </td>
<td><form:input path = "password" name="password" type = "password" placeholder="Minimum 8 characters"/>
</td>
<td>
<span  id ="wpass"></span>
</td>
</tr>



<tr>
<td>Contact Number:</td>
<td><form:input path = "phone" name = "phone"/></td>
<td><span  id ="wphone"></span></td>
</tr>


<tr>
<td></td>
<td><input type="submit" class="btn btn-info" value="Register"> </td>

</tr>
</table>


</form:form>
</div>
</center>

</body>

</html>