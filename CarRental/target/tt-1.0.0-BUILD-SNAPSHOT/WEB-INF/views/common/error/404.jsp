<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TTRENTAL :: 404 Error</title>
<%@ include file="/WEB-INF/views/common/css.jsp"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Cabin:400,700"
	rel="stylesheet">

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="/resources/error/css/style.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<article>
		<div id="notfound">
			<div class="notfound">
				<div class="notfound-404">
					<div></div>
					<h1>404</h1>
				</div>
				<h2>Page not found</h2>
				<p>The page you are looking for might have been removed had its
					name changed or is temporarily unavailable.</p>
				<a href="/">home page</a>
			</div>
		</div>
	</article>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	<%@include file="/WEB-INF/views/common/loader.jsp"%>
	<%@include file="/WEB-INF/views/common/js.jsp"%>
</body>
</html>