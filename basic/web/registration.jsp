<%-- 
    Document   : registration
    Created on : Feb 27, 2019, 9:52:25 AM
    Author     : SDF-ITD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="RegistrationController" method="post">
			<table style="width:50%">
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullname" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Qualification</td>
					<td><input type="text" name="qual" /></td>
				</tr>
				<tr>
					<td>Percentage</td>
					<td><input type="text" name="percent" /></td>
				</tr>
				<tr>
					<td>Year Passed</td>
					<td><input type="text" name="yop" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
		
	</div>
</body>

</html>
