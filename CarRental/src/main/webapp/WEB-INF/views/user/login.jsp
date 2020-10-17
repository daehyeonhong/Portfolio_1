<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>TT RENTAL :: Login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/WEB-INF/views/common/login/css.jsp"%>
<%@ include file="/WEB-INF/views/common/css.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-50">
				<form class="login100-form validate-form" action="/login" method="post">
					<span class="login100-form-title p-b-33">Account Login</span>
					<h2>${error}</h2>
					<h2>${logout}</h2>
					<h2>${SPRING_SECURITY_403_EXCEPTION.getMessage()}</h2>
					<h2>${msg}</h2>
					<div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="username" placeholder="username">
						<span class="focus-input100-1"></span>
						<span class="focus-input100-2"></span>
					</div>

					<div class="wrap-input100 rs1 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="password"
							placeholder="Password"> <span class="focus-input100-1"></span>
						<span class="focus-input100-2"></span>
					</div>

					<div class="container-login100-form-btn m-t-20">
						<button class="login100-form-btn">Sign in</button>
					</div>

					<div class="text-center p-t-45 p-b-4">
						<span class="txt1"> Forgot </span> <a href="#" class="txt2 hov1">
							Username / Password? </a>
					</div>

					<div class="text-center">
						<span class="txt1"> Create an account? </span> <a href="#"
							class="txt2 hov1"> Sign up </a>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	<%@include file="/WEB-INF/views/common/loader.jsp"%>
	<%@include file="/WEB-INF/views/common/js.jsp"%>
	<%@include file="/WEB-INF/views/common/login/js.jsp"%>
</body>
</html>