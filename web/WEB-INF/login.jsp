<%-- 
    Document   : login
    Created on : Sep 20, 2017, 12:58:55 PM
    Author     : 718205
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/WEB-INF/header.html"/>
    <body>
        <h1>Login Page</h1>
        <form action="Login" method="post">
            Username:<input type="text" name="username" value="${username}"><br>
            Password:<input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Login">
        </form>
        ${message}
        
    </body>
    <c:import url="/WEB-INF/footer.html"/>
