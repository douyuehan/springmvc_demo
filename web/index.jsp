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
  </head>
  <body>
    <form method="post" action="${pageContext.request.contextPath}/hello.do">
      姓名：<input type="text" name="user_name">
      籍贯：<input type="text" name="user_city">
      年龄：<input type="text" name="user_age">
      身份证号：<input type="text" name="user_no">
      <input type="submit">
    </form>
  </body>
</html>
