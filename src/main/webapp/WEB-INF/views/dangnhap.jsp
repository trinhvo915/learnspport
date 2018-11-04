<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head> 
	  <title>Login</title>
	  <meta charset="utf-8">
	  <jsp:include page="header/header.jsp"/>
	</head>
	<body id="bodySS">
	    <div class="container" "> 
	        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
	            <div class="panel panel-info" >
	                <div class="panel-heading">
	                    <div class="panel-title">Sign In</div>
	                    <!-- <div style="float:right; font-size: 80%; position: relative; top:-10px">
	                    	<a href="#">Forgot password?</a>
	                    </div> -->
	                </div>     

	                <div style="padding-top:30px" class="panel-body" >

	                    <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"> 	
	                    </div>
	            <!--  form login đăng nhập  -->       
	                    <form id="loginform" class="form-horizontal" role="form" action="dangnhap" method="POST">
	                                
	                        <div style="margin-bottom: 25px" class="input-group">
	                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
	                            <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username">                                        
	                        </div>
	                            
	                        <div style="margin-bottom: 25px" class="input-group">
	                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	                            <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
	                        </div>
	                
	                        <div class="input-group">
	                            <div class="checkbox">
	                                <label>
	                                  <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
	                                </label>
	                                <label style="float: right;  position: relative; ">
				                    	<a href="#">Forgot password?</a>
				                	</label>
	                            </div>
	                        </div>

	                        <div style="margin-top:10px" class="form-group">
	                            <!-- Button -->
	                            <div class="col-sm-12 controls">
	                              <button id="btn-login" href="#" class="btn btn-success" style="submit">Login</button>
	                              <button id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</button>

	                            </div>
	                        </div>

	                        <div class="form-group">
	                            <div class="col-md-12 control">
	                                <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
	                                	<div >
			                                <span style="padding-left: 0px; font-size:150%">
			                                 <strong>Don't have an account !</strong> 
			                                </span>
			                                <button d="btn-sigin" style=" margin-left: 20px" type="button" class="btn btn-warning" >
			                                	<a href="dangky">Sign Up Here</a> 
			                                	<button style ="margin-left: 20px" type="button" class="btn btn-danger"><a href="/learnsupport/">BACK</a> </button>
			                                </button>
	                           			</div>     
	                                </div>
	                            </div>
	                        </div>    
	                    </form> 
	            <!--  form login đăng nhập  -->     
	                </div>                     
	            </div>  
	        </div>
	    </div>
	    
	</body>
</html>
