<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <form action="usernum.action" method="post">
  <table>
  <tr>
  <td>用户名：</td><td><input type="text" name="userName" ></td>
  </tr>
  <tr>
  <td>密码</td><td><input type="text" name="passWord" ></td>
  </tr>
  <tr>
  <td></td><td><input type="submit" value="提交" ></td>
  </tr>
  </table>
  
  </form>
  <!--   <s:form action="register">  
        <s:textfield name="user.username" label="用户名"></s:textfield>  
        <s:password name="user.password" label="密码"></s:password>  
       
        <s:submit value="注册"></s:submit>  
    </s:form>  
    -->
  </body>
</html>
