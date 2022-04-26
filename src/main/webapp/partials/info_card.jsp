<%--
  Created by IntelliJ IDEA.
  User: samarguello
  Date: 4/26/22
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<div class="card text-center">
    <div class="card-header">
        Featured
    </div>
    <div class="card-body">
        <h5 class="card-title"><%= request.getParameter("post_title") %></h5>
        <p class="card-text"><%= request.getParameter("post_content") %></p>
        <a href="#" class="btn btn-primary">View Post</a>
    </div>
    <div class="card-footer text-muted">
        <%= request.getParameter("post_date") %>
    </div>
</div>