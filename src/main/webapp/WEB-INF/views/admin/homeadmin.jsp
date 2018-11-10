<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <base href=".">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quản trị hệ thống</title>
    <link rel="shortcut icon" href="/resources/image/favicon.png">
    <jsp:include page="../header/styleadmin.jsp"/>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/admin"><i class="fa fa-cogs"></i> Quản trị hệ thống</a>
    </div>
    <jsp:include page="headAdmin.jsp"/>
</nav>
<div class="clearfix">
    <!--  //***********************************************// -->
    <jsp:include page="leftadmin.jsp"/>
    <!--  ======================================== -->
    <div id="main"><!--Phần chứa nội dung chính-->
        <ol class="breadcrumb">
            <li><a href="/admin"><i class="fa fa-home"></i> Trang quản trị</a></li>
        </ol>
        <div class="col-xs-12">
            <div class="menu">
                <a href="/admin" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-home"></i><br> <span>Trang quản trị</span>
                </a>
                <a href="/admin/listDanhMuc" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-fire"></i><br> <span>QUẢN LÝ DANH MỤC</span>
                </a>
                <a href="/admin/listpost" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-edit"></i><br> <span>QUẢN LÝ BÀI POST</span>
                </a>
                <a href="product.html" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-fire"></i><br> <span>QUẢN LÝ ĐỀ THI</span>
                </a>
                <a href="/admin/listComment" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-envelope-o"></i><br> <span>QUẢN LÝ COMMENT</span>
                </a>
                <a href="/admin/listUser" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-user"></i><br> <span>QUẢN LÝ USER</span>
                </a>
                <a href="/admin/listRanh" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-fire"></i><br> <span>QUẢN LÝ RANH USER</span>
                </a>
                <a href="/admin/setting" class="col-md-2 col-sm-5 col-xs-5">
                    <i class="fa fa-wrench"></i><br> <span>Cấu hình</span>
                </a>
            </div>
        </div>
    </div>
</div>
<!--END #main-->
</body>
</html>
