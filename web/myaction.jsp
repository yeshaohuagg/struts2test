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

    <em>Google's SMTP 将为你提供服务，请输入账户和密码</em>
    <form action="Emailer.action" method="post">
        <label for="from">From</label><br/>
        <input type="text" name="from"><br/>
        <label for="password">Password</label><br/>
        <input type="password" name="password"><br/>
        <label for="to">To</label><br/>
        <input type="text" name="to"><br/>
        <label for="subject">Subject</label><br/>
        <input type="text" name="subject"><br/>
        <label for="body">Body</label><br/>
        <input type="text" name="body"><br/>
        <input type="submit" value="发送"><br/>
    </form>

    <s:form action="Emploee" method="POST">
        <s:textfield name="name" label="Name" size="20"/>
        <s:textfield name="age" label="Age" size="20"/>
        <s:submit name="submit" label="Submit" align="center"/>
    </s:form>
</body>
</html>
