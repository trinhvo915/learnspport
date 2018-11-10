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
    <div id="main">
        <ol class="breadcrumb">
            <li><a href="/admin"><i class="fa fa-home"></i> Trang quản trị</a></li>
            <li class="active"><a href="/admin/listUser">Tài khoản</a></li>
            <li class="active"><a href="/admin/newUser">Thêm tài khoản mới</a></li>
        </ol>
        <div class="col-xs-12">
            <form id="admin-form" class="form-horizontal col-xl-8 col-lg-9 col-md-10" method="post" action="" role="form">
                <input name="id" type="hidden" value="0">
                <div class="form-group">
                    <label for="fullname" class="col-sm-3 control-label required">Tên hiển thị</label>
                    <div class="col-sm-9">
                        <input name="fullname" type="text" value="" class="form-control" id="fullname" placeholder="Tên hiển thị" required="" maxlength="255">
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label required">Email</label>
                    <div class="col-sm-9">
                        <input name="email" type="email" value="" class="form-control" id="email" placeholder="Email" required="">
                    </div>
                </div>
                <div class="form-group">
                    <label for="pass" class="col-sm-3 control-label required">Mật khẩu</label>
                    <div class="col-sm-9">
                        <input name="pass" type="password" value="" class="form-control" id="pass" placeholder="Mật khẩu" required="">
                    </div>
                </div>
                <div class="form-group">
                    <label for="repass" class="col-sm-3 control-label required">Nhập lại mật khẩu</label>
                    <div class="col-sm-9">
                        <input name="repass" type="password" value="" class="form-control" id="repass" placeholder="Nhập lại mật khẩu" required="">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-9">
                        <button type="submit" class="btn btn-submit"><small><i class="fa fa-plus"></i></small> Thêm mới</button>
                        <a class="btn btn-warning" href="#"><small><i class="fa fa-reply"></i></small> Trở về</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--END #main-->
</div>
</body>
</html>
