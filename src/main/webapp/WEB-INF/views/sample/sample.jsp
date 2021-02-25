<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Sample</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>

<body>
	<%@include file="/WEB-INF/views/module/loader.jsp"%>
	<%@include file="/WEB-INF/views/module/header.jsp"%>

	<article>
		<div class="newslatter-inner set-bg">
			<form action="/rest" method="post" class="ni-form">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<input type="text" id="user_id" placeholder="number" />
				<button type="submit">Subscribe</button>
			</form>
		</div>
	</article>

	<%@include file="/WEB-INF/views/module/footer.jsp"%>
	<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>

</html>