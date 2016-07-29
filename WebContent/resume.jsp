<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume</title>
</head>
<body>
<h4><c:out value="${user.firstname} ${user.lastname}"/></h4>
<p>Career Objective: <c:out value="${user.careerobj}"/></p>
<p>Summary: <c:out value="${user.appsummary}"/></p>
<p>Contact: <c:out value="${user.phonenum} ${user.email}" /></p>
<h5>Skills</h5>
<ul>
<c:forEach var="skill" items="${user.hdzSkillappbridges}">
<li><c:out value="${skill.hdzSkill.skillname}: ${skill.experience}"/></li>
</c:forEach>
</ul>
<h5>Work history</h5>
<ul>
<c:forEach var="job" items="${user.hdzJobhistories}">
<li><c:out value="${job.position}: ${job.description}"/></li>
</c:forEach>
</ul>
<h5>Awards</h5>
<ul>
<c:forEach var="award" items="${user.hdzAwards}">
<li><c:out value="${award.awardname}: ${award.awardyear}"/></li>
</c:forEach>
</ul>
<h5>References</h5>
<ul>
<c:forEach var="ref" items="${user.hdzAwards}">
<li><c:out value="${ref.awardname}: ${ref.awardyear}"/></li>
</c:forEach>
</ul>
</body>
</html>