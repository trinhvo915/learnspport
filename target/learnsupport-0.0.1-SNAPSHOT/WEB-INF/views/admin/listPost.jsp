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
        <ol class="breadcrumb" id="step2">
            <li><a href="/admin"><i class="fa fa-home"></i> Trang quản trị</a></li>
            <li class="active"><a href="/admin/listpost">Bài viết</a></li>
        </ol>
        <div class="col-xs-12">
            <form id="admin-form" method="post" action="" role="form">
                <div class="col-xs-12">
                    <div class="form-group">
                        <!-- Single button -->
                        <div class="btn-group" id="step3">
                            <select id="task" name="task" class="form-control">
                                <option>Tác vụ</option>
                                <option value="delete">Xóa bài viết</option>
                                <option value="deactive">Ẩn bài viết</option>
                                <option value="active">Hiện bài viết</option>
                            </select>
                        </div>
                        <a href="/admin/newpost" class="btn btn-submit">
                            <small><i class="fa fa-plus"></i></small>
                            Thêm mới</a>
                        <div class="btn-group pull-right hidden-xs" id="div-search">
                            <input id="search" name="search" type="text" value="" class="form-control"
                                   placeholder="Tìm kiếm">
                            <span class="fa fa-search"></span>
                        </div>
                    </div>
                    <table class="table table-bordered table-hover" id="step4">
                        <thead>
                        <tr>
                            <th><input id="check_all" type="checkbox"></th>
                            <th class="hidden-xs">ID</th>
                            <th>Bài viết</th>
                            <th>Danh Mục</th>
                            <th class="hidden-sm hidden-xs">Ngày đăng</th>
                            <th>Tình trạng</th>
                            <th>Sửa</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="1">
                            </td>
                            <td class="hidden-xs">1</td>
                            <td>
                                <a href="/admin/newpost">SH4TinyMCE</a>
                            </td>
                            <td>
                                <a href="/admin/newpost">Toán</a>
                            </td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <i class="fa fa-check text-success" data-toggle="tooltip" data-placement="top"
                                   title="Đang hiển thị"></i>
                            </td>
                            <td>
                                <a href="new-post.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top"
                                                           title="Sửa bài viết"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="2">
                            </td>
                            <td class="hidden-xs">2</td>
                            <td>
                                <a href="new-post.html">Cuộc đời truyền kỳ của Đức Pháp Vương Gyalwang Drukpa</a>
                            </td>
                            <td>
                                <a href="/admin/newpost">Lý</a>
                            </td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <i class="fa fa-times text-danger" data-toggle="tooltip" data-placement="top"
                                   title="Đã ẩn với người dùng"></i>
                            </td>
                            <td>
                                <a href="new-post.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top"
                                                           title="Sửa bài viết"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="3">
                            </td>
                            <td class="hidden-xs">3</td>
                            <td>
                                <a href="new-post.html">Tìm MH370 giữa biển rác của đại dương</a>
                            </td>
                            <td>
                                <a href="/admin/newpost">Hóa</a>
                            </td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <i class="fa fa-check text-success" data-toggle="tooltip" data-placement="top"
                                   title="Đang hiển thị"></i>
                            </td>
                            <td>
                                <a href="new-post.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top"
                                                           title="Sửa bài viết"></i></a>
                            </td>

                        </tr>
                        </tbody>
                    </table>
                    <div class="text-right">
                        <ul class="pagination" id="step5">
                            <li class="disabled"><span>«</span></li>
                            <li class="active"><span>1</span></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">»</a></li>
                        </ul>
                    </div>
                    <div id="step6">
                        <p><strong><i class="fa fa-bookmark"></i>Ghi chú: </strong></p>
                        <p class="note-items"><i class="fa fa-check text-success"></i> Hiển thị với người dùng.</p>
                        <p class="note-items"><i class="fa fa-times text-danger"></i> Ẩn với người dùng</p>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--END #main-->
</div>
</body>
</html>
