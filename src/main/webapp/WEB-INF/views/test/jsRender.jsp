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
        <div id="result"></div>

        <script id="theTmpl" type="text/x-jsrender">
            <div>
                <em>Name:</em> {{:name}}
                {{if showNickname && nickname}}
                (Goes by <em>{{:nickname}}</em>)
                {{/if}}
            </div>
        </script>

        <script>
            var data = [{
                "name": "Robert",
                "nickname": "Bob",
                "showNickname": true
            }, {
                "name": "Susan",
                "nickname": "Sue",
                "showNickname": false
            }];
            var template =
                $.templates("#theTmpl");
            var htmlOutput = template.render(data);
            $("#result").html(htmlOutput);
        </script>
    </article>

    <%@include file="/WEB-INF/views/module/footer.jsp"%>
    <%@include file="/WEB-INF/module/basic/js.jsp"%>
    <script src="https://www.jsviews.com/download/jsviews.min.js"></script>
    <script type="text/javascript" src="/resources/js/test/jsRender.js"></script>
</body>

</html>