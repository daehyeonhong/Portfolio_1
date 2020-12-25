<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<c:set var="path" value="${requestScope['javax.servlet.forward.servlet_path']}" /> 
<!-- Header Section Begin -->
<header class="header-section">
	<div class="container">
		<div class="logo">
			<a href="/">
				<img src="/resources/basic/img/logo.png" alt="logo">
			</a>
		</div>
		<div class="nav-menu">
			<nav class="mainmenu mobile-menu">
				<ul>
					<li ${path=='/' ? 'class="active"' : '' }>
						<a href="/">홈</a>
					</li>
					<li ${path=='/short/list' ? 'class="active"' : '' }>
						<a href="/short/list">단기렌탈</a>
					</li>
					<li ${path=='/long/list' ? 'class="active"' : '' }>
						<a href="/long/list">장기렌탈</a>
					</li>
					<li ${path=='/sample/notice' ? 'class="active"' : '' }>
						<a href="/sample/notice">공지사항↡</a>
						<ul class="dropdown">
							<li><a href="#">Jayden</a></li>
							<li><a href="#">Sara</a></li>
							<li><a href="#">Emma</a></li>
							<li><a href="#">Harriet</a></li>
						</ul>
					</li>
				</ul>
			</nav>
			<sec:authorize access="isAnonymous()">
				<a href="/user/login" class="primary-btn top-btn">로그인</a>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
				<a href="/" class="primary-btn top-btn" id="logoutBtn" onclick="logout()">
					Logout
				</a>
				<form action="/logout" id="logoutForm" method="post" role="form">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</sec:authorize>
		</div>
		<div id="mobile-menu-wrap"></div>
	</div>
	<c:if test="${param.logout != null}">
		<script type="text/javascript">
			document.addEventListener("DOMContentLoaded", function(){
				alert('Logout 되었습니다.');
			});
		</script>
	</c:if>
</header>
<!-- Header End -->
<script type="text/javascript">
	document.getElementById('logoutBtn').onclick = function() {
		document.getElementById('logoutForm').submit();
		return false;
	}
</script>