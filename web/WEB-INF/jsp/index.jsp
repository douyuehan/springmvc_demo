<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/26
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/javascript/test.js"></script>
</head>
<body>
<%--<form method="post" action="${pageContext.request.contextPath}/hello.do">--%>
    <%--姓名：<input type="text" name="user_name">--%>
    <%--籍贯：<input type="text" name="user_city">--%>
    <%--年龄：<input type="text" name="user_age">--%>
    <%--身份证号：<input type="text" name="user_no">--%>
    <%--<input type="submit">--%>
<%--</form>--%>
<p id="content">ppppppppppppp999999999pppppppppppppp</p>
<a href="${pageContext.request.contextPath}/count/3">计数</a>
<a href="${pageContext.request.contextPath}/delete/zhangsan/3">删除</a>
<%--<a href="${pageContext.request.contextPath}/count/3">计数</a>--%>
<%--<img src="${pageContext.request.contextPath}/static/img/timg.jpg">--%>
<form method="post" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
    用户名：<input type="text" name="username">
    <input type="file" name="upload_pic">
    <input type="submit">
</form>

<img src="${pageContext.request.contextPath}/static/upload/${picname}">

</body>
</html>
