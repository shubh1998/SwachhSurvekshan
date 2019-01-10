<%-- 
    Document   : register
    Created on : Apr 22, 2018, 7:34:55 PM
    Author     : RAJESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>
	<title>RegistrationForm</title>
	<link rel="stylesheet" href="css/loginstyle.css">
	<link rel="stylesheet" href="css/responsive.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="icon" type="image/png" href="images/enak1.png"/>
<meta name="viewport" contant="width=device-width, initial-scale=1.0">
</head>

<body class= "register">
	    <%@include file="header.jsp" %>
	<div>
		<h1 style="text-align:center; font-family:Georgia, serif; color:white; font-size: 25px;">Register Here</h1><br/><br/>
		<form action="#">
			<div class="row">
				<div class="col-25">
					<label for="name">Name</label>
				</div>
				<div class="col-75">
					<input type="text" name="uname" placeholder="Your full name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="email">Email</label>
				</div>
                            
				<div class="col-75">
					<input type="email" name="email" placeholder="swachhsarvekshan@gmail.com">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="DOB">DOB</label>
				</div>
				<div class="col-75">
					<input type="date" name="DOB" placeholder="DD/MM/YYYY">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="contact">Contact no.</label>
				</div>
				<div class="col-75">
					<input type="tel" name="contact" placeholder="9876543210">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="address">Address</label>
				</div>
				<div class="col-75">
					<input type="text" name="address" placeholder="gumasta nagar, ranjeet hanuman road">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="city">City</label>
				</div>
				<div class="col-75">
					<input type="text" name="city" placeholder="Indore">
				</div>
			</div>
		
			<div class="row">
				<div class="col-25">
					<label>Gender</label>
				</div>
				<div class="col-75">
					<select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Other">Other</option>
					</select>
				</div>
			</div>
			
			<div class="row">
				<div class="col-25">
					<label for="upass">Set Password</label>
				</div>
				<div class="col-75">
                <input type="password" name="upass" placeholder="Password">
				</div>
			</div>
			
			
			<div class="row">
				<input type="submit" value="Submit">
				
			</div>
		</form>
	</div>
</body>

</html>