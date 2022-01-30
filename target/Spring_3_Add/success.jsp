<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.01.2022
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Success!</h2>
    Number of writings in the file: ${count}
    <br>
    <form method="post" action="/Spring_3_Add_war_exploded/output">
        <input type="submit" value="Show everything!" />
    </form>
</body>
</html>
