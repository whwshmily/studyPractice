<%--
  Created by IntelliJ IDEA.
  User: 96218
  Date: 2020/5/16
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    <s:textfield label="1" name="1" ></s:textfield>
    <s:password label="2" name="2"></s:password>
    <s:radio list="#{'1':'男','2':'女'}" label="单选框" value="2" name="3"></s:radio>
    <s:checkboxlist list="#{'1':'足球','2':'篮球','3':'皮球'}" label="复选框" name="4"></s:checkboxlist>
    <s:select list="#{'1':'天','2':'地','3':'人'}" label="选择框" value="1" name="5"></s:select>
    <s:submit value="sss"></s:submit>
    <s:textarea label="ssssss"></s:textarea>
</form>
</body>
</html>
