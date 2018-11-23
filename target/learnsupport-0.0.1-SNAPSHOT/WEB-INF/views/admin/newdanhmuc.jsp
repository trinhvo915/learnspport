<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
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
            <li class="active"><a href="/admin/listDanhMuc">Danh Mục</a></li>
            <li class="active">
                <c:choose>
                    <c:when test="${not empty danhmucupdate}">
                        <a href="/admin/newDanhMuc">Cập Nhập Danh Mục</a>
                    </c:when>
                    <c:otherwise>
                        <a href="/admin/newDanhMuc">Thêm Danh Mục Mới</a>
                    </c:otherwise>
                </c:choose>

            </li>
        </ol>
        <div class="col-xs-12">
            <c:choose>
                <c:when test="${not empty danhmucupdate}">
                    <form:form id="admin-form" action="/admin/edit"  role="form" class="form-horizontal col-xl-8 col-lg-9 col-md-10" modelAttribute="danhmucupdate">
                        <div class="form-group">
                            <div class="col-sm-9">
                                <form:hidden path="idmonhoc" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="fullname" class="col-sm-3 control-label required">Tên Danh Mục</label>
                            <div class="col-sm-9">
                                <form:input path="nameMonHoc" class="form-control" id="fullname" placeholder="Tên danh mục" required="" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label required">Ngày Tạo</label>
                            <div class="col-sm-9">
                                <form:input type="date" path="createday" required="" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-submit"><small><i class="fa fa-plus"></i></small> Thêm mới</button>
                                <a class="btn btn-warning" href="/admin/listDanhMuc"><small><i class="fa fa-reply"></i></small> Trở về</a>
                            </div>
                        </div>
                    </form:form>
                </c:when>
                <c:otherwise>
                   <form:form id="admin-form" action="/admin/add"  role="form" class="form-horizontal col-xl-8 col-lg-9 col-md-10" modelAttribute="danhmuc">
                       <c:if test="${not empty result}">
                           <div class="form-group">
                               <label style="color:greenyellow;" class="col-sm-3 control-label">${result}</label>
                           </div>
                       </c:if>
                       <div class="form-group">
                           <label for="fullname" class="col-sm-3 control-label required">Tên Danh Mục</label>
                           <div class="col-sm-9">
                               <form:input  path="nameMonHoc" class="form-control" id="fullname" placeholder="Tên hiển thị" required="" />
                           </div>
                       </div>
                       <div class="form-group">
                           <label class="col-sm-3 control-label required">Ngày Tạo</label>
                           <div class="col-sm-9">
                               <form:input type="date" path="createday" required="" />
                           </div>
                       </div>
                       <div class="form-group">
                           <div class="col-sm-offset-3 col-sm-9">
                               <button type="submit" class="btn btn-submit"><small><i class="fa fa-plus"></i></small> Thêm mới</button>
                               <a class="btn btn-warning" href="/admin/listDanhMuc"><small><i class="fa fa-reply"></i></small> Trở về</a>
                           </div>
                       </div>
                   </form:form>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
    <!--END #main-->
</div>
</body>
</html>
