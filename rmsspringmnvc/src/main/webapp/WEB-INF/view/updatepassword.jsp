<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="msz" class="java.lang.String" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center" style='color:red'> ${msg } </h2>

	<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
		<legend> Change Password </legend>
		<form action="updatepassword" method="post">
			<table align="center">
				<tr>
					<td>New Password:</td>
					<td><input type="password" name="newpassword" required></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword" required></td>
				</tr>
				<tr>
					<td> <input type="reset" value="Reset"> </td>
					<td> <input type="submit" name="Update Password"></td>
				</tr>
			</table>

		</form>
	</fieldset>

</body>
</html>