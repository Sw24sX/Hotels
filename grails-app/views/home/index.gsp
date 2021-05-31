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
            <g:link controller="home" action="toHotels"> Справочник отелей </g:link>
            <br>
            <g:link controller="home" action="toCountry"> Справочник стран </g:link>
        </td>

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
    </table>
</body>
</html>