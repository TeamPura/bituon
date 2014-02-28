<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>USER : HOME</title>
	<!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/signin.css" rel="stylesheet">
</head>
<body>
	
	<div class="main_container" style="margin: 200px;">
		<h2>Menu</h2>	
		<div class="nav_menu">	
			<ul class="nav nav-pills nav-stacked">
			  <li class="active"><a href="${flowExecutionUrl}&_eventId_createUsersPage">Create User</a></li>
			  <li class="active"><a href="${flowExecutionUrl}&_eventId_viewUsersPage">View Users</a></li>
			  <li class="active label-default"><a href="${flowExecutionUrl}&_eventId_logout">Log Out</a></li>
			</ul>
		</div>
	</div>
	
	
</body>
</html>