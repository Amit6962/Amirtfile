<%@ page import="java.sql.*"%>

<%
String userid=request.getParameter("userid");
String password=request.getParameter("password");

try{
	
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AMIT6962","amit@123");
    PreparedStatement ps=conn.prepareStatement("insert into Adminpage1 values(?,?)");
    ps.setString(1,userid);
    ps.setString(2,password);
    int x=ps.executeUpdate();
	if(x!=0)
	{
		out.println("sign in successful");
}
else
{ out.println("fill all details");
}
}
catch(Exception e)
{out.println(e);}
%>