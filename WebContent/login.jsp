<%@ page language="java" 
    contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC 
    "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>认证码输入页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0"> 
</head>
<body>
<!-- 
<form method="post" action="check.jsp">
 -->
<form method="post" action="CheckImageServlet">
<table>
    <tr>
        <td align="left">帐户：</td>
        <td><input type="text" name="rand" maxlength="6" value=""/></td>
    </tr>
    <tr>
        <td align="left">密码：</td>
        <td><input type="password" name="rand" maxlength="6" value=""/></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="登录"></td>
    </tr>
</table>
</form>
</body>
</html>
