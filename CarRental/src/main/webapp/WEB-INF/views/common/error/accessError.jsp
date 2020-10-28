<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<article>
	<h2>${SPRING_SECURITY_403_EXCEPTION.getMessage()}</h2>
	<h2>${msg}</h2>
</article>