<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Error</title>

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:200,400,700" rel="stylesheet">

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="/resources/404/css/style.css" />
<%@include file="/WEB-INF/module/basic/css.jsp"%>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>
	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>Oops!</h1>
				<h2>404 - The Page can't be found</h2>
			</div>
			<a href="/">Go TO Homepage</a>
		</div>
	</div>
<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>