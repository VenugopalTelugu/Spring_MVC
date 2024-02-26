<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Register Page:</h1>
	<form action="reg" method="post">
		<div hidden>
			<input type="number" name="tbId">
		</div>
		
		Name:<input type="text" name="tbName">
		<br>
		Email:<input type="email" name="tbEmail">
		<br>
		Password:<input type="password" name="tbPass">
		<br>
		Mobile:<input type="tel" name="tbMobile">
		<br>
		<input type="submit" name="tbReg" value="Click Here">
	</form>
</body>
</html>