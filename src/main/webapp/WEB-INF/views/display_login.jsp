<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:form="http://www.springframework.org/tags/form"> 
<head>
	<title>Login</title>
	<!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/signin.css" rel="stylesheet">

</head>

<body>
	<div class="container">
	    <form method="post" class="form-signin">    
	    	<h2 class="form-signin-heading">Please sign in</h2>     
	        <input name="loginname" type="text" class="form-control" placeholder="Login ID" required autofocus>
	        <br/>
	        <input name="password" type="password" class="form-control" placeholder="Password" required>
	        <button name="_eventId_loginCredentialsEntered" class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	     </form>
	               
	</div>
	
	<c:if test="${messageInfo != null}">
		<div class="messageInfo" style="margin: 50px;">
			<div class="alert alert-danger">
			  	${messageInfo}
			</div>
		</div>
	</c:if>
	
	
		        
</body>
</html>