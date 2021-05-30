<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 30.05.2021
  Time: 13:24
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>

<body>
    <h1>Test page</h1>
<table>
    <tbody>
    <g:each in="${list}" var="entry">
        <tr>
            <td>${entry}</td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>