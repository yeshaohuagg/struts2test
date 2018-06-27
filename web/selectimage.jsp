<%--
  Created by IntelliJ IDEA.
  User: xhjy
  Date: 2018/6/26
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1>登录成功!</h1>
hello,<s:property value="username"/>
<form action="Image.action" method="post">
    <table>
        <tr>
            <td>图片网址：</td>
            <td><input type="text" name="url"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit" value="查看图像"></td>
        </tr>
    </table>
</form>
<form action="Upload.action" method="post" enctype="multipart/form-data">
    <input type="file" name="myFile"/>
    <input type="submit" value="上传文件"/>
</form>
</body>
</html>
