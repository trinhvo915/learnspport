<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
	<title>Register</title>
	<jsp:include page="header/header.jsp"/>
</head>
<body>
	<header id="#header">
		<div class="logo"> 
			<a href="/learnsupport/">
				<img src='<c:url value = "resources/image/logo.png"/>'>
			</a>
		</div>
		<div class="menu">
			<div class="menu_left">
				<a id="menu_post" href="#">POSTS</a>
				<a id ="menu_test" href="#">TEST</a>

			</div>
			
		</div>
		<div class="menu_right">
				<input id = "search_input" name="search" placeholder="Learn Support" />
				<button type="button" class="btn btn-default">
     				 <span class="glyphicon glyphicon-search"></span> 
    			</button>
    			<a href="">Register</a>
    			<a href="dangnhap">Log in</a>
			</div>
	</header>
	<div class = "FormRegister" id="content">
		<form action="" class="register">
            <h1>ĐĂNG KÝ THÀNH VIÊN</h1>
            <fieldset class="row1">
                <legend>Thông tin chi tiết
                </legend>
                <p>
                    <label>Username *
                    </label>
                    <input type="text"/>
                    <label>Nhập lại Username *
                    </label>
                    <input type="text"/>
                </p>
                <p>
                    <label>Mật Khẩu*
                    </label>
                    <input type="text"/>
                    <label>Nhập Lại Mật Khẩu*
                    </label>
                    <input type="text"/>                  
                    </label>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Thông tin cá nhân
                </legend>
                <p>
                    <label>Email *
                    </label>
                    <input type="text" class="long"/>
                </p>
                <p>
                    <label>Số điện thoại *
                    </label>
                    <input type="text" maxlength="10"/>
                </p>
                
                <p>
                    <label>Thành phố *
                    </label>
                    <input type="text" class="long"/>
                </p>
                
                
            </fieldset>
            <fieldset class="row3">
                <legend>Thông Tin Thêm
                </legend>
                <p>
                    <label>Giới tính *</label>
                    <input type="radio" name="gender" value="radio"/>
                    <label class="gender">Nam</label>
                    <input type="radio" name="gender" value="radio"/>
                    <label class="gender" >Nữ</label>
                </p>
                <p>
                    <label>Ngày sinh *
                    </label>
                    <select class="date">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select>
                        <option value="1">Tháng 1
                        </option>
                        <option value="2">Tháng 2
                        </option>
                        <option value="3">Tháng 3
                        </option>
                        <option value="4">Tháng 4
                        </option>
                        <option value="5">Tháng 5
                        </option>
                        <option value="6">Tháng 6
                        </option>
                        <option value="7">Tháng 7
                        </option>
                        <option value="8">Tháng 8
                        </option>
                        <option value="9">Tháng 9
                        </option>
                        <option value="10">Tháng 10
                        </option>
                        <option value="11">Tháng 11
                        </option>
                        <option value="12">Tháng 12
                        </option>
                    </select>
                    <input class="year" type="text" size="4" maxlength="4"/>Ví dụ 1976
                </p>     
                 <div><button class="button">ĐĂNG KÝ &raquo; </button></div>         
                </fieldset>
            
           
        </form>	
	</div>

	<footer>
		<div class="info">
			<img alt="logo" src="<c:url value = "resources/image/logo.png"/>">
			<h2 class="admin">Đặng Văn Trí</h2>
			<h2 class="admin">Nguyễn Đăng Song Tuyển</h2>
			<h2 class="admin">Võ Văn Trinh</h2>
			<h5>Copyright &reg; 2018-2019</h5>
		</div>
	</footer>
</body>
</html>