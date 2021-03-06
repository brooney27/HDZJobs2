<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script src="javascripts/home.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<style>
#draggable {
	width: 0px;
	height: 0px;
	padding: 0em;
}

#resizable {
	width: 150px;
	height: 150px;
	padding: 0.5em;
}

#resizable h3 {
	text-align: center;
	margin: 0;
}

#red, #green, #blue {
	float: left;
	clear: left;
	width: 300px;
	margin: 15px;
}

#swatch {
	width: 120px;
	height: 100px;
	margin-top: 18px;
	margin-left: 350px;
	background-image: none;
}

#red .ui-slider-range {
	background: #ef2929;
}

#red .ui-slider-handle {
	border-color: #ef2929;
}

#green .ui-slider-range {
	background: #8ae234;
}

#green .ui-slider-handle {
	border-color: #8ae234;
}

#blue .ui-slider-range {
	background: #01579b;
}

#blue .ui-slider-handle {
	border-color: #01579b;
}
</style>
<script src="js/pendingAction.js"></script>
<title>Pending Actions</title>
</head>
<body id="body" class="ui-widget-content" style="border: 0;">
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container">

		<div style="background-color: white;" class="panel-body">
			<c:set var="mesL" scope="session" value="${message}" />
			<c:if test="${mesL != null}">
				<div class="alert alert-success">
					<strong>${message}</strong> <span id="showSearchTerm"></span>
				</div>
			</c:if>
			<div class="row">
				<div class="col-sm-1"></div>
				<div class="col-sm-10">
					<div id="accordion">
					<h3 style="background-color: #01579b; color: #ffffff;">Search Applications</h3>
						<div>
							<form action="ViewApplications" method="post">
								<div class="form-group">
									<label for="typeAssgn">Position:</label> <input type="text"
										name="position" id="position" value="" class="form-control">
									<input type="submit" name="submit" id="submit" value="Search">
								</div>


								<c:set var="application" scope="session" value="${applicationsSearch}" />
								<c:if test="${application != null && application != ''}">
								
								<table class="table table-bordered">

									<thead>
										<tr>
											<th>AppId</th>
											<th>Status</th>
											<th>Job Id</th>
											<th>Job Title</th>
											<th>Job description</th>
											<th>Skills</th>
											<c:if test="${role=='HiringManager'}">
											<th>Matching</th>
											</c:if>
										</tr>
									</thead>
									<c:forEach var="app" items="${applicationsSearch}">
										<tr>
										
											
											<td><c:out value="${app.applicationid}"></c:out></td>
											<td><c:out value="${app.appstatus}"></c:out></td>
											<td><c:out value="${app.hdzJob.jobsid}"></c:out></td>
											<td><c:out value="${app.hdzJob.position}"></c:out></td>
											<td><c:out value="${app.hdzJob.description}"></c:out></td>
											<c:set var="myjobid"  value="${app.hdzJob.jobsid}" />
											<td><c:out value="${mapskill[myjobid]}"></c:out></td>
											 
											
											<c:set var="role" value="${role}"/>
						
											<c:if test="${role=='HiringManager'}">
											 
												<td><a class="btn btn-primary" Style="color:white"
												href="ViewApplications?jobid=${app.hdzJob.jobsid}">
													Search Qualified Applicants</a>		
													</td>				
												
												</c:if>	
												
														
											</tr>
									</c:forEach>	
									
								</table>
								
								<c:set var="mycandidates" scope="session" value="${candidates}" />
									<c:if test="${mycandidates != null && mycandidates != '' && role=='HiringManager'}">
								<table class="table table-bordered">

									<thead>
										<tr>
											<th>Applicant id</th>
											<th>Name</th>
											<th>Phone Number</th>
											<th>Email</th>
											<th>Skill</th>
										</tr>
									</thead>
									
									
									<c:forEach var="candidate" items="${candidates}">
										<tr>
											<td><c:out value="${candidate.applicantid}"></c:out></td>
											<td><c:out value="${candidate.firstname} ${candidate.lastname}"></c:out></td>
											<td><c:out value="${candidate.phonenum}"></c:out></td>
											<td><c:out value="${candidate.email}"></c:out></td>
											<c:set var="mycanid"  value="${candidate.applicantid}" />
											<td><c:out value="${appskill[mycanid]}"></c:out></td>
																
											</tr>
									</c:forEach>
									
										
									
								</table>
								
								</c:if>
								<c:if test="${mycandidates  == null && role=='HiringManager'}">
								
								<h4>No Qualified Candidates</h4>
								</c:if>
								
								
								</c:if>
								
								
								<c:if test="${application == null}">
								<h4>No records found!</h4>
								</c:if>
								
								
								
							</form>
						</div>
						<h3 style="background-color: #01579b;color: #ffffff;">Pending Actions</h3>
						<div>
						<c:set var="actions" scope="session" value="${actionList}" />
								<c:if test="${actions != null}">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>Job ID</th>
										<th>Job Title</th>
										<th>Job Desc</th>
										<th>Applicant Name</th>
										<th>Applicant Status</th>
										<th>Take Action</th>
									</tr>
								</thead>
								<c:forEach var="action" items="${actionList}">
									<tbody>
										<tr>
											<td><c:out value="${action.hdzJob.jobsid}"></c:out></td>
											<td><c:out value="${action.hdzJob.position}"></c:out></td>
											<td><c:out value="${action.hdzJob.description}"></c:out>
											</td>
											<td><c:out value="${action.hdzApplicant.firstname}"></c:out>
											</td>
											<td><c:out value="${action.appstatus}"></c:out></td>
											<td><a class="btn btn-primary" Style="color:white"
												href="ActionSubmit?applicationid=${action.applicationid}">
													Take Action</a></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>
							</c:if>
							<c:if test="${actions == null}">
								<h2>No Action Pending!!</h2>
								</c:if>
						</div>
						<h3 style="background-color: #01579b;color: #ffffff;">Add Jobs</h3>
						<div>
							<form id="target" action="AddJobs" method="post">
								
								<div class="form-group">
									<label for="typeAssgn">Position:</label> <input type="text"
										name="position" id="position" value="" class="form-control">
								</div>
								<div class="form-group">
									<label for="typeAssgn">Description:</label> <input type="text"
										name="description" id="description" value=""
										class="form-control">
								</div>

								<input type="submit" name="submit" id="submit" value="Add">

							</form>
						</div>
						<c:set var="role" value="${role}"/>
						
						<c:if test="${role=='HiringManager'}">
						<h3 style="background-color: #01579b;color: #ffffff;">Final Report</h3>
						<div>
							
								
								<c:set var="finalreport" scope="session" value="${finalreport}" />
								<c:if test="${finalreport != null}">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>Job ID</th>
										<th>Job Title</th>
										<th>Job Desc</th>
										<th>Applicant Name</th>
										<th>Applicant Status</th>
										<th>Application Score</th>
										<th>Take Action</th>
									</tr>
								</thead>
								<c:forEach var="report" items="${finalreport}">
									<tbody>
										<tr>
											<td><c:out value="${report.hdzJob.jobsid}"></c:out></td>
											<td><c:out value="${report.hdzJob.position}"></c:out></td>
											<td><c:out value="${report.hdzJob.description}"></c:out>
											</td>
											<td><c:out value="${report.hdzApplicant.firstname}"></c:out>
											</td>
											<td><c:out value="${report.appstatus}"></c:out></td>
											<td><c:out value="${report.appscore}"></c:out></td>
											<td><a class="btn btn-primary" Style="color:white"
												href="FinalReport?hireappid=${report.applicationid}">
													Hire</a>
													<a class="btn btn-primary" Style="color:white"
												href="FinalReport?failappid=${report.applicationid}">
													Fail</a></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>
							</c:if>
							<c:if test="${finalreport == null}">
								<h2>No Action Pending!!</h2>
								</c:if>

							
						</div>
						</c:if>
						
					</div>
					<%-- <div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Pending Actions</div>

						</div>
						<div class="panel-body">

							<table>
								<thead>
									<tr>
										<th>Job ID</th>
										<th>Job Desc</th>
										<th>Applicatnt Name</th>
										<th>Applicatnt Status</th>
										<th></th>
									</tr>
								</thead>
								<c:forEach var="action" items="${actionList}">
									<tbody>
										<tr>
											<td><c:out value="${action.hdzJob.jobsid}"></c:out></td>
											<td><c:out value="${action.hdzJob.description}"></c:out>
											</td>
											<td><c:out value="${action.hdzApplicant.firstname}"></c:out>
											</td>
											<td><c:out value="${action.appstatus}"></c:out></td>
											<td><a
												href="ActionSubmit?applicationid=${action.applicationid}">
													Take Action</a></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>
						</div>
						<div class="panel-footer">
							<div id="text"></div>
							<div align="right"></div>
						</div>
					</div> --%>
				</div>
				<div class="col-sm-1"></div>
			</div>
		</div>
	</div>

</body>
</html>