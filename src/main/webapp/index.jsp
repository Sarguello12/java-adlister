<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Home page"/>
    </jsp:include>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <%@ include file="partials/album.jsp"%>

    <jsp:include page="partials/info_card.jsp">
        <jsp:param name="post_title" value="Blog post 1"/>
        <jsp:param name="post_content" value="This is a cool post about JSP"/>
        <jsp:param name="post_date" value="APR 26"/>
    </jsp:include>

    <jsp:include page="partials/info_card.jsp">
        <jsp:param name="post_title" value="Blog post 2"/>
        <jsp:param name="post_content" value="This is a cool post about JSTL"/>
        <jsp:param name="post_date" value="APR 24"/>
    </jsp:include>

    <%@include file="partials/bootstap_js.jsp"%>
</body>
</html>
