<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Name.jsp">
		<center>
			First Name :
			<input type="text" name="fName">
			Second Name  :
			<input type="text" name="sname">
			<input type="submit" value="Show">
		</center>
	</form>
	<%
		String fName = request.getParameter("fName");
		String sname = request.getParameter("sname");
		
		String fullName = fName + " " + sname;
		out.println("Here is your full name : " + fullName);
		
	%>
</body>
</html>