<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./home">home</a>
<a href="./login" style="float:right;">Logout</a>
<fieldset>
		<legend>Change Password</legend>
		<form action="./changepassword" method="post" >
			<table>
				<tr>
					<td>New Password:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td> Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
				
					<td><input type="submit" name="change"></td>
				</tr>

			</table>
		</form>
	</fieldset>
	
</body>
</html>