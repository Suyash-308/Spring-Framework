<%--
  Created by IntelliJ IDEA.
  User: SUYASH
  Date: 12-11-2025
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete</title>
</head>
<body>
<form action="http://localhost:8080/spring_mvc_02_war/courses/delete" method="post">
    <input type="number" name="id">
    <br>
    <input type="submit" value="delete">
</form>
</body>
</html>
