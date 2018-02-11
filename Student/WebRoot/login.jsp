<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link href="${pageContext.request.contextPath }/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
  function validate_form(){
   var name = document.getElementById("username").value;
   var password = document.getElementById("password").value;
   if(name==null || name==""){
     alert("姓名不能为空");
     return false;
   }
    if(password==null || password==""){
     alert("密码不能为空");
     return false;
   }
   return true;
  
  }


</script>
</head>
<body >
<h2>用户登录</h2>

<p><span id="loginHit" > <%=session.getAttribute("msg")==null?"":session.getAttribute("msg") %><% session.removeAttribute("msg"); %></span></p> 

<form action="${pageContext.request.contextPath }/servlet/doLogin" onsubmit="return validate_form()" method="post">

    <table class="loginTable">

      <tr>
       <td id="name">用户名：</td>
       <td id="nmtd"><input type="text" name="username" id="username"></td>
      </tr>
      
       <tr>
       <td id="pwd">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
       <td id="pwdtd"><input type="password" name="password" id="password"></td>
      </tr>
      <tr>
       <td colspan="2"><input type="submit" value="登录"></td>
      </tr>
    </table>


</form>

</body>
</html>