<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

<form:form action="saveStudent" method="post" modelAttribute="student">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        <label for="age">Age:</label><br>
        <input type="text" id="age" name="age" required><br><br>

        <label for="emailId">Email:</label><br>
        <input type="email" id="email" name="emailId" required><br><br>

		<label for="state">State:</label><br>
        <input type="text" id="state" name="state" required><br><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>