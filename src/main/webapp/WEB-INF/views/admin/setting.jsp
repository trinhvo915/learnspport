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
            <li class="active"><a href="/admin/setting">Cấu hình</a></li>
        </ol>
        <div class="col-xs-12">
            <ul class="nav nav-tabs" role="tablist">
                <li class="active"><a href="#setting" role="tab" data-toggle="tab"><i class="fa fa-cog"></i>Cấu hình
                    chung cho website</a></li>
                <li><a href="#contact" role="tab" data-toggle="tab"><i class="fa fa-suitcase"></i>Thông tin về công
                    ty</a></li>
            </ul>
            <div class="tab-content" style="margin-top: 20px;">
                <div class="tab-pane active" id="setting">
                    <form class="form-horizontal" method="post" action="#" role="form">
                        <div class="form-group">
                            <label for="title" class="col-sm-4 control-label required">Tiêu đề website</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="title" type="text" class="form-control" id="title"
                                       placeholder="Tiêu đề ( ~ 70 ký tự )" required="" maxlength="70">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="keywords" class="col-sm-4 control-label required">Từ khóa tìm kiếm</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="keywords" type="text" class="form-control" id="keywords"
                                       placeholder="Từ khóa tìm kiếm, phân cách nhau bằng dấu phẩy" required=""
                                       maxlength="180">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="description" class="col-sm-4 control-label required">Mô tả về website</label>
                            <div class="col-md-6 col-sm-8">
                                <textarea name="description" rows="5" class="form-control" id="description"
                                          placeholder="Mô tả nội dung trang web (~ 120 kí tự)"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="favicon" class="col-sm-4 control-label">Favicon</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="favicon" type="file" class="form-control" id="favicon"
                                       accept="image/*"><br>
                                <img src="favicon.png" alt="favicon" class="img-thumbnail"> <span class="text-primary">Hình ảnh đang sử dụng.</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-4 col-sm-8">
                                <button type="submit" class="btn btn-danger"><i class="fa fa-save"></i> Lưu thay đổi
                                </button>
                                <a class="btn btn-warning" href="#"><i class="fa fa-reply"></i> Trở về</a>
                            </div>
                            <div class="col-md-7 col-md-offset-3 col-sm-12 col-xs-12" style="margin-top: 15px;">
                                <strong><i class="fa fa-warning text-danger"></i>Lưu ý :</strong><span
                                    class="text-danger"> Mọi thay đổi trong phần cấu hình sẽ ảnh hưởng trực tiếp đến website đang chạy, cần cân nhắc kỹ và nên liên hệ kỹ thuật trước khi thay đổi.</span>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="tab-pane" id="contact">
                    <form class="form-horizontal" method="post" action="#" role="form">
                        <div class="form-group">
                            <label for="company_name" class="col-sm-4 control-label required">Tên công ty</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="company_name" type="text" class="form-control" id="company_name"
                                       placeholder="Tên công ty" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="address" class="col-sm-4 control-label required">Địa chỉ</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="address" type="text" class="form-control" id="address"
                                       placeholder="Địa chỉ công ty" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="phone" class="col-sm-4 control-label required">Điện thoại</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="phone" type="text" class="form-control" id="phone"
                                       placeholder="Điện thoại liên hệ" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="fax" class="col-sm-4 control-label required">Fax</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="fax" type="text" class="form-control" id="fax" placeholder="Số fax"
                                       required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-sm-4 control-label required">Email</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="email" type="email" class="form-control" id="email"
                                       placeholder="Email công ty" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="website" class="col-sm-4 control-label required">Website</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="website" type="text" class="form-control" id="website"
                                       placeholder="Website" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="hotline" class="col-sm-4 control-label required">Đường dây nóng</label>
                            <div class="col-md-6 col-sm-8">
                                <input name="hotline" type="text" class="form-control" id="hotline"
                                       placeholder="Đường dây hỗ trợ" required="">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-4 col-sm-8">
                                <button type="submit" class="btn btn-danger"><i class="fa fa-save"></i> Lưu thay đổi
                                </button>
                                <a class="btn btn-warning" href="#"><i class="fa fa-reply"></i> Trở về</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <%--//**********//--%>
</div>
<!--END #main-->
</body>
</html>
