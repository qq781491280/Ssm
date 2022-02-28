<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2022/1/4
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList= new Array();
        userList.push({username:"zhangsan",age:18});
        userList.push({username:"lisi",age:28});
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick8",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        })

    </script>
</head>
<body>

</body>
</html>
