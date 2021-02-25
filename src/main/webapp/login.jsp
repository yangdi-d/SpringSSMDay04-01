<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/6 0006
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="toLogin" method="post">
        用户名：<input type="text" name="qqnum"><br>
        密码：<input type="text" name="qqpwd"><br>
        <input type="submit" value="Login">
    </form>

    <form action="toRegist" method="post">
        姓名：<input type="text" name="name"><br>
        用户名：<input type="text" name="qqnum"><br>
        密码：<input type="text" name="qqpwd"><br>
        <input type="submit" value="regist">
    </form>
    <form action="toDelete" method="post">
        请输入要删除的用户id:<input type="text" name="id">
        <input type="submit" value="删除">
    </form>
    <form action="toUpdate" method="post">
        要修改的用户id:<input type="text" name="id"><br>
        姓名：<input type="text" name="name"><br>
        密码：<input type="text" name="qqpwd"><br>
        <input type="submit" value="update">
    </form>

</body>
</html>
