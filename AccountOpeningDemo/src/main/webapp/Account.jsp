<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AccountDetails.jsp" method="post">

ID:
<input type="text" name="id" required/>

Fullname:
<input type="text" name="fullname" required/>

Address:
<input type="text" name="address" required/>

Date Of Birth:
<input type="date" name="date" required/>

Salary:
<select name="salary" required>
<option>10,000 - 20,000</option>
<option>30,000 - 50,000</option>
<option>60,000 - 80,000</option>
<option>90,000 - 1,00,000</option>
</select>

Account Type:
<input type="checkbox" name="account" value="saving" >Saving Account
<input type="checkbox" name="account" value="current">Current Account

Gender:
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female

<button type="submit" value="Submit">Submit</button>

</form>

</body>
</html>