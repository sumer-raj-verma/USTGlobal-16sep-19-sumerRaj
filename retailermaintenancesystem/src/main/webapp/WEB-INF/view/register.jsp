<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<body>
	<fieldset align="center">
		<legend>Register Here</legend>
		<form action="./register" method="post">

			<table align="center">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>

				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td>Gender:</td>
					<td><select name="gender">
							<option value="M">Male</option>
							<option value="F">Female</option>
							<option value="O">Others</option>
					</select>
				<tr>

					<td><input type="submit" name="register"></td>
					<td><input type="submit" name="register">
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login.html">Click for login</a>




</body>
</html>