<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2020/7/30
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="company">
    ${company.name} <br>
</c:forEach>
</body>
</html>
