<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html lang="vi">
   <head>
        <base href=".">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Quản trị hệ thống</title>
      <link rel="shortcut icon" href="resources/image/favicon.png">
      <%-- <jsp:include page="../header/styleadmin.jsp"/ --%>>
	<%-- <ja<%=  %> --%>
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
            <a class="navbar-brand" href="#"><i class="fa fa-cogs"></i> Quản trị hệ thống</a>
         </div>
         <!-- Collect the nav links, forms, and other content for toggling -->
         <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
               <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sang Nguyen<b class="caret"></b></a>
                  <ul class="dropdown-menu">
                     <li><a href="#"><i class="fa fa-user"></i> Chỉnh sửa tài khoản</a></li>
                     <li><a href="#"><i class="fa fa-power-off"></i> Đăng xuất</a></li>
                  </ul>
               </li>
            </ul>
         </div>
         <!-- /.navbar-collapse -->
      </nav>
 <!--  //***********************************************// -->
     <jsp:include page="leftadmin.jsp"/>
 <!--  ======================================== -->
         <div id="main"><!--Phần chứa nội dung chính-->
            <ol class="breadcrumb">
               <li><a href="index.html"><i class="fa fa-home"></i> Trang quản trị</a></li>
            </ol>
            <div class="col-xs-12">
               <div class="menu">
                  <a href="index.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-home"></i><br> <span>Trang quản trị</span>
                  </a>
                  <a href="post.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-edit"></i><br> <span>Tin tức</span>
                  </a>
                  <a href="product.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-fire"></i><br> <span>Sản phẩm</span>
                  </a>
                  <a href="type_product.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-bars"></i><br> <span>Loại sản phẩm</span>
                  </a>
                  <a href="contact.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-envelope-o"></i><br> <span>Phản hồi</span>
                  </a>
                  <a href="slider.html" class="col-md-2 col-sm-5 col-xs-5">
                     <i class="fa fa-picture-o"></i><br> <span>Slider</span>
                     </a>
                  <a href="user.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-user"></i><br> <span>Tài khoản</span>
                  </a>
                  <a href="setting.html" class="col-md-2 col-sm-5 col-xs-5">
                  <i class="fa fa-wrench"></i><br> <span>Cấu hình</span>
                  </a>
               </div>
            </div>
         </div>
         <!--END #main-->
      </div>
   </body>
</html>
