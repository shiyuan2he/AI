<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no, minimal-ui"/>
    <title>登陆</title>
    <link rel="stylesheet" href="<%=basePath%>/resources/ai-resource/css/style.css"/>
    <link rel="stylesheet" href="<%=basePath%>/resources/ai-resource/css/my.css"/>
    <script src="<%=basePath%>/resources/ai-resource/js/jquery-1.11.1.min.js"></script>
    <script src="<%=basePath%>/resources/ai-resource/js/rem.js"></script>
</head>
<body>
<div style="width: 98%;height: 880px;padding:0">
    <div>
        <div style="width: 100%;height: 800px;">
            <input style="width:100%;height:100%"/>
        </div>
    </div>
    <div class="chatinfo">
        <img src="<%=basePath%>/resources/ai-resource/images/login-yzm.png" alt="" class="login-phoneimg"/>
        <input type="text" id="content" style="width: 4.85rem;" class="login-text login-pwd" value="" placeholder="请输入内容">
        <button class="login-yzm" onclick="javascript:chat.doChat();">发送</button>
    </div>
</div>
<script>var base = '<%=basePath%>';</script>
<script src="<%=basePath%>/resources/ai-resource/js/chat.js"></script>
</body>
</html>