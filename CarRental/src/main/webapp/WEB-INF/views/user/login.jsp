<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<%@include file="/WEB-INF/module/user/css.jsp"%>
	<%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>
<body>
	<%@include file="/WEB-INF/views/module/header.jsp"%>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('/resources/user/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form" action="/login" method="post">
					<span class="login100-form-title p-b-49">Account Login</span>

					<span class="login100-form-title p-b-49">${error}</span>
					<span class="login100-form-title p-b-49">${logout}</span>
					<span class="login100-form-title p-b-49">${SPRING_SECURITY_403_EXCEPTION.getMessage()}</span>
					<span class="login100-form-title p-b-49">${msg}</span>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
						<span class="label-input100">Username</span>
						<input class="input100" type="text" name="username" placeholder="Type your username">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="password" placeholder="Type your password">
						<span class="focus-input100" data-symbol="&#xf190;"></span>
					</div>
					
					<div class="text-right p-t-8 p-b-31">
						<a href="#">
							Forgot password?
						</a>
					</div>
					
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								Login
							</button>
						</div>
					</div>

					<div class="flex-col-c p-t-155">
						<span class="txt1 p-b-17">
							Or Sign Up Using
						</span>

						<a href="/user/register" class="txt2">
							Sign Up
						</a>
					</div>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>
	<div id="dropDownSelect1"></div>
	<%@include file="/WEB-INF/views/module/footer.jsp"%>
	<%@include file="/WEB-INF/module/basic/js.jsp"%>
	<%@include file="/WEB-INF/module/user/js.jsp"%>
</body>
</html>