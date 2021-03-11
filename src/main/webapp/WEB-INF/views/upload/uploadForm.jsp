<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>UploadForm</title>
<%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>

<body>
<%@include file="/WEB-INF/views/module/loader.jsp"%>
<%@include file="/WEB-INF/views/module/header.jsp"%>

<article>

    <form action="/upload/uploadFormAction" method="post" enctype="multipart/form-data">
        <input type="file" name="uploadFile" multiple>
        <input type="submit" value="submit">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>

</article>

<%@include file="/WEB-INF/views/module/footer.jsp"%>
<%@include file="/WEB-INF/module/basic/js.jsp"%>
</body>
</html>