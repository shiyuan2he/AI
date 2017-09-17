<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>--%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no, minimal-ui"/>
    <title>登陆</title>
   <%-- <link rel="stylesheet" href="<%=basePath%>/resources/ai-resource/css/style.css"/>
    <link rel="stylesheet" href="<%=basePath%>/resources/ai-resource/css/my.css"/>
    <script src="<%=basePath%>/resources/ai-resource/js/jquery-1.11.1.min.js"></script>
    <script src="<%=basePath%>/resources/ai-resource/js/rem.js"></script>--%>
</head>
<body>
<div class="login-content">
    <form action="" method="post" id="">
        <!-- 手机号登录 -->
        <div class="login-formdiv">
            <img src="images/login-phone.png" alt="" class="login-phoneimg"/>
            <input type="text" class="login-text" value="" placeholder="请输入登录手机号">
        </div>
        <div class="login-formdiv">
            <%--<img src="<%=basePath%>/resources/ai-resource/images/login-yzm.png" alt="" class="login-phoneimg"/>--%>
            <input type="text" class="login-text login-pwd" value="" placeholder="请输入验证码">
            <button class="login-yzm">获取验证码</button>
        </div>
    </form>
</div>
<div class="btndiv">
    <a href="javascript:void(0);" class="submit-btn">完成</a>
</div>
  <%--  <script type="text/javascript" src="<%=basePath%>/resources/ai-resource/js/flexible.js"></script>
    <script type="text/javascript" src="<%=basePath%>/resources/ai-resource/js/jquery-1.11.1.min.js"></script>--%>
</body>
</html>