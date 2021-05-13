<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Home Page</title>
    <link href="<c:url value="style.css" />" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>

<body>
<h1>Trang chủ</h1>
<h1>Menu</h1>

<%@ include file="menu.jsp" %>
</body>
<c:forEach var="shoe" items="${items}">
    asdsd
    <p>${shoe.id}</p>
    <p>${shoe.name}</p>
</c:forEach>
<button id="btn-test">Test</button>
<div id="main" style="background-color: aqua">

</div>
</body>
<script>
    $('#btn-test').click(function (){
        $.ajax({
            type: 'GET',
            datatype: 'JSON',
            url: '/getall',

            success: function (result) {
                console.log(result);
                var html ='';
                for (var i = 0 ; i < result.length; i++){
                    html += '<button>' + result[i].name +'</button>';
                }

                $('#main').append(html);
            }
        });
    });

</script>
</html>