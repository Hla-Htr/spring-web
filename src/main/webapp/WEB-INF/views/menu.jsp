<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach var="item" items="${menus}">
        <li>${item}</li>
    </c:forEach>
</ul>