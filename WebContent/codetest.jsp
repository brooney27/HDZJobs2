<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%

	
%> 
<fmt:setLocale value="en_US"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pending Actions Details</title>
<jsp:include page="bootstrap.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="css/mycss.css" />
</head>
<body >

<script language="javascript" type="text/javascript">
function limitText(limitField, limitCount, limitNum) {
	if (limitField.value.length > limitNum) {
		limitField.value = limitField.value.substring(0, limitNum);
	} else {
		limitCount.value = limitNum - limitField.value.length;
	}
}


</script>

<jsp:include page="navbar.jsp" />


<form action="GradeCodeTest">

<div class="container" Style="width:600px">
<input type="hidden" name="appid" id="appid" value="${application.applicationid}"/>
<table border="1" align="center" class="table responstable table-bordered table-hover">
<thead align="center">
<tr align="center">
<th align="center"><div align="center">Questions</div></th>
<th align="center"><div align="center">Answers</div></th>
</tr>
</thead>
 <tbody>
<c:forEach var="q" items="${questions}">
<tr>   
    <td align="center">   
<c:out value="${q.question}"/></td>
<td align="center"> 
<input type="text" name="response${q.codingquestid}"/>
<input type="hidden" name="answer${q.codingquestid}" value="${q.answer}"/></td>
</tr>
</c:forEach>
</tbody>
</table>
<div align="center"><input type="submit" name="submit" id="submit"/></div>
</div>
</form>



</body>
</html>


