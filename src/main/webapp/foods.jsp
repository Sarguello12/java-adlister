<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/26/22
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<String> foods = new ArrayList<>(Arrays.asList(
    "Carrots",
    "Banana",
    "Apple",
    "Cucumber",
    "Chicken",
    "Steak",
    "Raspberries",
    "Pineapple",
    "Avocado",
    "Pear"
    ));

    request.setAttribute("foods", foods);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <ol>
        <c:forEach var="food" items="${foods}">
            <li>${food}</li>
        </c:forEach>
    </ol>

    <ul>
        <c:forEach var="food" items="${foods}">
            <c:if test="${food.length() > 6}">
                <li>${food}</li>
            </c:if>
        </c:forEach>
    </ul>
</body>
</html>
