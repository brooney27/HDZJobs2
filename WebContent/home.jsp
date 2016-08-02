<!DOCTYPE html>
<html>
<title>HDZ Jobs</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif;}
body, html {
    height: 100%;
    color: #777;
    line-height: 1.8;
}

/* Create a Parallax Effect */
.bgimg-1, .bgimg-2, .bgimg-3 {
    opacity: 0.7;
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

/* First image (Logo. Full height) */
.bgimg-1 {
    background-image: url('images/home1.jpg');
    min-height: 100%;
}

/* Second image (Portfolio) */
.bgimg-2 {
    background-image: url("images/home2.jpg");
    min-height: 400px;
}

/* Third image (Contact) */
.bgimg-3 {
    background-image: url("images/home3.jpg");
    min-height: 400px;
}

.w3-wide {letter-spacing: 10px;}
.w3-hover-opacity {cursor: pointer;}

#googleMap {
    width: 100%;
    height: 400px;
    -webkit-filter: grayscale(90%);
    filter: grayscale(90%);
}

/* Turn off parallax scrolling for tablets and mobiles */
@media only screen and (max-width: 1024px) {
    .bgimg-1, .bgimg-2, .bgimg-3 {
        background-attachment: scroll;
    }
}
</style>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top">
  <ul class="w3-navbar" id="myNavbar">
    <li><a href="./login.jsp" class="w3-padding-large">LOG IN</a></li>
    <li class="w3-hide-small w3-right">
      <a href="./Jobs" class="w3-padding-large w3-hover-red"><i class="fa fa-search"> Search Jobs</i></a>
    </li>
  </ul>
</div>

<!-- First Parallax Image with Logo Text -->
<div class="bgimg-1 w3-opacity w3-display-container">
  <div class="w3-display-middle" style="white-space:nowrap;">
     <span class="w3-center w3-padding-xlarge w3-black w3-xlarge w3-wide w3-animate-opacity">HDZ<span class="w3-hide-small">JOBS</span></span>
  </div>
</div>

<!-- Container (About Section) -->
<div class="w3-content w3-container w3-padding-64" id="about">

  <h3 class="w3-center">ABOUT US</h3>
  <p class="w3-center"><em>Jobs at HDZ</em></p>
  <p>Innovation is'nt easy. Or quick to come by. So ours is challenging workplace where teams are diverse,competitive and continually searching for tomorrow's technology and the brilliant minds to create it.</p>
  <div class="w3-row">
    <div class="w3-col m6 w3-center w3-section">
      <p><b>Our Company</b></p><br>
      <img src="./images/hdzlogowhite.png" height="160" width="280"/>
    </div>

    <!-- Hide this text on small devices -->
    <div class="w3-col m6 w3-hide-small w3-section">
      <p>Have you ever wondered what it is like to work at HDZ?  We see the everyday as a bar that continually needs to be raised. Step inside our world and you will find one brilliant mind after another. You'll find everything from scientists and engineers to accountants and MBAs, all working together in a spirit of collaboration. We believe people should make informed decisions about their future, and for this reason we invite you to attend a number of Intel-sponsored recruiting or virtual event offerings and learn about the various opportunities for you across the company.
Our employees' passion for innovation drives new technologies that solve real-world challenges across the globe.</p>
    </div>
  </div>
</div>

<!-- Second Parallax Image with Portfolio Text -->
<div class="bgimg-2 w3-display-container">
  <div class="w3-display-middle">
    <span class="w3-xxlarge w3-text-light-grey w3-wide">HDZ Jobs</span>
  </div>
</div>

<!-- Container (Portfolio Section) -->
<div class="w3-content w3-container w3-padding-64">
  <h3 class="w3-center">WANT TO WORK AT HDZ</h3>
  <p class="w3-center"><em>Life at HDZ<br> </em></p><br>

  <!-- Responsive Grid. Four columns on tablets, laptops and desktops. Will stack on mobile devices/small screens (100% width) -->
  <div class="w3-row-padding w3-center">
    <div class="w3-col m3">
      <img src="images/img_p1.jpg" style="width:100%;height:160px"  onclick="location.href = './Jobs';" class="w3-hover-opacity">  
       <div>Candidate Help</div> 
    </div>
    

    <div class="w3-col m3">
      <img src="images/img_p2.jpeg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
    <div>Check out our benefit</div> 
    </div>

    <div class="w3-col m3">
      <img src="images/img_p3.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
    <div>Explore opportunities</div>
    </div>

    <div class="w3-col m3">
      <img src="images/img_p4.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
	<div>Fun at Work</div> 
    </div>
  </div>

  <div class="w3-row-padding w3-center w3-section">
    <div class="w3-col m3">
      <img src="images/img_p5.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
    <div>Interview Process</div> 
    </div>

    <div class="w3-col m3">
      <img src="images/img_p6.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
  <div>Attend Our Job Fair</div>
    </div>

    <div class="w3-col m3">
      <img src="images/img_p7.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
    <div>Jobs @HDZ BLOG</div>
    </div>

    <div class="w3-col m3">
      <img src="images/img_p8.jpg" style="width:100%;height:160px" onclick="location.href = './Jobs';" class="w3-hover-opacity">
    <div>Why Work @ HDZ?</div> 
    </div>
  </div>
</div>

<!-- Modal for full size images on click-->
<div id="modal01" class="w3-modal w3-black" onclick="this.style.display='none'">
  <span class="w3-closebtn w3-hover-red w3-text-white w3-xxxlarge w3-container w3-display-topright">×</span>
  <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
    <img id="img01" style="max-width:100%">
  </div>
</div>

<!-- Third Parallax Image with Portfolio Text -->
<div class="bgimg-3 w3-display-container">
  <div class="w3-display-middle">
     <span class="w3-xxlarge w3-text-light-grey w3-wide">CONTACT</span>
  </div>
</div>

<!-- Container (Contact Section) -->
<div class="w3-content w3-container w3-padding-64">
  <h3 class="w3-center">Location</h3>
  <p class="w3-center"><em>We'd love your feedback!</em></p>

  <div class="w3-row w3-padding-32 w3-section">
    <div class="w3-col m4 w3-container">
      <!-- Add Google Maps -->
      <div id="googleMap" class="w3-round-large"></div>
    </div>
    <div class="w3-col m8 w3-container w3-section">
      <div class="w3-large w3-margin-bottom">
        <i class="fa fa-map-marker w3-hover-text-black" style="width:30px"></i> Rockville, US<br>
        <i class="fa fa-phone w3-hover-text-black" style="width:30px"></i> Phone: +1 (301) 354-8600<br>
        <i class="fa fa-envelope w3-hover-text-black" style="width:30px"> </i> Email: mail@mail.com<br>
      </div>
      <p>Ask Questions:</p>
      <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
        <div class="w3-half">
          <input class="w3-input w3-border w3-hover-light-grey" type="text" placeholder="Name">
        </div>
        <div class="w3-half">
          <input class="w3-input w3-border w3-hover-light-grey" type="text" placeholder="Email">
        </div>
      </div>
      <input class="w3-input w3-border w3-hover-light-grey" type="text" placeholder="Comment">
      <button class="w3-btn w3-section w3-right">SEND</button>
    </div>
  </div>
</div>

<!-- Footer -->

 
<!-- Add Google Maps -->
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
var myCenter = new google.maps.LatLng(39.083997, -77.152758);

function initialize() {
var mapProp = {
  center:myCenter,
  zoom:12,
  scrollwheel:false,
  draggable:false,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker = new google.maps.Marker({
  position:myCenter,
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);

// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
}

// Change style of navbar on scroll
window.onscroll = function() {myFunction()};
function myFunction() {
    var navbar = document.getElementById("myNavbar");
    if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
        navbar.className = "w3-navbar" + " w3-card-2" + " w3-animate-top" + " w3-white";
    } else {
        navbar.className = navbar.className.replace(" w3-card-2 w3-animate-top w3-white", "");
    }
}
</script>

</body>
</html>
