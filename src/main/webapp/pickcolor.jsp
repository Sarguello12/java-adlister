<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/27/22
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <h1>Pick a color</h1>
    <form method="post" action="pickcolor">
        <label for="color">Please enter color:</label>
        <input type="text" name="color" id="color">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
