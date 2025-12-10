<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Test.jsp">
		<center>
			Student Name : 
			<input type="text" name = "sname"/> <br><br>
			<input type="Submit" value = "Show"/>
		</center>
	</form>
	<%
		String sname = request.getParameter("sname");
		if(sname != null){
			if(sname.trim().equals("")){
				out.println("Please Enter Student Name... Try Again");
			}else{
				out.println("Student Name is : " + sname);
			}
			
		}
		
	%>
</body>
</html>