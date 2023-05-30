<%-- 
    Document   : helloWorldForm
    Created on : May 23, 2023, 2:29:43 PM
    Author     : aalmasri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="home">
            <input type="text" name="firstName" value="${fn}"/> <br>
            <input type="text" name="lastName" value="${ln}"/> <br>
            <input type="submit" />
        </form>
        <c:if test="${message == true}">
            <h1>Invalid Input</h1>
        </c:if>
    </body>
</html>
