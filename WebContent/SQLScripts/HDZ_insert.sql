--employee

insert into HDZ_employee (employeeid, empname,email,hashedpwd, salt, position)
values (hdz_employee_id_seq.nextval,'Dave','dave@gmail.com','e95a5ad51f4af4ea83c652fbc74796ed413cff1fde20b01e29b7b749ad109d49', 'sFr6YJz/jKBZi8GPvtVz576kytszrhcj/kaSp9MZ2q0=', 'HR Manager');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Sam','sam@gmail.com','ea46ff538d38fce90d9f6a177cb2c538e25f44a5deb47725115913ffc93ceaf2', 'W7BnXZhU/efVeOCaXEnfkI3L9s1vOfEZCYfE7+93D0k=','Compliance Officer');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Juli','juli@gmail.com','8d9bd9192e2eed579d92ca4995289febcee969fa57979dde0feb5f6477427620', 'zYWAq2b39MEkGgcA1oXK5owfdtVFQad++2tK7futvAA=','HR Assistant');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Sue','sue@gmail.com','34f78a77941dacb64b5010a3cd3971295982d9b6583fc8dbe770311c4f24b5b4', 'cFcwYn6sDNpz75L8qaLsqzZ2tqoz5BnqUdRw3JqYnNw=','HR Specialist');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Dan','dan@gmail.com','f6833b84e13b10b6185323b9117c7f8352016b788b4bda9fe87f4b114d0c412a', 'V33qAk8La7ZncEff4K1ipai+xoJHk4MNK/iT8pUb840=','Health Care Professional');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Alton','alton@gmail.com','efe23baaeab3beb3e20fe2f5b685954c91eb20dbd32f249a874222a7206bd328', 'bn7XeEdjscm0UG2BN/kMSsjyvjXhr6Hb77ylnzV+daA=','Hiring Manager');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Ann','ann@gmail.com','d282629e2143c410906d323e34e4e590b59f208ea4e6c75c33f01d25f17d99c5', 'OBoalEdLrRKcUoWUOs/XyZGs6RLBjjwkY6SjAHshLfE=','Software Engineer');

insert into HDZ_employee (employeeid, empname,email,hashedpwd,salt, position)
values (hdz_employee_id_seq.nextval,'Tim','tim@gmail.com','9f0904b141429568059b455e923cc773f17c549f60c07a40316bbcb184df64d4', 'RNPmzBI6B4O+r+FUnPcKt1RNP/UdrrEF+KTmbQyUAjM=','Technology analyst');

--applicant:

insert into HDZ_Applicant (applicantid, email, hashedpwd, salt, firstname, lastname, bday, citizenflag, citizen, visaflag, visa, veteranflag, veteran, drugtestflag, drugtest, stdpanelflag, stdpanel, dottestflag, dottest, alcoholtestflag,alcoholtest,careerobj, appsummary, phonenum, employeeid) 
values (hdz_applicant_id_seq.nextval, 'sal@gmail.com', '8f23afaa0ec822bef56b4e71da62d1d19cb569b7957124b57816463fb952fbdf', 'cDxst4bFuL7tqMdGPSy+RgCW+1EJ2F40LsNh+uHwHUs=', 'sal', 'snooze', '08/01/1992', null,'yes', null,'no', null,'yes', null,'yes',null,'yes',null,'yes',null,'yes','Actively seeking entry level position based on my skill sets', 'I have strong technical skill set which is required for the present industries std. I graduted from GWU and actively seeking for a job','2025932112',1);

insert into HDZ_Applicant (applicantid, email, hashedpwd, salt, firstname, lastname, bday, citizenflag, citizen, visaflag, visa, veteranflag, veteran, drugtestflag, drugtest, stdpanelflag, stdpanel, dottestflag, dottest, alcoholtestflag,alcoholtest,careerobj, appsummary, phonenum, employeeid) 
values (hdz_applicant_id_seq.nextval, 'roy@gmail.com', '447903c4bddf950b8fed39041d3f786a04601be1107de2667cb3369e1ee420ce', '6GxvpU56PKnpNC5OddEAgKhJz252pAkITHKO7Hz2r+s=', 'roy', 'cook', '07/05/1988', null,'yes', null,'no', null,'yes', null,'yes',null,'yes',null,'yes',null,'yes','Looking for a hardware engineer position','ASIC designing, Cadence tool are my major concentration. I love to work on nano technology which is the upcomming trend to buld gadgets which my accured skill sets','5978963412',null);

insert into HDZ_Applicant (applicantid, email, hashedpwd, salt, firstname, lastname, bday, citizenflag, citizen, visaflag, visa, veteranflag, veteran, drugtestflag, drugtest, stdpanelflag, stdpanel, dottestflag, dottest, alcoholtestflag,alcoholtest, careerobj, appsummary, phonenum, employeeid) 
values (hdz_applicant_id_seq.nextval, 'jerry@gmail.com', '634becb83a351b7201e75d8e69eabe64be3f9d8bb1f4c5cb86da00bdf6cb123d', '7rRh4eqTNh+LJL0Iqp3o3n3ZwU/Ektm7xwsK1TczFQE=', 'jerry', 'wu', '03/09/1980', null,'no', null,'yes', null,'yes', null,'no',null,'no',null,'no',null,'no','Seeking for a research oppurtunity which matches my expectations','Quality is everyones need. I did my PHD in CSU with major in MIST', '789365142',null);

insert into HDZ_Applicant (applicantid, email, hashedpwd, salt, firstname, lastname, bday, citizenflag, citizen, visaflag, visa, veteranflag, veteran, drugtestflag, drugtest, stdpanelflag, stdpanel, dottestflag, dottest, alcoholtestflag,alcoholtest, careerobj, appsummary, phonenum, employeeid) 
values (hdz_applicant_id_seq.nextval, 'volker@gmail.com', '85c4045386bcb895c66df0661cd9ea573e91626b8c1dd92026fe05a67196360c', 'o6uSUE7IKGUMAQ1mrj+k8Ggf5CHlmfxGAiWoHv8rzok=', 'volker', 'sorger', '08/06/1989', null,'yes', null,'no', null,'yes', null,'no',null,'no',null,'yes',null,'yes','Looking for a full time position with cyber security as my concentration', 'Security is eternal in all aspects.Concepts like Crytpograpy and cihers were my interests which motived a lot','3245678210',3);

insert into HDZ_Applicant (applicantid, email, hashedpwd, salt, firstname, lastname, bday, citizenflag, citizen, visaflag, visa, veteranflag, veteran, drugtestflag, drugtest, stdpanelflag, stdpanel, dottestflag, dottest, alcoholtestflag,alcoholtest, careerobj, appsummary, phonenum, employeeid) 
values (hdz_applicant_id_seq.nextval, 'tommy@gmail.com', '0facf4210ee68bd39bdf1a55f24ea95ab40a387dfe8066a2f394e2434803635c', 'jdPz/JFmmyLhUif/3kcL1h7hR232Buv8GTOiniy0EUI=', 'robert', 'tommy', '06/07/1985', null,'no', null,'yes', null,'yes', null,'yes',null,'yes',null,'yes',null,'yes','Seeking for a position which adapt my skill sets and blend with technology','I am looking for senior software engineer position with java programming', '7412340989',2);

--education

insert into HDZ_Education (educationid,educationflag, applicantid, schoolname, degreecompleted, datecompleted ) 
values (hdz_education_id_seq.nextval,null,1, 'GWU', 'MS', '06/05/2016');

insert into HDZ_Education (educationid,educationflag, applicantid, schoolname, degreecompleted, datecompleted ) 
values (hdz_education_id_seq.nextval,null,2, 'GMU', 'BE', '06/20/2015');

insert into HDZ_Education (educationid,educationflag, applicantid, schoolname, degreecompleted, datecompleted ) 
values (hdz_education_id_seq.nextval,null,3, 'CSU', 'PHD', '05/15/2010');

insert into HDZ_Education (educationid,educationflag, applicantid, schoolname, degreecompleted, datecompleted ) 
values (hdz_education_id_seq.nextval,null,4, 'ASU', 'MS', '05/05/2014');

insert into HDZ_Education (educationid,educationflag, applicantid, schoolname, degreecompleted, datecompleted ) 
values (hdz_education_id_seq.nextval,null,5, 'UTD', 'PHD', '05/10/2013');

--jobhistory

insert into HDZ_jobhistory (jobhistoryid,jobhistoryflag,applicantID, position, companyname, startdate,enddate, description ) 
values (hdz_jobhistory_id_seq.nextval,null, 1,'Software Engineer', 'Facebook', '08/05/2010','01/07/2016','Java Programmer, Agile Development');

insert into HDZ_jobhistory (jobhistoryid,jobhistoryflag,applicantID, position, companyname, startdate,enddate, description ) 
values (hdz_jobhistory_id_seq.nextval,null, 1,'Business Analyst', 'IPS', '05/05/2013','01/07/2015','Agile, Waterfall methodology');

insert into HDZ_jobhistory (jobhistoryid,jobhistoryflag,applicantID, position, companyname, startdate,enddate, description ) 
values (hdz_jobhistory_id_seq.nextval,null, 1,'Hardware Engineer', 'Apple', '01/25/2010','01/20/2016','PCB design, Velilog, TCL,Perl');

insert into HDZ_jobhistory (jobhistoryid,jobhistoryflag,applicantID, position, companyname, startdate,enddate, description ) 
values (hdz_jobhistory_id_seq.nextval,null, 1,'Cyber Security Engineer', 'Amazon', '03/09/2000','01/07/2016','Java, networking');

insert into HDZ_jobhistory (jobhistoryid,jobhistoryflag,applicantID, position, companyname, startdate,enddate, description ) 
values (hdz_jobhistory_id_seq.nextval,null, 1,' Senior Software Engineer', 'Oracle', '08/05/2011','01/07/2015','Java Programmer,Adop');

--reftable

insert into HDZ_reftable (refid,refflag, applicantID,refname, refemail, refphone,refposition ) 
values (hdz_reftable_id_seq.nextval,null, 1,'Bob', 'bob@gmail.com', '2029940771','Senior Software Engineer');

insert into HDZ_reftable (refid,refflag, applicantID,refname, refemail, refphone,refposition ) 
values (hdz_reftable_id_seq.nextval,null, 2,'jesica', 'jesica@gmail.com', '3019940771','Senior Software Engineer');

insert into HDZ_reftable (refid,refflag, applicantID,refname, refemail, refphone,refposition ) 
values (hdz_reftable_id_seq.nextval,null, 3,'rooney', 'rooney@gmail.com', '5987432160','Senior Software Engineer');

insert into HDZ_reftable (refid,refflag, applicantID,refname, refemail, refphone,refposition ) 
values (hdz_reftable_id_seq.nextval,null, 4,'he', 'he@gmail.com', '5467893212','Senior Software Engineer');

insert into HDZ_reftable (refid,refflag, applicantID,refname, refemail, refphone,refposition ) 
values (hdz_reftable_id_seq.nextval,null, 5,'su', 'su@gmail.com', '2015897844','Senior Software Engineer');

--skills

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Java');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Verilog');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Python');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'C');


insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'C++');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Embedded C');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Agile');

insert into HDZ_skills (skillsid, skillname)
values (hdz_skills_id_seq.nextval, 'Waterfall');


--jobs

insert into HDZ_Jobs (jobsid, position, description,codingtestreq)
values (hdz_jobs_id_seq.nextval, 'Software Engineer', 'Entry Level Java Programming and testing','Y');

insert into HDZ_Jobs (jobsid, position, description,codingtestreq)
values (hdz_jobs_id_seq.nextval, 'Hardware Engineer', 'ASIC CPU Design and Testing','N');

insert into HDZ_Jobs (jobsid, position, description, codingtestreq)
values (hdz_jobs_id_seq.nextval, 'Quality Assurance', 'Software testing and configuration','Y');

insert into HDZ_Jobs (jobsid, position, description, codingtestreq)
values (hdz_jobs_id_seq.nextval, 'Cyber security', 'Software development and networking','N');

--jobskillbridge

insert into HDZ_jobskillbridge (jobskillbridgeid, jobsid,skillsid,experience)
values (hdz_jobskillbridge_id_seq.nextval,1,1,'3');

insert into HDZ_jobskillbridge (jobskillbridgeid, jobsid,skillsid,experience)
values (hdz_jobskillbridge_id_seq.nextval,2,2,'1');

insert into HDZ_jobskillbridge (jobskillbridgeid, jobsid,skillsid,experience)
values (hdz_jobskillbridge_id_seq.nextval,3,3,'2');

insert into HDZ_jobskillbridge (jobskillbridgeid, jobsid,skillsid,experience)
values (hdz_jobskillbridge_id_seq.nextval,3,7,'2');

insert into HDZ_jobskillbridge (jobskillbridgeid, jobsid,skillsid,experience)
values (hdz_jobskillbridge_id_seq.nextval,4,8,'2');
--application

insert into HDZ_application (applicationid, applicantID,codingtest, jobsID,appstatus,comments,appscore,codingtestscore)
values (hdz_application_id_seq.nextval, 1,'N', 1,'New',null,null,null);

insert into HDZ_application (applicationid, applicantID,codingtest, jobsID,appstatus,comments,appscore,codingtestscore)
values (hdz_application_id_seq.nextval, 2,'Y', 2,'New',null,null,null);

insert into HDZ_application (applicationid, applicantID,codingtest, jobsID,appstatus,comments,appscore,codingtestscore)
values (hdz_application_id_seq.nextval, 3,'N', 3,'New',null,null,null);

insert into HDZ_application (applicationid, applicantID,codingtest, jobsID,appstatus,comments,appscore,codingtestscore)
values (hdz_application_id_seq.nextval, 4,'Y', 4,'New',null,null,null);


--bridge

insert into HDZ_skillappbridge (skillappbridgeid, skillsid, applicantid, experience)
values (hdz_skillappbridge_id_seq.nextval,1,1,'2');

insert into HDZ_skillappbridge (skillappbridgeid, skillsid, applicantid, experience)
values (hdz_skillappbridge_id_seq.nextval,2,2,'1');

insert into HDZ_skillappbridge (skillappbridgeid, skillsid, applicantid, experience)
values (hdz_skillappbridge_id_seq.nextval,3,3,'5');

insert into HDZ_skillappbridge (skillappbridgeid, skillsid, applicantid, experience)
values (hdz_skillappbridge_id_seq.nextval,4,4,'1');

insert into HDZ_skillappbridge (skillappbridgeid, skillsid, applicantid, experience)
values (hdz_skillappbridge_id_seq.nextval,5,5,'3');

--award

insert into HDZ_award (awardid, awardname, awardyear, applicantid)
values (hdz_award_id_seq.nextval,'Best student','2016',1);

insert into HDZ_award (awardid, awardname, awardyear, applicantid)
values (hdz_award_id_seq.nextval,'Topper of the class','2012',2);

insert into HDZ_award (awardid, awardname, awardyear, applicantid)
values (hdz_award_id_seq.nextval,'Talented Technical Human ','2010',3);

insert into HDZ_award (awardid, awardname, awardyear, applicantid)
values (hdz_award_id_seq.nextval,'Best student','2012',4);

insert into HDZ_award (awardid, awardname, awardyear, applicantid)
values (hdz_award_id_seq.nextval,'Best Performer','2011',5);

--HDZ_codingquest

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'Expand JSP', 'JavaServer Pages');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'What is the difference between a constructor and a method?', 'JA constructor is a member function of a class that is used to create objects of that class. A method is an ordinary member function of a class');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'What is an abstract class?', 'Abstract class must be extended/subclassed (to be useful). It serves as a template.');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'Which is a reserved word in the Java programming language?
A. 	method
B. 	native
C. 	subclasses
D. 	reference
E. 	array', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'Which is a valid keyword in java?
A. 	interface
B. 	string
C. 	Float
D. 	unsigned', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,' 	

You need to store elements in a collection that guarantees that no duplicates are stored and all elements can be accessed in natural order. Which interface provides that capability?', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'Which collection class allows you to grow or shrink its size and provides indexed access to its elements, but whose methods are not synchronized?', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object?', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'You want subclasses in any package to have access to members of a superclass. Which is the most restrictive access that accomplishes this objective?', 'a');

insert into HDZ_codingquest (codingquestid, question, answer)
values (hdz_codingquest_id_seq.nextval,'What is the value of "d" after this line of code has been executed?

double d = Math.round ( 2.5 + Math.random() );', 'a');

-- HDZ_interviewquest

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Expected Salary?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Expected Salary?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Expected Salary?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Expected Salary?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Are you willing to relocate or travel?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Are you willing to relocate or travel?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Are you willing to relocate or travel?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Are you willing to relocate or travel?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Why are you interested in this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Why are you interested in this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Why are you interested in this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Why are you interested in this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Tell me about yourself.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Tell me about yourself.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Tell me about yourself.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Tell me about yourself.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Why are you leaving your current job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Why are you leaving your current job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Why are you leaving your current job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Why are you leaving your current job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','What do you know about the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','What do you know about the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','What do you know about the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','What do you know about the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Can you work under pressure?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Can you work under pressure?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Can you work under pressure?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Can you work under pressure?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Who has inspired you in your life and why?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Who has inspired you in your life and why?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Who has inspired you in your life and why?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Who has inspired you in your life and why?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','If you won $10 million lottery, would you still work?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','If you won $10 million lottery, would you still work?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','If you won $10 million lottery, would you still work?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','If you won $10 million lottery, would you still work?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HR Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HR Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HR Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HR Interview','Do you have any questions for me?');



insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','Whats your work experience related to applied job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','Whats your work experience related to applied job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','Whats your work experience related to applied job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','Whats your work experience related to applied job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','Give me an example of your creativity.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','Give me an example of your creativity.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','Give me an example of your creativity.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','Give me an example of your creativity.');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','What motivates you to do good job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','What motivates you to do good job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','What motivates you to do good job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','What motivates you to do good job?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','What was the toughest decision you ever had to make?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','What was the toughest decision you ever had to make?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','What was the toughest decision you ever had to make?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','What was the toughest decision you ever had to make?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','Would you lie for the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','Would you lie for the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','Would you lie for the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','Would you lie for the company?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','How long would you expect to work for us if hired?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','How long would you expect to work for us if hired?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','How long would you expect to work for us if hired?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','How long would you expect to work for us if hired?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','What are your strengths and weaknesses?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','What are your strengths and weaknesses?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','What are your strengths and weaknesses?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','What are your strengths and weaknesses?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','Are not you overqualified for this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','Are not you overqualified for this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','Are not you overqualified for this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','Are not you overqualified for this position?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','How do you feel about working nights and weekends?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','How do you feel about working nights and weekends?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','How do you feel about working nights and weekends?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','How do you feel about working nights and weekends?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'HM Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'HM Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'HM Interview','Do you have any questions for me?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'HM Interview','Do you have any questions for me?');




insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Is Pokeman go causing problems?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Is Pokeman go causing problems?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Is Pokeman go causing problems?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Is Pokeman go causing problems?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Iphone vs Anroid phones');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Iphone vs Anroid phones');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Iphone vs Anroid phones');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Iphone vs Anroid phones');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Will WorldWar 3 happen?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Will WorldWar 3 happen?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Will WorldWar 3 happen?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Will WorldWar 3 happen?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Who win 2016 elections?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Who win 2016 elections?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Who win 2016 elections?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Who win 2016 elections?');


insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Should the public sector be privatized?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Should the public sector be privatized?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Should the public sector be privatized?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Should the public sector be privatized?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Security Cameras and Privacy');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Security Cameras and Privacy');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Security Cameras and Privacy');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Security Cameras and Privacy');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Globalization vs. Nationalism');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Globalization vs. Nationalism');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Globalization vs. Nationalism');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Globalization vs. Nationalism');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Is the Budgeting Exercise of any Use?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Is the Budgeting Exercise of any Use?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Is the Budgeting Exercise of any Use?');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Is the Budgeting Exercise of any Use?');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Advertising is a Waste of Resources');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Advertising is a Waste of Resources');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Advertising is a Waste of Resources');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Advertising is a Waste of Resources');

insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,2,'Group Interview','Every cloud has a silver lining');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,1,'Group Interview','Every cloud has a silver lining');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,3,'Group Interview','Every cloud has a silver lining');
insert into HDZ_interviewquest (interviewquestid, jobsid, interviewtype, question)
values (hdz_interviewquest_id_seq.nextval,4,'Group Interview','Every cloud has a silver lining');


-- HDZ_interview

insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HR Interview', null, 1);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HM Interview', null, 1);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'Group Interview', null, 1);

insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HM Interview', null, 2);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'Group Interview', null, 2);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HR Interview', null, 2);

insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HM Interview', null, 3);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'Group Interview', null, 3);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HR Interview', null, 3);

insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HM Interview', null, 4);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'Group Interview', null, 4);
insert into HDZ_interview (interviewid, interviewtype, score, applicationid)
values (hdz_interview_id_seq.nextval,'HR Interview', null, 4);



--HDZ_interviewresp


insert into HDZ_interviewresp (interviewrespid, applicationid, interviewquestid, interviewtype,questionflag)
values (hdz_interviewresp_id_seq.nextval,1,1,'HR Interview','P');

insert into HDZ_interviewresp (interviewrespid, applicationid, interviewquestid, interviewtype,questionflag)
values (hdz_interviewresp_id_seq.nextval,2,2,'HM Interview','F');

insert into HDZ_interviewresp (interviewrespid, applicationid, interviewquestid, interviewtype,questionflag)
values (hdz_interviewresp_id_seq.nextval,3,3,'Group Interview','P');

insert into HDZ_interviewresp (interviewrespid, applicationid, interviewquestid, interviewtype,questionflag)
values (hdz_interviewresp_id_seq.nextval,4,4,'HR Interview','F');




