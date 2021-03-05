<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>JsRenderPage</title>
    <%@include file="/WEB-INF/module/basic/css.jsp"%>
</head>

<body>
    <%@include file="/WEB-INF/views/module/loader.jsp"%>
    <%@include file="/WEB-INF/views/module/header.jsp"%>

    <article>
        <table>
            <tbody>
                <tr>
                    <td>Name</td>
                    <td>{{:name}}</td>
                </tr>
            </tbody>
        </table>
    </article>

    <%@include file="/WEB-INF/views/module/footer.jsp"%>
    <%@include file="/WEB-INF/module/basic/js.jsp"%>
    <script src="https://www.jsviews.com/download/jsviews.min.js"></script>
    <script type="text/javascript" src="/resources/js/test/jsRender.js"></script>
</body>

</html>