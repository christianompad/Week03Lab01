<%-- 
    Document   : login
    Created on : Sep 20, 2017, 12:58:55 PM
    Author     : 718205
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="Login" method="post">
            Username:<input type="text" name="username" value="${username}"><br>
            Password:<input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Login">
        </form>
        ${message}
        
    </body>
</html>
