<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="bootstrap.jsp" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>
<title>HDZ - Create account</title>
<style>
</style>
<script>
	function validateForm() {
		var x = document.forms["applicant"]["firstname"].value;
		var text;
		if (x == null || x == "") {
			text = "Name must be filled out";
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["email"].value;
		if (x == null || x == "") {
			text = ("Email must be filled out");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["password"].value;
		if (x == null || x == "") {
			text = ("Password must be filled out");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["password"].value;
		var y = document.forms["applicant"]["password2"].value;
		var match = x.localeCompare(y);
		if (match!=0) {
			text = ("Passwords do not match");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["dob"].value;
		if (x == null || x == "") {
			text = ("Birthdate must be filled out");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["edu1"].value;
		if (x == null || x == "") {
			text = ("You must specify one degree");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
		x = document.forms["applicant"]["job1"].value;
		if (x == null || x == "") {
			text = ("You must specify one job");
			document.getElementById("invalid").innerHTML = text;
			return false;
		}
	}
</script>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container">
		<div class="row centered-form">
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<form action="NewApplicant" onsubmit="return validateForm()"
					name="applicant">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Personal</div>
						</div>

						<div class="panel-body">

							<fieldset>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>First Name</label>
											<input type="text" name="firstname" id="firstname"
												class="form-control input-sm"/>
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Last Name</label>
											<input type="text" name="lastname" id="last_name"
												class="form-control input-sm"/>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Email Address</label>
											<input type="text" name="email" id="email"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Phone #</label>
											<input type="text" name="phone" id="phone"
												class="form-control input-sm"/>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Password</label>
											<input type="password" name="password" id="password"
												class="form-control input-sm"/>
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Confirm Password</label>
											<input type="password" name="password2" id="password2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<input type="text" name="dob" id="dob"
												class="form-control input-sm" placeholder="Date of Birth">
										</div>
									</div>
									<div class="col-xs-8 col-sm-8 col-md-8">
										<div class="form-group">
											<select class="selectpicker" data-style="btn-info" name="veteran" data-width="auto">
												<option value="yes">Veteran</option>
												<option value="no">Non-veteran</option>
											</select>
											<select class="selectpicker" data-style="btn-info" name="citizen" data-width="auto">
												<option value="yes">Citizen</option>
												<option value="no">Non-citizen</option>
											</select>
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<label>Career Objective</label>
											<input type="text" name="objective" id="objective"
												class="form-control input-sm"/>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<label>Profile Summary</label>
											<textarea class="form-control" rows="5" name="summary" id="summary" style="resize:none;"></textarea>
										</div>
									</div>
								</div>
							</fieldset>
						</div>
					</div>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Education</div>
						</div>
						<div class="panel-body">
							<fieldset>
								<div class="row">
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Institution</label>
											<input type="text" name="edu1" id="edu1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Degree</label>
											<input type="text" name="degree1" id="degree1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Date Completed</label>
											<input type="text" name="date1" id="date1"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Institution</label>
											<input type="text" name="edu2" id="edu2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Degree</label>
											<input type="text" name="degree2" id="degree2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Date Completed</label>
											<input type="text" name="date2" id="date2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Institution</label>
											<input type="text" name="edu3" id="edu3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Degree</label>
											<input type="text" name="degree3" id="degree3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-4 col-sm-4 col-md-4">
										<div class="form-group">
											<label>Date Completed</label>
											<input type="text" name="date3" id="date3"
												class="form-control input-sm">
										</div>
									</div>
								</div>
							</fieldset>
						</div>
					</div>
					<br />

					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Job History</div>
						</div>
						<div class="panel-body">
							<fieldset>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Job Title</label>
											<input type="text" name="job1" id="job1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Company</label>
											<input type="text" name="company1" id="company1"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<label>Job Description</label>
											<input type="text" name="jobdesc1" id="jobdesc1"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Start Date</label>
											<input type="text" name="start1" id="start1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>End Date</label>
											<input type="text" name="leave1" id="leave1"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Job Title</label>
											<input type="text" name="job2" id="job2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Company</label>
											<input type="text" name="company2" id="company2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<label>Job Description</label>
											<input type="text" name="jobdesc2" id="jobdesc2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Start Date</label>
											<input type="text" name="start2" id="start2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>End Date</label>
											<input type="text" name="leave2" id="leave2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Job Title</label>
											<input type="text" name="job3" id="job3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Company</label>
											<input type="text" name="company3" id="company3"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12">
										<div class="form-group">
											<label>Job Description</label>
											<input type="text" name="jobdesc3" id="jobdesc3"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>Start Date</label>
											<input type="text" name="start3" id="start3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<label>End Date</label>
											<input type="text" name="leave3" id="leave3"
												class="form-control input-sm">
										</div>
									</div>
								</div>
							</fieldset>
						</div>
					</div>

					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">References</div>
						</div>
						<div class="panel-body">
							<fieldset>
								<div class="row">
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Name</label>
											<input type="text" name="refname1" id="refname1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Phone</label>
											<input type="text" name="refphone1" id="refphone1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Email</label>
											<input type="text" name="refemail1" id="refemail1"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Position</label>
											<input type="text" name="refpos1" id="refpos1"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Name</label>
											<input type="text" name="refname2" id="refname2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Phone</label>
											<input type="text" name="refphone2" id="refphone2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Email</label>
											<input type="text" name="refemail2" id="refemail2"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Position</label>
											<input type="text" name="refpos2" id="refpos2"
												class="form-control input-sm">
										</div>
									</div>
								</div>
								<hr class="separator">
								<div class="row">
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Name</label>
											<input type="text" name="refname3" id="refname3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Phone</label>
											<input type="text" name="refphone3" id="refphone3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Email</label>
											<input type="text" name="refemail3" id="refemail3"
												class="form-control input-sm">
										</div>
									</div>
									<div class="col-xs-3 col-sm-3 col-md-3">
										<div class="form-group">
											<label>Position</label>
											<input type="text" name="refpos3" id="refpos3"
												class="form-control input-sm">
										</div>
									</div>
								</div>
							</fieldset>
						</div>
					</div>
					
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Skills</div>
						</div>
						<div class="panel-body">
							<fieldset>
								Skill: <input type="text" name="skill1" id="skill1" />
								Years experience: <input type="text" name="skyear1" id="skyear1" /><br />
								<br />
								Skill: <input type="text" name="skill2" id="skill2" />
								Years experience: <input type="text" name="skyear2" id="skyear2" /><br />
								<br />
								Skill: <input type="text" name="skill3" id="skill3" />
								Years experience: <input type="text" name="skyear3" id="skyear3" />
								</fieldset>
						</div>
					</div>
					
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div align="left">Awards</div>
						</div>
						<div class="panel-body">
							<fieldset>
								Award: <input type="text" name="award1" id="award1" />
								Year awarded: <input type="text" name="awyear1" id="awyear1" /><br />
								<br />
								Award: <input type="text" name="award2" id="award2" />
								Year awarded: <input type="text" name="awyear2" id="awyear2" /><br />
								<br />
								Award: <input type="text" name="award3" id="award3" />
								Year awarded: <input type="text" name="awyear3" id="awyear3" />
								</fieldset>
						</div>
					</div>
					<p id="invalid"></p>
					<input type="submit" name="submit" id="submit" value="Submit" />
				</form>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>
</body>
</html>