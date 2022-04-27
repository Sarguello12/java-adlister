<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/27/22
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="guess">
        <input type="radio" id="num1" name="guess" value=1>
        <label for="num1">1</label><br>
        <input type="radio" id="num2" name="guess" value=2>
        <label for="num2">2</label><br>
        <input type="radio" id="num3" name="guess" value=3>
        <label for="num3">3</label><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
