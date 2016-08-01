<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
<jsp:include page="bootstrap.jsp" />
<title>Your Applications</title>
<script>
$(document).ready(function() {
	$(".btn-pref .btn").click(function () {
	    $(".btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
	    // $(".tab").addClass("active"); // instead of this do the below 
	    $(this).removeClass("btn-default").addClass("btn-primary");   
	});
	});
</script>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="col-sm-10 col-sm-offset-1">
	<div class="card hovercard">
	<img src="${gravatar}">
	<h2>
		<c:out value="${user.firstname} ${user.lastname}" />
	</h2>
	<p>
		Career Objective:
		<c:out value="${user.careerobj}" />
	</p>
	<p>
		Summary:
		<c:out value="${user.appsummary}" />
	</p>
	<p>
		Contact:
		<c:out value="${user.phonenum} ${user.email}" />
	</p>
	<div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
        <div class="btn-group" role="group">
            <button type="button" id="jobhistory" class="btn btn-primary" href="#tab1" data-toggle="tab">
                <div class="hidden-xs">Job History</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="skills" class="btn btn-default" href="#tab2" data-toggle="tab">
                <div class="hidden-xs">Skills</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="education" class="btn btn-default" href="#tab3" data-toggle="tab">
                <div class="hidden-xs">Education</div>
            </button>
        </div>
        <div class="btn-group" role="group">
            <button type="button" id="awards" class="btn btn-default" href="#tab4" data-toggle="tab">
                <div class="hidden-xs">Awards</div>
            </button>
        </div>
    </div>
	
	
	  <div class="well">
      <div class="tab-content">
      <div class="tab-pane fade in active" id="tab1">
	<h4>Job History</h4>
	<table class="table table-bordered table-striped table-hover">
		<tr>
			<th>Title</th>
			<th>Company</th>
			<th>Description</th>
			<th>From</th>
			<th>To</th>
		</tr>
		<c:forEach var="job" items="${user.hdzJobhistories}">
			<tr>
				<td>${job.position}</td>
				<td>${job.companyname}</td>
				<td>${job.description}</td>
				<td>${job.startdate}</td>
				<td>${job.enddate}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="tab-pane fade in" id="tab2">
	<h4>Skills</h4>
	<table class="table table-bordered table-striped table-hover">
		<tr>
			<th></th>
			<th>Years</th>
		</tr>
		<c:forEach var="skill" items="${user.hdzSkillappbridges}">
			<tr>
				<td>${skill.hdzSkill.skillname}</td>
				<td>${skill.experience}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="tab-pane fade in" id="tab3">
	<h4>Education</h4>
	<table class="table table-bordered table-striped table-hover">
		<tr>
			<th>Institution</th>
			<th>Degree</th>
			<th>Year</th>
		</tr>
		<c:forEach var="edu" items="${user.hdzEducations}">
			<tr>
				<td>${edu.schoolname}</td>
				<td>${edu.degreecompleted}</td>
				<td>${edu.datecompleted}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div class="tab-pane fade in" id="tab4">
	<h4>Awards</h4>
	<table class="table table-bordered table-striped table-hover">
		<tr>
			<th>Award name</th>
			<th>Year Received</th>
		</tr>
		<c:forEach var="award" items="${user.hdzAwards}">
			<tr>
				<td>${award.awardname}</td>
				<td>${award.awardyear}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<a href="./resume.jsp">View Resume</a>
	</div>
	</div>
</body>
</html>