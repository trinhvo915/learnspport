<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<jsp:include page="header/header.jsp"/>
</head>
<body>
	<header id="#header">
		<div class="logo">
			<a href="/learnsupport/">
				<img src="<c:url value = "resources/image/logo.png"/>">
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
    			<a href="dangky">Register</a>
    			<a href="dangnhap">Log in</a>
			</div>
	</header>
	<div id="content">
		
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
 			 <ol class="carousel-indicators">
   				 <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    			<li data-target="#myCarousel" data-slide-to="1"></li>
   				 <li data-target="#myCarousel" data-slide-to="2"></li>
 			</ol>

  <!-- Wrapper for slides -->
 			<div class="carousel-inner">
    			<div class="item active">
     				 <img class = "image_slide" src="<c:url value = "resources/image/slide0.jpg"/>" alt="Los Angeles">
   			 	</div>

    			<div class="item">
      				<img class = "image_slide"  src="<c:url value = "resources/image/slide1.jpg"/>" alt="Chicago">
  			    </div>

    			<div class="item">
     			    <img class = "image_slide" src="<c:url value = "resources/image/slide2.jpg"/>" alt="New York">
    			</div>
  			</div>

  <!-- Left and right controls -->
  			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
    			<span class="glyphicon glyphicon-chevron-left"></span>
   				<span class="sr-only">Previous</span>
 			</a>
  			<a class="right carousel-control" href="#myCarousel" data-slide="next">
    			<span class="glyphicon glyphicon-chevron-right"></span>
    			<span class="sr-only">Next</span>
  			</a>
		</div>
		<div id="menu_bar">
			 <nav class="navbar navbar-default" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
		        <div class="navbar-header">
		          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
		            <span class="sr-only">Toggle navigation</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>
		        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
		        <div class="collapse navbar-collapse navbar-ex1-collapse">
		          <ul class="nav navbar-nav">
		            <li><a href="#">TOÁN HỌC</a></li>
		            <li><a href="#">NGỮ VĂN</a></li>
		            <li><a href="#">ANH VĂN</a></li>
		            <li><a href="#">VẬT LÝ</a></li>
		            <li><a href="#">HÓA HỌC</a></li>
		            <li><a href="#">LỊCH SỬ</a></li>
		            <li><a href="#">ĐỊA LÝ</a></li>
		            <li><a href="#">SINH HỌC</a></li>
		            <li><a href="#">ÂM NHẠC</a></li>
		            <li><a href="#">NGỮ VĂN</a></li>
		            <li><a href="#">MỸ THUẬT</a></li>
		          </ul>
		        </div><!-- /.navbar-collapse -->
		     </nav>
		</div>
		<div id="list_baihoc">
			<div class="row">
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai1.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Học làm người tốt</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai2.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Làm người tốt khó lắm</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai3.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Khó thì mới phải học</h3>
						</a>
					</div>
					
				</div>
			</div>
			<div class="row">
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai4.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Có ích gì mà học</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai5.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Giúp đời giúp nước giúp thế giới</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai6.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Thật là cao cả!!!!!!!</h3>
						</a>
					</div>
					
				</div>
			</div>
			<div class="row">
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai7.jpg"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Bắt đầu bài học nào</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai8.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Học làm người tốt</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai9.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Các nguyên tắc cơ bản của người tốt</h3>
						</a>
					</div>
					
				</div>
			</div>
			<div class="row">
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai10.jpg"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Làm việc tốt</h3>
							<span></span>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai11.png"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Đấu tranh chống việc xấu</h3>
						</a>
					</div>
					
				</div>
				<div class="post_item">
					<div class="border_item">
						<a href="#">
							<img src="<c:url value = "resources/image/bai12.jpg"/>">
							<h2 class="tac_gia">Đặng Văn Trí</h2>
							<h3 class="tieu_de">Bạn đã là người tốt??</h3>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</div>

	<footer>
		<div class="info">
			<img src="<c:url value = "resources/image/logo.png"/>">
			<h2 class="admin">Đặng Văn Trí</h2>
			<h2 class="admin">Nguyễn Đăng Song Tuyển</h2>
			<h2 class="admin">Võ Văn Trinh</h2>
			<h5>Copyright &reg; 2018-2019</h5>
		</div>
	</footer>
</body>
</html>