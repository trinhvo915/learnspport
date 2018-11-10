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
            <li class="active"><a href="/admin/listComment">Danh sách Comment</a></li>
        </ol>
        <div class="col-xs-12">
            <form id="post_form" method="post" action="" role="form">
                <div class="col-xs-12">
                    <div class="form-group">
                        <!-- Single button -->
                        <div class="btn-group">
                            <select id="task" name="task" class="form-control">
                                <option>Tác vụ</option>
                                <option value="delete">Xóa</option>
                                <option value="deactive">Ẩn</option>
                                <option value="active">Hiện</option>
                            </select>
                        </div>
                        <div class="btn-group pull-right hidden-xs" id="div-search">
                            <input id="search" name="search" type="text" value="" class="form-control" placeholder="Tìm kiếm">
                            <span class="fa fa-search"></span>
                        </div>
                    </div>
                    <table class="table table-bordered table-hover">
                        <thead>
                        <tr>
                            <th><input id="check_all" type="checkbox"></th>
                            <th class="hidden-xs">ID</th>
                            <th class="hidden-xs">NỘI DUNG</th>
                            <th>NGÀY COMMENT</th>
                            <th class="hidden-sm hidden-xs">USER</th>
                            <th class="hidden-sm hidden-xs">DANH MỤC</th>
                            <th class="hidden-sm hidden-xs">BÀI POST</th>
                            <th>Sửa</th>
                            <th>Xóa</th>
                            <th>Tình trạng</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="0">
                            </td>
                            <td class="hidden-xs">1</td>
                            <td class="hidden-xs">XXXXXXXXXXXX</td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <a href="new-product.html">TRINH VO</a>
                            </td>
                            <td class="hidden-sm hidden-xs">TOÁN</td>
                            <td class="hidden-sm hidden-xs">LƯỢNG GIÁC</td>
                            <td>
                                <a href="new-product.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top" title="Sửa sản phẩm"></i></a>
                            </td>
                            <td>
                                <i class="fa fa-times text-danger" data-toggle="tooltip" data-placement="top" title="Đã ẩn với người dùng"></i>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="0">
                            </td>
                            <td class="hidden-xs">1</td>
                            <td class="hidden-xs">YYYYYYYYYYYYY</td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <a href="new-product.html">TRI DANG</a>
                            </td>
                            <td class="hidden-sm hidden-xs">TOÁN</td>
                            <td class="hidden-sm hidden-xs">SỐ PHỨC</td>
                            <td>
                                <a href="new-product.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top" title="Sửa sản phẩm"></i></a>
                            </td>
                            <td>
                                <i class="fa fa-times text-danger" data-toggle="tooltip" data-placement="top" title="Đã ẩn với người dùng"></i>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input name="id[]" type="checkbox" value="0">
                            </td>
                            <td class="hidden-xs">3</td>
                            <td class="hidden-xs">XXXXXXXXXXXX</td>
                            <td class="hidden-sm hidden-xs">2014-06-19 01:05:13</td>
                            <td>
                                <a href="new-product.html">TRINH VO</a>
                            </td>
                            <td class="hidden-sm hidden-xs">TOÁN</td>
                            <td class="hidden-sm hidden-xs">LƯỢNG GIÁC</td>
                            <td>
                                <a href="new-product.html"><i class="fa fa-edit" data-toggle="tooltip" data-placement="top" title="Sửa sản phẩm"></i></a>
                            </td>
                            <td>
                                <i class="fa fa-times text-danger" data-toggle="tooltip" data-placement="top" title="Đã ẩn với người dùng"></i>
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
                    <p><strong><i class="fa fa-bookmark"></i>Ghi chú: </strong></p>
                    <p class="note-items"><i class="fa fa-check text-success"></i> Hiển thị với người dùng.</p>
                    <p class="note-items"><i class="fa fa-times text-danger"></i> Ẩn với người dùng</p>
                </div>
            </form>
        </div>
    </div>
    <!--END #main-->
</body>
</html>
