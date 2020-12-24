<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Please Insert Title</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
<%@include file="/WEB-INF/module/table/css.jsp"%>
</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>

<article>
	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<h2>공지사항</h2>
						<div class="bt-option">
							<a href="/">Home</a> <span>Our Schedule</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Schedule Table Section Begin -->
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
					<div class="table">

						<div class="row header">
							<div class="cell">
								Full Name
							</div>
							<div class="cell">
								Age
							</div>
							<div class="cell">
								Job Title
							</div>
							<div class="cell">
								Location
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Vincent Williamson
							</div>
							<div class="cell" data-title="Age">
								31
							</div>
							<div class="cell" data-title="Job Title">
								iOS Developer
							</div>
							<div class="cell" data-title="Location">
								Washington
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Joseph Smith
							</div>
							<div class="cell" data-title="Age">
								27
							</div>
							<div class="cell" data-title="Job Title">
								Project Manager
							</div>
							<div class="cell" data-title="Location">
								Somerville, MA
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Justin Black
							</div>
							<div class="cell" data-title="Age">
								26
							</div>
							<div class="cell" data-title="Job Title">
								Front-End Developer
							</div>
							<div class="cell" data-title="Location">
								Los Angeles
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Sean Guzman
							</div>
							<div class="cell" data-title="Age">
								25
							</div>
							<div class="cell" data-title="Job Title">
								Web Designer
							</div>
							<div class="cell" data-title="Location">
								San Francisco
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Keith Carter
							</div>
							<div class="cell" data-title="Age">
								20
							</div>
							<div class="cell" data-title="Job Title">
								Graphic Designer
							</div>
							<div class="cell" data-title="Location">
								New York, NY
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Austin Medina
							</div>
							<div class="cell" data-title="Age">
								32
							</div>
							<div class="cell" data-title="Job Title">
								Photographer
							</div>
							<div class="cell" data-title="Location">
								New York
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Vincent Williamson
							</div>
							<div class="cell" data-title="Age">
								31
							</div>
							<div class="cell" data-title="Job Title">
								iOS Developer
							</div>
							<div class="cell" data-title="Location">
								Washington
							</div>
						</div>

						<div class="row">
							<div class="cell" data-title="Full Name">
								Joseph Smith
							</div>
							<div class="cell" data-title="Age">
								27
							</div>
							<div class="cell" data-title="Job Title">
								Project Manager
							</div>
							<div class="cell" data-title="Location">
								Somerville, MA
							</div>
						</div>

					</div>
			</div>
		</div>
	</div>
	<!-- Schedule Table Section End -->
</article>

<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/table/js.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
</html>