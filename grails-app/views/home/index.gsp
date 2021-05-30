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

    <form action="/home/search" method="post" style="margin: 0 auto; width: 320px">
        <input type="text" name="query" value="" id="query">
        <input type="submit" name="Search" value="Search" id="Search">
    </form>

    <form action="/home/toCountry" method="get" style="margin: 0 auto; width: 320px">
        <input type="submit" name="Countries" value="Countries" id="Country">
    </form>

    <form action="/home/toHotels" method="get" style="margin: 0 auto; width: 320px">
        <input type="submit" name="Hotels" value="Hotels" id="Hotel">
    </form>

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