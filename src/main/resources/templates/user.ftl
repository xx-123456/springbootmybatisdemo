<html>
    <head>
        <title>Springboot 模板测试</title>
    </head>
    <body>
        <table border="1" align="center" cellpadding="10" cellspacing="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>用户名</th>
                    <th>密码</th>
                </tr>
            </thead>
            <tbody>
            <#list userList as user>
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.uname}</td>
                    <td>${user.password}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </body>
</html>