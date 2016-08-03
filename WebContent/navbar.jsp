<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
ul.nav a:hover { background-color: #A33FAF !important;}
</style>
<nav class="navbar navbar-default" style="background-color: #01579b; position: fixed; z-index: 1000; width:100%">
  <div class="container-fluid ">
    <div class="navbar-header" >
      <a class="navbar-brand " href="" style="color: #fff;font-weight: bold;font-size: 20px"><img src="./images/hdzlogo.png" height="30" width="54"/></a>
    </div>
    <ul class="nav navbar-nav">   	  
       <c:if test="${role =='applicant'}">  
      <li ><a href="yourapplications.jsp" style="color: #fff; font-weight: bold;font-size: 16px" >Your Applications</a></li> 
      <li ><a href="profile.jsp" style="color: #fff; font-weight: bold;font-size: 16px" >Profile</a></li>
      <li ><a href="./Jobs" style="color: #fff;font-weight: bold;font-size: 16px" >Jobs</a></li>
    </c:if>

     <c:if test="${role !='applicant'}"> 
      <li><a href="./PendingAction" style="color: #fff;font-weight: bold;font-size: 16px" >Pending Actions
      </a></li>
</c:if>

  
      

    
        <c:if test="${user != null}">  
      <li ><a href="<%=request.getContextPath() %>/Logout"  style="color: #fff;font-weight: bold;font-size: 16px">Log Out</a></li>
    </c:if>
    <c:if test="${user == null}"> 
    <li><a href="./Jobs" style="color: #fff;font-weight: bold;font-size: 16px" >Jobs</a></li>
     <li ><a href="login.jsp"  style="color: #fff;font-weight: bold;font-size: 16px">Log in</a></li>
    </c:if>
    </ul>
 
  </div>
</nav>
<div style="height:75px;"></div>