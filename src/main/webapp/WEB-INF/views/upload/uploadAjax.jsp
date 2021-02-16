<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>UploadAjax</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
<script defer src="/resources/js/upload/uploadAjax.js"></script>
</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>

<article>

	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	
	<button id="uploadBtn">Upload</button>

</article>

<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
</html>