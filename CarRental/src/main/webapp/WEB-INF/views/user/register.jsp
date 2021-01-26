<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Please Insert Title</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>

<article>
	<!-- Contact Form Section Begin -->
	<section class="contact-from-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<h2>Register!</h2>
						<p>Fill out the form below to recieve a free and confidential
							intial consultation.</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-8 container">
					<form action="/user/register" class="comment-form contact-form" method="post">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						<div class="row">
							<div class="col-lg-8">
								<input type="text" name="user_id" placeholder="ID">
							</div>
							<div class="col-lg-4">
								<input type="hidden" placeholder="Email">
							</div>
							<div class="col-lg-4">
								<input type="password" name="user_password" placeholder="Password">
							</div>
							<div class="col-lg-4">
								<input type="password" placeholder="Password">
							</div>
							<div class="col-lg-4">
								<input type="hidden" placeholder="Phone">
							</div>
							<div class="col-lg-4">
								<input type="text" name="user_name" placeholder="name">
							</div>
							<div class="col-lg-12 text-center">
								<textarea placeholder="Messages"></textarea>
								<button type="submit" class="site-btn">Submit</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Contact Form Section End -->
</article>

<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
</html>