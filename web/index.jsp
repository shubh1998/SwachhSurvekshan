<%-- 
    Document   : index.jsp
    Created on : Apr 22, 2018, 7:30:59 PM
    Author     : RAJESH
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- your webpage info goes here -->

    <title>SwachhSurvekshan.com</title>
	<link rel="icon" type="image/png" href="images/enak1.png"/>
	<link rel="stylesheet" href="css/responsive.css">
	
<!-- you should always add your stylesheet (css) in the head tag so that it starts loading before the page html is being displayed -->	
	<link rel="stylesheet" href="css/style.css" type="text/css" />
	<meta name="viewport" contant="width=device-width, initial-scale=1.0">
	
</head>
<body>

<!-- webpage content goes here in the body -->
	
	    <%@include file="header.jsp" %>
	<section>
			<img class="mySlides" src="images/c1.jpg" height=420vh style="width:100%">
			<img class="mySlides" src="images/c2.jpg" height=420vh style="width:100%">
			<img class="mySlides" src="images/c3.jpg" height=420vh style="width:100%">
			<img class="mySlides" src="images/c4.jpg" height=420vh style="width:100%">
			<img class="mySlides" src="images/c5.jpg" height=420vh style="width:100%">
			<img class="mySlides" src="images/c6.jpg" height=420vh style="width:100%">
	</section>


		<script>
		// Automatic Slideshow - change image every 3 seconds
			var myIndex = 0;
			carousel();

			function carousel() 
			{
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) 
			{
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {myIndex = 1}
			x[myIndex-1].style.display = "block";
			setTimeout(carousel, 3000);
			}
		</script>

		
  		<div id= "logo">
			
			<h1><a href="/" id="logoLink"; style= "font-size:22px ; color:orange" align = "left"><br/><br/>
                            <b>Swachh </b></a> <a href="#" id="logoLink"; style= "font-size:22px ; color:green" align = "left"> 
                            <b>Sarvekshan</b></a> <a href="#" id="logoLink"; style= "font-size:22px ; color:black" align = "left"> 
                            <b>2018</b></a></h1>
                </div><br><br><br><br><br>
	
	
		<div>
			<img src="images/swachhbharat.jpg" alt="" width="400px" height="200px" align="right">
			<p>
				As a prelude to encouraging cities to improve urban sanitation, Minister of Housing and Urban Affairs (formerly Ministry of Urban Development) had conducted 'Swachh Survekshan-2016' survey for the rating of 73 cities in January 2016 followed by 'Swachh Survekshan-2017' conducted in January- February 2017 ranking 434 cities. In a bid to scale up the coverage of the ranking exercise and encourage towns and cities to actively implement mission initiatives in a timely and innovative manner, MoHUA now proposes to conduct its third survey to rank all 4041 cities based on assessment of progress from January 2017 till December 2017 under Swachh Bharat Mission-Urban (SBM-U).
			</p><br/>
			<img src="images/enak.jpg" alt="" width="400ppx" height="200px" align="left">
			<p> 
				The objective of the survey is to encourage large scale citizen participation and create awareness amongst all sections of society about the importance of working together towards making towns and cities a better place to live in. Additionally, the survey also intends to foster a spirit of healthy competition among towns and cities to improve their service delivery to citizens, towards creating cleaner cities.  
			</p>
			<p>
				In order for cities to reap the maximum developmental bene ts from the survey, concerted efforts are being taken to strengthen the capacities of the cities to understand the modalities and spirit of the survey. In addition to giving towns and cities more time to prepare for the survey, there will be intensive interactions with ULBs to familiarize them with the survey methodology, survey process and output indicators, and also clarifying their expectations from the survey. 
			</p>
			<p>
				Since citizen participation is a very crucial component of this survey, social media and other traditional media channels will be used strategically at both national, state and city levels in order to educate citizens about the objectives of the survey and survey methodology, as well as to reinforce the importance of their participation in the survey, in order to ensure signi cantly higher levels of participation from all citizens. 

			</p>
		</div>
		<div>
			<video width="600" height="340" controls>
				<source src="video/video.mp4" type="video/mp4">
				Your browser does not support the video tag.
			</video>
			<video width="600" height="340" controls>
				<source src="video/video1.mp4" type="video/mp4">
				Your browser does not support the video tag.
			</video>
		</div>
		<div id="footer">
			<p>
				Webpage made by <a href="/" target="_blank">[Shubham Gupta]</a>
			</p>
		</div>
	</div>
</body>
</html>