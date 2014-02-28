<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>View All Users</title>
	<!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/signin.css" rel="stylesheet">
</head>
<body>
	
	<div class="main_container" style="margin: 150px;">
		<h2>User List</h2>	
		<div>
			<table class="table">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.firstName}</td>
						<td>${user.lastName}</td>
						<td>${user.age}</td>
						<td><a href="${flowExecutionUrl}&_eventId_updateUser&userId=${user.id}">Update</a></td>
						<td><a href="${flowExecutionUrl}&_eventId_deleteUser&userId=${user.id}">Delete</a></td>
					</tr>
				</c:forEach>		
			</table>
		</div>
		
		<c:if test="${messageInfo != null}">
	       	<div class="messageInfo" style="margin: 5px;">
				<div class="alert alert-info">
					 ${messageInfo}
				</div>
			</div>
		</c:if>
		
		<div>
       		<h3><span class="label label-default">
				<a href="${flowExecutionUrl}&_eventId_gotoHome"> < Menu </a>
			</span></h3>
		</div>
		
	</div>
	
</body>
</html>