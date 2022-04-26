<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/26/22
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

%>


<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Login</h1>
    <p>Please enter your username and password</p>
    <form method="POST">
        <label for="username">Username</label>
        <input id="username" type="text" name="username">
        <br><br>
        <label for="password">Password</label>
        <input id="password" type="text" name="password">
        <br><br>
        <button>Login</button>
    </form>

</body>
</html>
