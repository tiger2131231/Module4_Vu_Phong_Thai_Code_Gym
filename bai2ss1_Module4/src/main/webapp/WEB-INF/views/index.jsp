<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Từ điển Anh - Việt</title>
</head>
<body>
    <h2>Từ điển Anh - Việt</h2>
    <form action="dictionary" method="post">
        <input type="text" name="word" placeholder="Nhập từ cần tra..." required>
        <button type="submit">Tra cứu</button>
    </form>

    <c:if test="${not empty result}">
        <p>Từ: ${word}</p>
        <p>Nghĩa: ${result}</p>
    </c:if>

    <c:if test="${not empty message}">
        <p style="color: red;">${message}</p>
    </c:if>
</body>
</html>