<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SUYASH
  Date: 12-11-2025
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>course-update</title>
</head>
<body>
<form action="http://localhost:8080/spring_mvc_02_war/courses/update" method="post">
<table>
    <tr>
        <td>id</td>
        <td><input type="number" name="id"/></td>
    </tr>
    <tr>
        <td>name</td>
        <td><input type="text" name="name"/></td>
    </tr>
    <tr>
        <td>duration</td>
        <td><input type="text" name="duration"/></td>
    </tr>
    <tr>
        <td>price</td>
        <td><input type="number" name="price"/></td>
    </tr>
    <tr>
        <td><input type="submit" name="UpdateCourse"/></td>
    </tr>
</table>
</form>

</body>
</html>
