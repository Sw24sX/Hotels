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
    <table>
        <td>
            <form action="/home/search" method="post" style="margin: 5px 10px; width: 320px">
                <input type="text" name="query" value="" id="query">
                <input type="submit" name="Search" value="Search" id="Search">
            </form>
        </td>

        <td>
            <form action="/home/toCountry" method="get" style="margin: 5px 10px; width: 320px; align:left">
                <input type="submit" name="Countries" value="Countries" id="Country">
            </form>
        </td>

        <td>
            <form action="/home/toHotels" method="get" style="margin: 5px 10px; width: 320px; align:left">
                <input type="submit" name="Hotels" value="Hotels" id="Hotel">
            </form>
        </td>
    </table>






    <table>
        <thead>
            <tr>
                <th>Rating</th>
                <th>Name</th>
                <th>Country</th>
                <th>Site</th>
            </tr>
        </thead>
        <tbody>
        <g:each in="${list}" var="entry">
            <tr>
                <td>${entry.rating}</td>
                <td>${entry.name}</td>
                <td>${entry.country}</td>
                <td>${entry.site}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
</body>
</html>