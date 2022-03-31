<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title>Assignment6</title>
<body>
<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "jsp";
String userId = "root";
String password = "ye sab doglapn hai";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Student Record</strong></font></h2>

<table border = "1" width = "100%">
    <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Class</th>
            <th>Division</th>
            <th>City</th>
    </tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM students";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr ">

<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("class") %></td>
<td><%=resultSet.getString("division") %></td>
<td><%=resultSet.getString("city") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>