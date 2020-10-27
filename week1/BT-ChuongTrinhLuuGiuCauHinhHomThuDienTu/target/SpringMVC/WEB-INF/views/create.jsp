<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/27/2020
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form method="post" action="addEmail">
    <label>Languages</label>
    <select name="language">
        <option>English</option>
        <option>Vietnamese</option>
        <option>Japanese</option>
        <option>Chinese</option>
    </select>
    <br>
    <label>Page Size: </label>
    <span>show</span>
    <select name="pagesize">
        <option>5</option>
        <option>10</option>
        <option>15</option>
        <option>25</option>
        <option>50</option>
        <option>100</option>
    </select>
    <span>emails per page</span>
    <br>
    <label>Spams fillter:</label>
    <input type="checkbox" name="fillter" value="enable"> Enable spams fillter
    <br>
    <label>Signature: </label>
    <textarea name="signature"></textarea>
    <br>
    <input type="submit" value="update">
    <input type="submit" value="cancel">
</form>
</body>
</html>
