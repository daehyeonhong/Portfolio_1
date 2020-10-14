<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TTRENTAL :: AccessError</title>
<%@ include file="/WEB-INF/views/common/css.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<article>
		<h2>${SPRING_SECURITY_403_EXCEPTION.getMessage()}</h2>
		<h2>${msg}</h2>
	</article>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	<%@include file="/WEB-INF/views/common/loader.jsp"%>
	<%@include file="/WEB-INF/views/common/js.jsp"%>
</body>
</html>