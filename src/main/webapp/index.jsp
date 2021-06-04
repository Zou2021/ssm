<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<html>
<head>
    <title>文件上传</title>
</head>
<style>
    body {
        text-align: center;
        background-color: #FDF5E6;
    }

    input {
        width: 10%;
        height: 4%;
    }
</style>
<body>
<form action="${pageContext.request.contextPath }/upload/singleFileUpload.do"
      method="post" enctype="multipart/form-data">
    <p>请你选择你的文件：<input type="file" name="files"></p>
    <p><input type="submit" value="提交"></p>
</form>
<h1>--------------------------------------------------------------------------</h1>
<form action="${pageContext.request.contextPath }/upload/MoreFileUpload.do"
      method="post" enctype="multipart/form-data">
    <p>请你选择你的文件：<input type="file" name="files"></p>
    <p>请你选择你的文件：<input type="file" name="files"></p>
    <p>请你选择你的文件：<input type="file" name="files"></p>
    <p>请你选择你的文件：<input type="file" name="files"></p>
    <p><input type="submit" value="提交"></p>
</form>
</body>
</html>
