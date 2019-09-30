<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.collegeapplication.model.CollegeResult"%>
<%@  taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
	<table border=1>
		<tr>
		<td>
			<table  width=100%>
			<tr>
				<td>
					<img src='logo.png' width=120 height=120>
				</td>
				<td>
					<b><font size='5'>Result page</font> </b><br><br>
					<font size='4' color='grey'><b> </b></font>
				</td>
			</tr>
			</table>
		</td>
		</tr>
		
		<tr>
		<td>
			<table width=100%>
			
				<tr><td><font size='4'>StudentName:ss</font></td><td><font size='4'>Branch:</font></td></tr>
				<tr><td><font size='4'>StudentId:ii</font></td><td><font size='4'>DOB:</font></td></tr>
			</table>
		</td>
		</tr>
		<tr>
		<td>
      
			<table border=1 width=100%>
			<tr><th><i>Subject code</i></th><th><i>Subject name</i></th><th><i>Min marks</i></th><th><i>Max marks</i></th><th><i>Marks obtained</i></th><th><i>Remark</i></th>
			<c:forEach  items="${ColResult}" var="ColResult">
				
				<tr><td><c:out value="${ColResult.subjectCode}"/></td><td>${ColResult. subjectName}</td><td>35</td><td>100</td><td>${ColResult.marks}</td><td>P</td></tr>
				
			</c:forEach>
		 <tr><td></td><td></td><td><b>Total</b></td><td><b>500</b></td><td><b>373<b></td><td></td></tr>
		
			</table>
		</td>
		</tr>
		<tr>
		<td>
			<table>
				<tr><td><b><font size='4'>Result:Pass</font>
				</b>
				</td>
				</tr>
			</table>
		</td>
		</tr>
	</table>
</center>

</body>
</html>