<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ page isELIgnored="false" %>
    
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="login.do" method="post">
        用户名：<input type="text" name="username"><br>
        密&nbsp;&nbsp;&nbsp;码:
        <input type="password" name="password"><br>
        ${msg}<br>
        <input type="submit" value="登录">
    </form>
</body>
</html>