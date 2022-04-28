<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/27/22
  Time: 10:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
    <c:if test="${result}">
        <h1>Your guess was correct!</h1>
    </c:if>

    <c:if test="${!result}">
        <h1>Your guess was wrong :(</h1>
    </c:if>
</body>
</html>
