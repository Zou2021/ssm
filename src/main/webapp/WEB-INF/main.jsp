<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ page isELIgnored="false" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
    当前用户：${USER_SESSION.username}
    <a href="/logout.do">退出</a>
</body>
</html>