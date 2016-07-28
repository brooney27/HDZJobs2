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
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
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
	<h4>Job History</h4>
	<table>
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
	<h4>Skills</h4>
	<table>
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
	<h4>Education</h4>
	<table>
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
	<h4>Awards</h4>
	<table>
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
</body>
</html>