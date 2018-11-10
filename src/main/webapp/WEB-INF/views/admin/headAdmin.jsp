<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <span style="color: chartreuse">Chào Admin </span>
                <span style="color: red; font-size: 20px">${username}</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="fa fa-user"></i> Chỉnh sửa tài khoản</a></li>
                <li><a href="#"><i class="fa fa-power-off"></i> Đăng xuất</a></li>
            </ul>
        </li>
    </ul>
</div>
<!-- /.navbar-collapse -->
