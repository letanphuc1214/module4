<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 1px solid #000;
        }

        th, td {
            border: 1px dotted #555;
        }
    </style>
</head>
<body>
<form action="/customers" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value="${customer.getId()}">
        <table>
            <tr>
                <td>Id</td>
                <td>
                    ${customer.getId()}
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    ${customer.getName()}
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    ${customer.getEmail()}
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    ${customer.getAddress()}
                </td>
            </tr>
            <%--            <tr>--%>
            <%--                <td>Name</td>--%>
            <%--                <td>--%>
            <%--                    <input type="text" name="name" value="<%= customer.getName() %>">--%>
            <%--                </td>--%>
            <%--            </tr>--%>
            <%--            <tr>--%>
            <%--                <td>Email</td>--%>
            <%--                <td>--%>
            <%--                    <input type="text" name="email" value="<%= customer.getEmail() %>">--%>
            <%--                </td>--%>
            <%--            </tr>--%>
            <%--            <tr>--%>
            <%--                <td>Address</td>--%>
            <%--                <td>--%>
            <%--                    <input type="text" name="address" value="<%= customer.getAddress() %>">--%>
            <%--                </td>--%>
            <%--            </tr>--%>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
<a href="/customers">Back to list</a>.
</body>
</html>