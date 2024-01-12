<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Display Details:</h2>

<p><strong>Name:</strong> <%= request.getParameter("fullname") %></p>

<p><strong>Address:</strong> <%= request.getParameter("address") %></p>

<p><strong>Date of Birth:</strong> <%= request.getParameter("date") %></p>

<p><strong>Salary:</strong> <%= request.getParameter("salary") %></p>

<p><strong>Account Type:</strong> <%= request.getParameter("account") %></p>

<p><strong>Gender:</strong> <%= request.getParameter("radio") %></p>

</body>
</html>