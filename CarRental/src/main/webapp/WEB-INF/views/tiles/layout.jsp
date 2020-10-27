<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<title>어쩌고 렌터카</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<tiles:insertAttribute name="css" />
<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="body">
		<tiles:insertAttribute name="body" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
	<div id="loader">
		<tiles:insertAttribute name="loader" />
	</div>
<tiles:insertAttribute name="script" />
</body>
</html>