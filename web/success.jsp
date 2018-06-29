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
<h1>成功!</h1>
<s:if test="name == '周韦彤'">
    你选择了周韦彤
</s:if>
<s:else>
    美女
</s:else>
</body>
</html>
