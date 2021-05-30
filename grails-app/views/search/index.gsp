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
    <table style="margin: 0; padding: 0">
        <td>
            <form action="/search/toHome" method="get" style="margin: 5px 10px; width: auto; align:left">
                <input type="submit" name="Home" value="Новый поиск" id="Home">
            </form>
        </td>

        <td>
            <p style="margin: 5px 10px; text-align: left">Найдено: ${countResult}</p>
        </td>
    </table>

    <table>
        <thead>
        <tr>
            <th>Звездность</th>
            <th>Название</th>
            <th>Сайт</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${list}" var="entry">
            <tr>
                <td>${entry.rating}</td>
                <td>${entry.name}</td>
                <td>
                    <g:if test="${entry.site != null}">
                        <p>
                            <a href=${entry.site}>Перейти на сайт</a>
                        </p>
                    </g:if>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
</body>
</html>