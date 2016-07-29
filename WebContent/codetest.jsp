<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Code Test</title>
</head>
<body>
<form action="GradeCodeTest">
<input type="hidden" name="appid" id="appid" value="${application.applicationid}"/>
<c:forEach var="q" items="${questions}">
<p><c:out value="${q.question}"/></p>
<input type="text" name="response${q.codingquestid}"/>
<input type="hidden" name="answer${q.codingquestid}" value="${q.answer}"/>
</c:forEach>
<input type="submit" name="submit" id="submit"/>
</form>
</body>
</html>