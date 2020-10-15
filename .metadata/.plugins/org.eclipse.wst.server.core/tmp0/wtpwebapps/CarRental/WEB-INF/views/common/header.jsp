<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<header>
	<%@ include file="/WEB-INF/views/common/info.jsp"%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light" id="ftco-navbar">
		<div class="container d-flex align-items-center">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#ftco-nav" aria-controls="ftco-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="fa fa-bars"></span> Menu
			</button>
			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav m-auto">
					<li class="nav-item active">
						<a href="/" class="nav-link">Home</a>
					</li>
					<li class="nav-item">
						<a href="/long/list" class="nav-link">LONGTERM</a>
					</li>
					<li class="nav-item">
						<a href="/short/inlandList" class="nav-link">SHORTTERM</a>
					</li>
					<sec:authorize access="isAnonymous()">
						<li class="nav-item">
							<a href="/user/login" class="nav-link">LOGIN</a>
						</li>
					</sec:authorize>
					<sec:authorize access="isAuthenticated()">
						<li class="nav-item">
							<a href="/user/logout" class="nav-link">LOGOUT</a>
						</li>
					</sec:authorize>
					<li class="nav-item cta">
						<a href="contact.html" class="nav-link">Request A Quote</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->
</header>