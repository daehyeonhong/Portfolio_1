<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<header>
	<%@ include file="/WEB-INF/views/common/info.jsp"%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light" id="ftco-navbar">
		<div class="container d-flex align-items-center">
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="fa fa-bars"></span> Menu
			</button>
			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav m-auto">
					<li class="nav-item active">
						<a href="/" class="nav-link">Home</a>
					</li>
					<li class="nav-item">
						<a href="/long/list" class="nav-link">장기 렌탈</a>
					</li>
					<li class="nav-item">
						<a href="/short/inlandList" class="nav-link">단기 렌탈</a>
					</li>
					<sec:authorize access="isAnonymous()">
					</sec:authorize>
					<sec:authorize access="isAuthenticated()">
						<li class="nav-item">
							<a href="/" class="nav-link" id="logoutBtn" onclick="logout()">LOGOUT</a>
							<form id="logoutForm" action="/logout" method="post" role="form">
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							</form>
						</li>
					</sec:authorize>
					<li class="nav-item">
						<a href="/customer/notice/list" class="nav-link">고객센터</a>
					</li>
					<li class="nav-item cta">
						<a href="/customer/service/general" class="nav-link">상담</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->
	<c:if test="${param.logout != null}">
		<script type="text/javascript">
			document.addEventListener("DOMContentLoaded", function(){
				alert('Logout 되었습니다.');
			});
		</script>
	</c:if>
</header>
<script type="text/javascript">
	document.getElementById('logoutBtn').onclick = function() {
			document.getElementById('logoutForm').submit();
			return false;
		}
</script>