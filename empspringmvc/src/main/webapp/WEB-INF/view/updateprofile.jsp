<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<a href="./home">Home</a>
<a href="./login" style="float:right">Logout</a>
<fieldset>
		<legend>Update Profile</legend>
		<form action="./updateprofile" method="post">
			<table align="center">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="text" name="gender"></td>
				</tr>


				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>



					<td><input type="submit" name="Login"></td>
				
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>