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
            <li class="active"><a href="/admin/listpost">Bài viết</a></li>
            <li class="active"><a href="/admin/newpost">Thêm bài viết mới</a></li>
        </ol>
        <div class="col-xs-12">
            <form id="post-form" class="form-horizontal col-xl-9 col-lg-10 col-md-12 col-sm-12" method="post" action="#"
                  enctype="multipart/form-data" role="form">
                <input name="id" type="hidden" value="0">
                <div class="form-group">
                    <label for="title" class="col-sm-2 control-label required">Tiêu đề</label>
                    <div class="col-sm-10">
                        <input name="title" type="text" value="" class="form-control" id="title"
                               placeholder="Tên bài viết ( ~ 70 ký tự )" required="" maxlength="100">
                    </div>
                </div>
                <div class="form-group">
                    <label for="keywords" class="col-sm-2 control-label">Từ khóa</label>
                    <div class="col-sm-10">
                        <input name="keywords" type="text" value="" class="form-control" id="keywords"
                               placeholder="meta keywords" maxlength="255">
                    </div>
                </div>
                <div class="form-group">
                    <label for="description" class="col-sm-2 control-label">Mô tả</label>
                    <div class="col-sm-10">
                        <textarea name="description" class="form-control" id="description"
                                  placeholder="meta description ( ~ 160 ký tự )" maxlength="255"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Ảnh</label>
                    <div class="col-sm-10 col-sm-offset-2">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="active"><a href="#img-file" role="tab" data-toggle="tab">Upload từ máy
                                tính</a></li>
                            <li><a href="#img-url" role="tab" data-toggle="tab">Lấy từ URL</a></li>
                        </ul>
                        <div class="tab-content" style="margin-top: 15px; min-height: 100px;">
                            <div class="tab-pane active" id="img-file">
                                <label for="image" class="col-sm-3 control-label">Từ máy tính</label>
                                <div class="col-sm-9">
                                    <input name="image" type="file" class="form-control" id="image"
                                           accept="image/*">
                                </div>
                            </div>
                            <div class="tab-pane" id="img-url">
                                <label for="url" class="col-sm-3 control-label"> Từ URL</label>
                                <div class="col-sm-9">
                                    <input name="image" type="text" value="" class="form-control" id="url"
                                           placeholder="Đường dẫn tới hình ảnh" maxlength="255">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div>
                        <label for="content" class="col-sm-2 control-label">Nội dung</label>
                    </div>
                </div>
                <div class="form-group">
                    <div>
                        <div class="col-sm-12">
                            <textarea name="content" rows="5" class="form-control ckeditor" id="content"
                                  placeholder="Nội dung bài viết">
                            </textarea>
                        </div>
                    </div>
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-submit">
                            <small><i class="fa fa-plus"></i></small>
                            Thêm mới
                        </button>
                        <%--<button type="submit" class="btn btn-danger"><small><i class="fa fa-save"></i></small> Lưu nháp</button>--%>
                        <a class="btn btn-warning" href="/admin">
                            <small><i class="fa fa-reply"></i></small>
                            Trở về</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
    <script type="text/javascript">
        // $(function() {
        //     $("#content").ckeditor({
        //         toolbar : 'Basic',
        //         uiColor : '#F7D358'
        //     });
        // });
        $(document).ready(function () {
            CKEDITOR.replace("content");
        })
    </script>
    <!--END #main-->
</body>
</html>
