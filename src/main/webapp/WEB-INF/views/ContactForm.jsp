<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contact Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 50%;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    h2 {
        text-align: center;
        color: #333;
    }
    form {
        display: flex;
        flex-direction: column;
    }
    .gender input[type="radio"] {
    display: inline-block;
    vertical-align: middle;
    margin-right: 10px;
    margin-left: 80px;
}
    
    
    label {
        margin-bottom: 5px;
        color: #666;
    }
    input[type="text"], input[type="email"], select, textarea {
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        background-color: #007bff;
        color: #fff;
        border: none;
        padding: 10px;
        cursor: pointer;
        border-radius: 5px;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Contact Us</h2>
    <form:form action="submitContact" method="post" modelAttribute="contact">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <label for="email">Email:</label>
        <input type="email" id="email" name="emailId" required>
        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dateOfBirth" required><br>
        <label for="courses">Select Courses:</label>
        <select id="courses" name="courses" required>
            <option value="course1">Course 1</option>
            <option value="course2">Course 2</option>
            <option value="course3">Course 3</option>
        </select>
        <div class="gender">
	   <label for="gender">Gender:</label>
	    <input type="radio" id="male" name="gender" value="male" required>
	    <label for="male">Male</label>
	    <input type="radio" id="female" name="gender" value="female" required>
	    <label for="female">Female</label><br><br>
         </div>
        <label for="type">Select Type:</label>
        <select id="type" name="type" required>
            <option value="type1">Type 1</option>
            <option value="type2">Type 2</option>
            <option value="type3">Type 3</option>
        </select>
        <label for="city">City:</label>
        <input type="text" id="city" name="address.city" required>
        <label for="state">State:</label>
        <input type="text" id="state" name="address.state" required>
        <input type="submit" value="Submit">
    </form:form>
</div>

</body>
</html>
