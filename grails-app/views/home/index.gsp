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
                <select type="select" name="country">
                    <g:each in="${countries}" var="country">
                        <option>${country.name}</option>
                    </g:each>
                </select>
                <input type="submit" name="Search" value="Найти" id="Search" style="margin: 5px 50px">
            </form>
        </td>

        <td>
            <form action="/home/toCountry" method="get" style="margin: 5px 10px; width: 320px; align:left">
                <input type="submit" name="Countries" value="Справочник стран" id="Country">
            </form>
        </td>

        <td>
            <form action="/home/toHotels" method="get" style="margin: 5px 10px; width: 320px; align:left">
                <input type="submit" name="Hotels" value="Справочник отелей" id="Hotel">
            </form>
        </td>
    </table>
</body>
</html>