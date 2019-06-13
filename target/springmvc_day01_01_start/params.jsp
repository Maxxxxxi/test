<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
    <a href="params/testParams?username=abc&password=123">请求参数绑定</a>

    <form action="params/testBean" method="post">
        用户名：<input type="text" name="user.uname"><br/>
        年龄：<input type="text" name="user.age"><br/>
        账户：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        金额：<input type="text" name="money"><br/>
        <input type="submit" value="提交"><br/>
    </form>

    <form action="params/testDate" method="post">
        用户名：<input type="text" name="uname"><br/>
        年龄：<input type="text" name="age"><br/>
        生日：<input type="text" name="date"><br/>
        <input type="submit" value="提交">
    </form>


</body>
</html>
