<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.01.2022
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Customer Information</h2>
<form:form method = "POST" action = "/Spring_3_Add_war_exploded/success">
    <table>
        <tr>
            <td><form:label path = "name">Name</form:label></td>
            <td><form:input path = "name" /></td>
        </tr>
        <tr>
            <td><form:label path = "age">Age</form:label></td>
            <td><form:input path = "age" /></td>
        </tr>
        <tr>
            <td><form:label path = "orders">Orders</form:label></td>
            <td><form:input path = "orders" /></td>
        </tr>
        <tr>
            <td>
                <input type = "submit" value = "Ok!"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
