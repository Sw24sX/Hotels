<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 30.05.2021
  Time: 14:12
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Search Page</title>
</head>

<body>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Site</th>
            <th>Rating</th>
            <th>Country</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${list}" var="entry">
            <tr>
                <td>${entry.name}</td>
                <td>${entry.site}</td>
                <td>${entry.rating}</td>
                <td>${entry.country}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
</body>
</html>