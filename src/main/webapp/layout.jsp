<%@page isELIgnored="false" pageEncoding="utf-8" contentType="text/html; UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/icon.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/easyui/easyui-lang-zh_CN.js"></script>
</head>
<body id="a" class="easyui-layout">
<div data-options="region:'north',split:true,title:'用户管理系统',height:'100',href:'${pageContext.request.contextPath }/top.jsp'"></div>
<div data-options="region:'south',split:true,title:'用户须知',height:'100',href:'${pageContext.request.contextPath }/foot.jsp'"></div>
<div data-options="region:'west',split:true,title:'功能菜单',width:'150',href:'${pageContext.request.contextPath }/left.jsp'"></div>
<div data-options="region:'east',split:true,title:'用户浏览推荐',width:'150',href:'${pageContext.request.contextPath }/right.jsp'"></div>
<div data-options="region:'center',title:'用户信息',background:'#eee',href:'${pageContext.request.contextPath }/center.jsp'"></div>
</body>
</html>