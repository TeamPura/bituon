<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Create User</title>
	<!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/signin.css" rel="stylesheet">
</head>
<body>
	
	<div class="main_container" style="margin: 200px;">
		<h2>User</h2>	
		<div>
			 <form modelAttribute="shadowUser" method="post" class="form-signin" style="max-width: 500px ! important; margin: 0px;"> 
	            <table>
	                <tr>
	                    <td><label>First Name:</label></td>
	                    <td><input name="firstName" value="${user.firstName}" type="text" class="form-control" required autofocus>
	                    </td>
	                </tr>
	                <tr>
	                    <td><label>Last Name:</label></td>
	                    <td><input name="lastName" value="${user.lastName}" type="text" class="form-control" required></td>
	                </tr>
	                <tr>
	                    <td><label>Age:</label> </td>
	                    <td><input name="age" value="${user.age}" type="text" class="form-control" required></td>
	                </tr>
	            </table>         
	            <br/>
	            <button type="submit" name="_eventId_${actionEventId}" class="btn btn-lg btn-primary btn-block">${buttonAction}</button>           
       		</form>
       		
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
	</div>
		
			
</body>
</html>