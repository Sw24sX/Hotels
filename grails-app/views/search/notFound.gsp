<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 30.05.2021
  Time: 14:58
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Not Found Page</title>
</head>

<body>
    <h1 style="position:absolute; width:100%; text-align:center">По вашему запросу ничего не найдено</h1>

    <form action="/search/toHome" method="get" style="margin: 0 auto; width: 320px; position:absolute; text-align:left">
        <input type="submit" name="Home" value="Home" id="Home">
    </form>
</body>
</html>