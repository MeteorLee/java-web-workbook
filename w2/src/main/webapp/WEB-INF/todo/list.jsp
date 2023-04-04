<%--
  Created by IntelliJ IDEA.
  User: 82108
  Date: 2023-04-04
  Time: 오후 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Todo List</h1>
    <h2>${appName}</h2>
    <h2>${loginInfo}</h2>
    <h3>${loginInfo.mname}</h3>

    <ul>
        <c:forEach var="dto" items="${dtoList}">
            <li>
                <span><a href="/todo/read?tno=${dto.tno}">${dto.tno}</a></span>
                <span>${dto.title}</span>
                <span>${dto.dueDate}</span>
                <span>${dto.finished ? "DONE" : "NOT YET"}</span>
            </li>
        </c:forEach>
    </ul>

    <form action="/logout" method="post">
        <button type="submit">LOGOUT</button>
    </form>
</body>
</html>
