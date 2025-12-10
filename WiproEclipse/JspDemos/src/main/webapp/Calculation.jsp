<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Calculation.jsp">
		<center>
			First Num :
			<input type="number" name="fNum"><br><br>
			Second Num :
			<input type="number" name="sNum"><br><br>
			<input type="submit" value="Show">
			
		</center>
	</form>
	<%
	
		try{
			int fNum = Integer.parseInt(request.getParameter("fNum"));
			int sNum = Integer.parseInt(request.getParameter("sNum"));
			out.println("Your first number is : " + fNum + "<br>");
			out.println("Your Second number is : " + sNum + "<br><hr>");
			if(fNum != 0 && sNum != 0){
				int sum = fNum + sNum;
				out.println("Sum of these Numbers : " + sum + "<br>");
				int sub = fNum - sNum;
				out.println("Substration of these Numbers : " + sub + "<br>");
				int mul = fNum * sNum;
				out.println("Multiplication of these Numbers : " + mul);
				
			}
			else{
				out.println("Please Enter Your Number: Try Again....");
			}
		}catch(Exception e){
			out.println("Please Enter Your Number: Try Again.... <br>{Be careful: You Got this from exception block....}");
		}
		
	
	%>
</body>
</html>