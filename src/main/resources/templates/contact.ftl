<!DOCTYPE html>
<html lang="en-US">
<head>
	<!-- HEADER IMPORT -->
	<#include "stubs/header.ftl"/>
	<title>Contact Us - Fan The Flame Dates</title>
</head>

<body class="boxedlayout">
	<div class="boxedcontent">

	<!-- BEGIN NAVBAR -->
	<#include "stubs/navbar.ftl"/>
	<!-- END NAVBAR -->
	
	<section class="colorarea">
		<div class="bgsizecover headeropacity" style="background-image:url(/static/img/headers/1.jpg);"></div>
	</section>

	<div class="container">
		<div class="row">
			<div class="col-md-12 negmtop">
				<h1 class="pgheadertitle animated fadeInLeft pull-left">Contact Us</h1>
				<span class="pagedescrarea text-right animated fadeInRight pull-right">
				<i>Basic contact style lore ipsum</i>
				</span>
			</div>
		</div>
	</div>
	<!-- end header -->
	<div class="container">
		<div class="row">
			<div class="col-md-12">
			
					<div class="shortcode row">
						<div class="col-md-6">
							<div class="box1">
								<div class="striped">
								</div>
								<h6><i class=" fa fa-envelope "></i> Get in Touch </h6>
								<div style="height: 5px">
								</div>
						
								<div class="done">
									<div class="alert alert-success">
										<button type="button" class="close" data-dismiss="alert">×</button>
										Your message has been sent. Thank you!
									</div>
								</div>
								<form method="post" action="contact.php" id="contactform">
									<div class="form">
										<input class="col-md-6" type="text" name="name" placeholder="Name">
										<input class="col-md-6" type="text" name="email" placeholder="E-mail">
										<textarea class="col-md-12" name="comment" rows="7" placeholder="Message"></textarea>
										<input type="submit" id="submit" class="btn btn-primary" value="Submit">
									</div>
								</form>

								<span class="boxlink wowhideme "><a href=" " class="defaultbutton mainthemebgcolor"><i class="fa fa-link"></i></a></span>
							</div>
						</div>
						<div class="col-md-6">
							<div class="box1">
								<div class="striped">
								</div>
								<h6><i class=" fa fa-map-marker "></i> Location </h6>
								<iframe class="gmap" style="width:100%; height:258px; margin:5px 0 10px 0; border:0px;" src="https://maps.google.com/maps?q=walmart&#038;hl=en&#038;ll=34.187666,-118.188343&#038;spn=0.086477,0.169086&#038;sll=34.155621,-118.32299&#038;sspn=0.010814,0.021136&#038;oq=wal&#038;t=h&#038;hq=walmart&#038;z=13&amp;output=embed">
								</iframe>
								
								<i class="fa fa-map-marker"></i> <i>Address</i>: 2536 Zamora Road, Missisipi, 74C<br/>
								
								<i class="fa fa-clock-o"></i> <i>Hours</i>: Monday &#8211; Friday, 09:00 &#8211; 17:00<br/>
								
								<i class="fa fa-envelope"></i> <i>E-mail</i>: <a href="mailto:wowthemesnet@gmail.com">wowthemesnet@gmail.com</a><br/>
								<span class="boxlink "><a href=" mailto:wowthemes.net " class="defaultbutton mainthemebgcolor"><i class="fa fa-link"></i></a></span>
							</div>
						</div>
					</div>			
			</div>
		</div>
	</div>
	<!-- end container -->

	<!-- BEGIN FOOTER -->
	<#include "stubs/footer.ftl"/>
	<!-- END FOOTER -->

	<!-- BEGIN SCRIPTS -->
	<#include "stubs/scripts.ftl"/>
	<!-- END SCRIPTS -->

</div><!-- end boxedcontent -->
</body>
</html>